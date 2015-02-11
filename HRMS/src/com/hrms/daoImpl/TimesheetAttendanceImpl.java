package com.hrms.daoImpl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;



import com.hrms.bDhelper.DBhelper;
import com.hrms.dao.TimesheetAttendanceDao;
import com.hrms.model.TimesheetAttendance;



public class TimesheetAttendanceImpl implements TimesheetAttendanceDao
{

	EntityManagerFactory emf = null;
	EntityManager    em = null;
	
	Calendar startTime = Calendar.getInstance();
	Calendar endTime = Calendar.getInstance();
	
	@Override
	public Long saveTimesheetAttendance(TimesheetAttendance timesheetAttendance) {
		
		emf=DBhelper.provideEntity();
		em=emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(timesheetAttendance);
		em.getTransaction().commit();
		em.close();			
		return timesheetAttendance.getTimesheetAttendanceId();
	}
	@Override
	public List<TimesheetAttendance> getTimesheetAttendance(Long timesheetAttendanceId) {
		
		emf=DBhelper.provideEntity();
		em=emf.createEntityManager();
		
		TypedQuery<TimesheetAttendance> query = em.createQuery("from Department d",TimesheetAttendance.class);
		List<TimesheetAttendance> results = query.getResultList();
		return results;
	}

	@Override
	public Long updateTimesheetAttendance(TimesheetAttendance timesheetAttendance) {
		
		
		
		return timesheetAttendance.getTimesheetAttendanceId();
	}

	@SuppressWarnings("static-access")
	@Override
	public int calculateNormalHoursWorked(Date startDateHour, Date endDateHour) {
		
		int totalHoursWorked = 0;
		int startHour = 0;
		int endHour = 0;
						
		startTime.setTime(startDateHour);
		endTime.setTime(endDateHour);
				
		startHour = (startTime.getActualMaximum(startTime.HOUR) +1) - startTime.get(startTime.HOUR);
		endHour =  endTime.get(endTime.HOUR);
						
		totalHoursWorked = endHour + startHour;
				
		return totalHoursWorked;
	}

	@SuppressWarnings("static-access")
	@Override
	public int addNormalMinutesWorked(Date startingMinute, Date endingMinute) {
		
		int totalMinutesWorked = 0;
				
		startTime.setTime(startingMinute);
		endTime.setTime(endingMinute);
		
		totalMinutesWorked = startTime.get(startTime.MINUTE) + endTime.get(endTime.MINUTE);
		
		return totalMinutesWorked;
	}

	@Override
	public int minusNormalHours(int totalHours) {
		
		int normalHours = 9;
		int actualHoursWorked = 0;
				
		if((totalHours < normalHours) || (totalHours == normalHours))
		{
			actualHoursWorked = totalHours;
		}	
		return actualHoursWorked;
	}

	@Override
	public int minusOverTimeHours(int totalHours) {

		int normalHours = 9;
		int overtimeWorked = 0;
		
		if(totalHours > normalHours)
		{
			overtimeWorked = totalHours - normalHours;
		}
				
		return overtimeWorked;
	}

	@Override
	public int calculateMinutesToHoursWoked(int totalMinutes) {

		int minuteToHours = 0;
		int standardMinutes = 60;
		
		if((totalMinutes > standardMinutes)||(totalMinutes == standardMinutes))
		{
			minuteToHours = totalMinutes/standardMinutes;
		}
		
		return minuteToHours;
	}
	@Override
	public List<TimesheetAttendance> getTimesheetAttendanceList() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
