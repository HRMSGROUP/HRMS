package com.hrms.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONException;

import com.hrms.daoImpl.TimesheetAttendanceImpl;
import com.hrms.model.TimesheetAttendance;
import com.sun.jersey.api.client.ClientResponse.Status;



@Path("/TimesheetService")
public class TimesheetService {
	
	TimesheetAttendanceImpl timesheetAttendanceImpl=new TimesheetAttendanceImpl();
	@GET
	@Path("/ViewAllTimesheet")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TimesheetAttendance> viewAllTimesheet()throws  JSONException{
/*		List<TimesheetAttendance>timesheetAttendanceList=timesheetAttendanceImpl.getTimesheetAttendanceList();
		
		JSONArray jsonArray = new JSONArray();
		
		for(int i=0;i<timesheetAttendanceList.size();i++)
		{
			JSONObject timesheetObject = new JSONObject();
			
			timesheetObject.put("timesheetAttendanceId", timesheetAttendanceList.get(i).getTimesheetAttendanceId());
			timesheetObject.put("hoursWorkedPerDay", timesheetAttendanceList.get(i).getHoursWorkedPerDay());
			timesheetObject.put("overtimeHoursWorkedPerDay", timesheetAttendanceList.get(i).getOvertimeHoursWorkedPerDay());
			timesheetObject.put("startofWorkTime", timesheetAttendanceList.get(i).getStartofWorkTime());
			timesheetObject.put("endofWorkTime", timesheetAttendanceList.get(i).getEndofWorkTime());
			
		
			jsonArray.put(timesheetObject);

		
	}
		return jsonArray.toString() ;
	}*/
		return timesheetAttendanceImpl.getTimesheetAttendanceList();
	}
	@Path("/SaveAttendance")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON})
	@Produces({ MediaType.APPLICATION_JSON})
	public Response saveAttendance(TimesheetAttendance timesheetAttendance){
		 System.out.println("invoked...");
		 return Response.status(Status.CREATED).entity(timesheetAttendance).build();
		 
		}
	@PUT
	@Path(value="/updateAttendance")
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateCommission(TimesheetAttendance timesheetAttendance){
		timesheetAttendanceImpl.updateTimesheetAttendance(timesheetAttendance);
		return Response.status(200).build();
	}
	@GET
	@Path(value="{timesheetAttendanceId}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCommission(@PathParam("timesheetAttendanceId")Long timesheetAttendanceId){
		TimesheetAttendance timesheetAttendance=(TimesheetAttendance) timesheetAttendanceImpl.getTimesheetAttendance(timesheetAttendanceId);
		return timesheetAttendance.toString();
		
	}
	
}
