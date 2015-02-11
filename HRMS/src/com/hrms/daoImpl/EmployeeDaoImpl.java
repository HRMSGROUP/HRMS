package com.hrms.daoImpl;

import java.util.List;



import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.hrms.dao.EmployeeDoa;
import com.hrms.model.Employee;

public class EmployeeDaoImpl implements EmployeeDoa{
	
	 //creates a persistence unit by providing the same unique name which we provide for persistence-unit in persistent.xml file
	 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("persistence");
	 //entitymanagerfactory object creates the entitymanger instance by using createEntityManager () method
	 EntityManager entitymanager = emfactory.createEntityManager( );	
	 
	 @Override
	 public long registerEmployee( String firstName, String lastName, String identityNumber,
				String title, String email, String contactNumber,
				String institution, String qualification, String position,
				String password, String empType) 
	   { 	 
		 entitymanager.getTransaction( ).begin( );
		 Employee employee = new Employee(  firstName,  lastName,  identityNumber,
					 title,  email,  contactNumber,
					 institution,  qualification,  position,
					 password,  empType);	
		entitymanager.persist( employee );			   		
		entitymanager.getTransaction( ).commit( );
		entitymanager.close( );
		emfactory.close( );
			   					   				
		return employee.getEmpNumber();
	   }
	 
	@Override
	 public List<Employee> employeeList() {

		     TypedQuery<Employee> query = entitymanager.createQuery("from Employee", Employee.class);
			 List<Employee> employee = query.getResultList();
			 
			 return employee;	

	}
		
	@Override
	public boolean updateEmployee( Long empNumber,String firstName, String lastName, String identityNumber, String title, String email, String contactNumber,
			String institution, String qualification, String position, String empType) 
	{
		boolean status = false;
		try{
			entitymanager.getTransaction( ).begin( );
		   	
	   		Query query =  entitymanager.createQuery("Update Employee employee Set employee.firstName = :Name, employee.identityNumber = :IdentityNumber, employee.lastName = :LastName, employee.title = :Title, employee.email = :Mail, employee.empType = :EmpType, employee.institution = :Institution, employee.qualification = :Qualification, employee.position = :Position where employee.empNumber = :EmpNumber");
	   		query.setParameter("EmpNumber",empNumber);
	   		query.setParameter("Name",firstName);	
			query.setParameter("IdentityNumber",identityNumber);
		 	query.setParameter("LastName", lastName);
		 	query.setParameter("Mail", email);
		 	query.setParameter("Title", title);
		 	query.setParameter("Institution", institution);
		 	query.setParameter("Qualification", qualification);
		 	query.setParameter("Position", position);
		 	query.setParameter("EmpType", empType);
		 	int employee = query.executeUpdate();
		 	if(employee >= 1 ){
		 		status=true;
		 	}

		 	entitymanager.getTransaction( ).commit( );
		 	entitymanager.close();
		   	emfactory.close();
		 	
			}
			catch(Exception e){
				  e.printStackTrace();
			}
			   return status;
	   }
	@Override	
	public boolean DeleteEmployee( Long empNumber )
	{
		boolean status = false;
			try{
			
				  entitymanager.getTransaction( ).begin( );
				   		
				  Employee employee = entitymanager.find( Employee.class, empNumber );
				  entitymanager.remove( employee );
				  entitymanager.getTransaction( ).commit( );
				  entitymanager.close( );
				  emfactory.close( );
			   	}
			   	catch(Exception e){
			   		e.printStackTrace();
			  }
		return status;
	}	
	
	@Override
	public boolean SendMail(String email) {
		boolean status = false;
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("json.ajax2@gmail.com", "thabiso74239");
			}
		  });
 
		try {
 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("json.ajax2@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(email));
			message.setSubject("Registration Confirmation");
			message.setText("Dear Employee, this confirms your ragistration process with The Company,"
				+ "\n\n we welcome you to your new position and hope we'll benefit a lot on working with you. " + "\n\n"+"Regards"+"\n"+"Company stuff");
	 
			Transport.send(message);
			status=true;
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
			
		}
		return status;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean login(String email, String password, String empType){
		boolean status = false;
		 try{
			 				
			 	Query query = entitymanager.createQuery("from Employee where email = :Mail and password = :Password and empType = :EmpType");
			 	query.setParameter("Mail", email);
			 	query.setParameter("Password", password);
			 	query.setParameter("EmpType", empType);
			 	
			 	List<Employee> employees = query.getResultList();
	 
			 	if(employees.size()>=1)
			 	{
			 		status=true;
			 	}
			 	
		 	}
	   		catch(Exception e){
	   			e.printStackTrace();
	   		}
		 return status;
	}
			
}
