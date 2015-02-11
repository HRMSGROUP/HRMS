package com.hrms.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;




import com.hrms.daoImpl.DepartmentDaoIpml;
import com.hrms.model.Department;
import com.sun.jersey.api.client.ClientResponse.Status;
@Path("/departments")
public class DepartmentService {
	
    DepartmentDaoIpml dep = null;
	
	@GET
	@Path("/list")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Department> findAll() {
		dep = new DepartmentDaoIpml();
		return  dep.listDepartments();
	}
	@Path("/addDepartment")	
	@POST
	@Consumes({ MediaType.APPLICATION_JSON})
	@Produces({ MediaType.APPLICATION_JSON})	
	public Response saveUsers(Department dept){
		System.out.println("method invoked...");
	   return Response.status(Status.CREATED).entity(dept).build();
	}
	
	@PUT
	@Path("{id}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Department updateApplicant(Department department)	{		
		return department;	
	}
	@DELETE 
	@Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void deleteApplicant(@PathParam("id") Long depid) {
		dep = new DepartmentDaoIpml();
		dep.deleteDepartment(depid);
	}

}
