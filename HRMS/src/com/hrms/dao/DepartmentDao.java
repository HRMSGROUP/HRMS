package com.hrms.dao;

import java.util.List;

import com.hrms.model.Department;

public interface DepartmentDao {
	
public Long saveDepartment(Department dep);
	
    public void deleteDepartment(long dep);
    
    public Department searchAttachment(Department dep);
    
    public List<Department> listDepartments();


}
