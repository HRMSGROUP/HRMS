package com.hrms.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hrms.daoImpl.TimesheetAttendanceImpl;
import com.hrms.model.TimesheetAttendance;

@Path("/testr")
public class test {
@GET
@Path("/view")
@Consumes({ MediaType.APPLICATION_JSON})
@Produces({ MediaType.APPLICATION_JSON })
public List<TimesheetAttendance>  showOff(){
	TimesheetAttendanceImpl time = new TimesheetAttendanceImpl();
	return  time.getTimesheetAttendanceList();
}
}
