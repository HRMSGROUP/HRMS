package com.hrms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="tbl_Employee_attachment")
@XmlRootElement
public class EmployeeAtachment {
	@Id
	@GeneratedValue
	@Column(name="file_id")
	private long id;
    @Column(name="File_name")
	private String fileName;
    @Column(name="Content_type")
    private String ContentType;
    @Column(name="file_size")
    private long fileSize;
    @Column(name="Confirmation")
    private String confirmation;
    @Column(name="type_id")
    private long typeid;
    @Column(name="Type")
    private String type;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getContentType() {
		return ContentType;
	}
	public void setContentType(String contentType) {
		ContentType = contentType;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public String getConfirmation() {
		return confirmation;
	}
	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}
	public long getTypeid() {
		return typeid;
	}
	public void setTypeid(long typeid) {
		this.typeid = typeid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
    
    
}
