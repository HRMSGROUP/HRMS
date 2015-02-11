package com.hrms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="tblSaleCommission")
@XmlRootElement
public class SaleCommission implements Serializable
{

	private static final long serialVersionUID = 3599206074057268777L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long commissionId;
	
	@Column(name = "tblSaleCommission_Percentage")
	private double commissionPercentage;

	@Column(name = "tblSaleCommission_SalesAmount")
	private double salesAmount;

	@Column(name = "tblSaleCommission_SalesCount")
	private int salesCount; 
	
	@Column(name = "tblSaleCommission_Date")
	private Date date;
/*	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empNumber")
	private Employee employee;
	
	public SaleCommission() {
	
	}*/

	public Long getCommissionId() {
		return commissionId;
	}

	public void setCommissionId(Long commissionId) {
		this.commissionId = commissionId;
	}

	public double getCommissionPercentage() {
		return commissionPercentage;
	}

	public void setCommissionPercentage(double commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}

	public double getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(double salesAmount) {
		this.salesAmount = salesAmount;
	}

	public int getSalesCount() {
		return salesCount;
	}

	public void setSalesCount(int salesCount) {
		this.salesCount = salesCount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
