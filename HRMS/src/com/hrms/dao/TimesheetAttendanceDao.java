package com.hrms.dao;

import java.util.Date;
import java.util.List;

import com.hrms.model.TimesheetAttendance;



public interface TimesheetAttendanceDao {

	Long saveTimesheetAttendance(TimesheetAttendance timesheetAttendance);
	List<TimesheetAttendance> getTimesheetAttendance(Long timesheetAttendanceId);
	Long updateTimesheetAttendance(TimesheetAttendance timesheetAttendance);
	List<TimesheetAttendance> getTimesheetAttendanceList();
	
	int calculateNormalHoursWorked(Date startHour,Date endHour);
	int addNormalMinutesWorked(Date startingMinute,Date endingMinute);
	
	int minusNormalHours(int totalHours);
	int minusOverTimeHours(int totalHours);
	
	int calculateMinutesToHoursWoked(int totalMinutes);
	
}
