package com.hrms.model;



import java.io.Serializable;
import java.util.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "tblTimesheetAttendance")
@XmlRootElement
public class TimesheetAttendance implements Serializable
{

	private static final long serialVersionUID = -4639650999049243803L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "timesheetId_tbl")
	private Long timesheetAttendanceId;
	
	//@Temporal(TemporalType.TIMESTAMP)
	//@Column(name = "starttime_tbl")
	private String startTime;
	
	//@Temporal(TemporalType.TIMESTAMP)
	//@Column(name = "endTime_tbl")
	private String endTime;
	
	//@Column(name = "hoursworked_tbl")
	private int hoursWorkedperDay;
	
	//@Column(name = "overtimeperday_tbl")
	private int overtimeHoursWorkedPerDay;
	
	/**
	 * 
	 */
	public TimesheetAttendance() {
	}
	
	/**
	 * @return the timesheetAttendanceId
	 */
	public Long getTimesheetAttendanceId() {
		return timesheetAttendanceId;
	}

	/**
	 * @param timesheetAttendanceId the timesheetAttendanceId to set
	 */
	public void setTimesheetAttendanceId(Long timesheetAttendanceId) {
		this.timesheetAttendanceId = timesheetAttendanceId;
	}

	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the hoursWorkedperDay
	 */
	public int getHoursWorkedperDay() {
		return hoursWorkedperDay;
	}

	/**
	 * @param hoursWorkedperDay the hoursWorkedperDay to set
	 */
	public void setHoursWorkedperDay(int hoursWorkedperDay) {
		this.hoursWorkedperDay = hoursWorkedperDay;
	}

	/**
	 * @return the overtimeHoursWorkedPerDay
	 */
	public int getOvertimeHoursWorkedPerDay() {
		return overtimeHoursWorkedPerDay;
	}

	/**
	 * @param overtimeHoursWorkedPerDay the overtimeHoursWorkedPerDay to set
	 */
	public void setOvertimeHoursWorkedPerDay(int overtimeHoursWorkedPerDay) {
		this.overtimeHoursWorkedPerDay = overtimeHoursWorkedPerDay;
	}
}