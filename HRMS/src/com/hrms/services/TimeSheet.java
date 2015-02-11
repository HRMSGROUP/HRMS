package com.hrms.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.hrms.daoImpl.TimesheetAttendanceImpl;
import com.hrms.model.TimesheetAttendance;
import com.sun.jersey.api.client.ClientResponse.Status;

@Path("/timesheet")
public class TimeSheet {
	   TimesheetAttendanceImpl time = null;
	    @Path("/list")
		@GET
		@Consumes({ MediaType.APPLICATION_JSON})
		@Produces({ MediaType.APPLICATION_JSON })
		public List<TimesheetAttendance> findAll() {
			time = new TimesheetAttendanceImpl();
			return  time.getTimesheetAttendanceList();
		}
		@Path("/addAttendance")	
		@POST
		@Consumes({ MediaType.APPLICATION_JSON})
		@Produces({ MediaType.APPLICATION_JSON})	
		public Response saveUsers(TimesheetAttendance attendance){
			time = new TimesheetAttendanceImpl();
		    return Response.status(Status.CREATED).entity(attendance).build();
		}
}
