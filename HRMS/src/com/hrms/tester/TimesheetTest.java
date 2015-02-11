package com.hrms.tester;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.hrms.daoImpl.TimesheetAttendanceImpl;
import com.hrms.model.TimesheetAttendance;



public class TimesheetTest {

	
	
	Long tsaId = null;
	
	TimesheetAttendance tsa = null;
	TimesheetAttendance tsaHolder = null;
	TimesheetAttendanceImpl tsaImpl = null;
	
	ArrayList<TimesheetAttendance> tsaList = null;
	
	Calendar time1 = null;
	Calendar time2 = null;
	
	Date date1 = null;
	Date date2 = null;
	
	
	@Before
	public void setupTimeSheet()
	{
		 time1 = Calendar.getInstance();
		 time2 = Calendar.getInstance();
		
		 time1.set(2014, Calendar.AUGUST, Calendar.DATE, 8, 40);
		 time2.set(2014, Calendar.AUGUST, Calendar.DATE, 15, 20);
		 
		 date1 = time1.getTime();
		 date2 = time2.getTime();
	 
		 tsaImpl = new TimesheetAttendanceImpl();
		 
		 tsa = new TimesheetAttendance();
				
		 tsa.setStartTime("2014/08/05 03:20:29 PM");
		 tsa.setEndTime("2014/08/05 03:20:29 PM");
		 tsa.setOvertimeHoursWorkedPerDay(8);
		
	/*	 tsa.setEmployee(null);
		 tsa.setEmployee(null);
		 tsa.setPayroll(null);*/
		
	}

	@Test
	public void saveTimesheet() {

		tsaId = tsaImpl.saveTimesheetAttendance(tsa);
		
		assertTrue(tsaId > 0L);
		
	}
	
	@Test
	public void getTimesheet()
	{
				
		//tsaHolder = tsaImpl.getTimesheetAttendance(16L);
		/*
		int hours = tsaImpl.calculateNormalHoursWorked(tsaHolder.getStartofWorkTime(), tsaHolder.getEndofWorkTime());
		
		int minutes = tsaImpl.addNormalMinutesWorked(tsaHolder.getStartofWorkTime(), tsaHolder.getEndofWorkTime());
		
		int minutesToHours = tsaImpl.calculateMinutesToHoursWoked(minutes);
		
		int totalHours = hours + minutesToHours;
		
		int actualHours = tsaImpl.minusNormalHours(totalHours);
		
		int overtimeHours = tsaImpl.minusOverTimeHours(totalHours);
		
		System.out.println(actualHours+" : " +minutesToHours+" :h -->  "+totalHours +" :h --> "+overtimeHours);*/
	}
	
}
