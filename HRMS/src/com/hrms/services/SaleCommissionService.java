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

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.hrms.daoImpl.SaleCommissionImpl;
import com.hrms.model.SaleCommission;

@Path("/SaleCommissionController")
public class SaleCommissionService {
	SaleCommissionImpl saleCommissionImpl=new SaleCommissionImpl();
	@POST
	@Path("/SaveCommission")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveCommission(SaleCommission saleCommission){
		saleCommissionImpl.saveSaleCommission(saleCommission);
		return Response.status(200).build();
		}
	@PUT
	@Path("/updateCommission")
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateCommission(SaleCommission saleCommission){
		saleCommissionImpl.updateSaleCommission(saleCommission);
		return Response.status(200).build();
	}
	@GET
	@Path(value="{commissionId}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCommission(@PathParam("commissionId")Long commissionId){
		SaleCommission saleCommission=saleCommissionImpl.getSaleCommission(commissionId);
		return saleCommission.toString();
		
	}
	@Path("/ViewAllSalesCommssion")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String viewAllSalesCommission()throws  JSONException{
		List<SaleCommission>saleCommissionList=saleCommissionImpl.getSaleCommissionList();
		
		JSONArray jsonArray = new JSONArray();
		
		for(int i=0;i<saleCommissionList.size();i++)
		{
			JSONObject saleCommissionObject = new JSONObject();
			
			saleCommissionObject.put("commissionId", saleCommissionList.get(i).getCommissionId());
			saleCommissionObject.put("commissionPercentage", saleCommissionList.get(i).getCommissionPercentage());
			saleCommissionObject.put("salesAmount", saleCommissionList.get(i).getSalesAmount());
			saleCommissionObject.put("date", saleCommissionList.get(i).getDate());
			saleCommissionObject.put("salesCount", saleCommissionList.get(i).getSalesCount());
			
		
			jsonArray.put(saleCommissionObject);

		
	}
		return jsonArray.toString() ;
	}
}
