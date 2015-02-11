package com.hrms.services;

import java.util.Date;
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

import com.hrms.daoImpl.ApplicantDaoImpl;
import com.hrms.model.Applicant;
import com.sun.jersey.api.client.ClientResponse.Status;

@Path("/ApplicantService")
public class ApplicantService {
	
	ApplicantDaoImpl applicantDao = new ApplicantDaoImpl();
	
	@GET
	@Path("/list")
	//@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Applicant> findAll() {
		
		return  applicantDao.listApplicant();
	}

	@POST
	@Path("/addApplicant")	
	@Produces({ MediaType.APPLICATION_JSON})	
	public Response saveApplicant(Applicant applicant){
		
		applicantDao = new ApplicantDaoImpl();
		applicantDao.saveApplicant(applicant);
	return Response.status(Status.CREATED).entity(applicant).build();
	}
	
	@PUT
	@Path("{id}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Applicant updateApplicant(Applicant applicant)	{
		
		return applicant;	
	}
	@DELETE 
	@Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void deleteApplicant(@PathParam("id") Long appid) {
		applicantDao.deleteApplicant(appid);
	}

}
