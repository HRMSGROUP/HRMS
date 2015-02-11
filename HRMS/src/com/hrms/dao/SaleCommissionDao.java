package com.hrms.dao;

import java.util.List;

import com.hrms.model.SaleCommission;

public interface SaleCommissionDao {

	Long saveSaleCommission(SaleCommission saleCommission);
	SaleCommission getSaleCommission(Long saleCommissionId);
	Long updateSaleCommission(SaleCommission saleCommission);
	List<SaleCommission> getSaleCommissionList();

}
