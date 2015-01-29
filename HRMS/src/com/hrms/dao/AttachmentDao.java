package com.hrms.dao;

import java.util.List;

import com.hrms.model.EmployeeAtachment;

public interface AttachmentDao {
	
	public EmployeeAtachment saveAttachment(EmployeeAtachment e);
	
    public EmployeeAtachment deleteAttachment(EmployeeAtachment e);
    
    public EmployeeAtachment searchAttachment(EmployeeAtachment e);
    
    public List<EmployeeAtachment> listAttachments();

}
