package handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bo.Dashboard;
import utilities.DAO;
import utilities.Database;

public class DashboardHandler {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
	DAO dao = (DAO) ctx.getBean("edao");
	
	public List<Dashboard> ListSections(String deptId,String fromDate,String toDate) {
		
		String[] columns = {"-","DESCRIPTION","TOTAL"};
		
		String sql = "SELECT SEC.DESCRIPTION,COUNT(IVD.SECTION_ID) AS TOTAL 			\n"
				+" FROM " + Database.DCMS.invoiceDetail + " IVD, 										\n"			
				+ Database.DCMS.section + " SEC																	\n"			
				+" WHERE IVD.DEPARTMENT_ID = '"+deptId+"' 												\n"
				+" AND IVD.SECTION_ID = SEC.SECTION_ID 													\n"
				+" AND TRN_DATE BETWEEN '"+fromDate+"' AND '"+toDate+"'					 	\n";
				
		if(deptId.equalsIgnoreCase("128")) {
			sql += " AND IVD.SECTION_ID IN ('CLP','HIS','CYT','MOL','HEM','MIC') 				\n";
		}
				
		sql += " GROUP BY  SEC.DESCRIPTION					 													\n";
		
		List<Dashboard> lst = new ArrayList<Dashboard>();
		List<HashMap> list = dao.selectData(sql, columns);
		
		for(int i = 0; i < list.size(); i++) {
			
			HashMap map = list.get(i);
			Dashboard dash = new Dashboard();
			dash.setDescription(map.get("DESCRIPTION").toString());
			dash.setTotal(map.get("TOTAL").toString());
			
			lst.add(dash);
		}
		
		return lst;
	}
	
	public List<Dashboard> OpdSection(String fromDate,String toDate){
		
		String[] columns = {"-","DESCRIPTION","TOTAL"};
		
		String sql = "SELECT SPY.DESCRIPTION , COUNT(*) AS TOTAL									\n"
				+" FROM " + Database.DCMS.invoiceDetail + " IVD, 										\n"			
				+  Database.DCMS.users + " USR, 																	\n"			
				+ Database.DCMS.definitionTypeDetail + " SPY												\n"			
				+" WHERE TRN_DATE BETWEEN '"+fromDate+"' AND '"+toDate+"'				    \n"
				+" AND CPT_ID IN ('OPDMED402', 'OPDMED403')												\n"
				+" AND STATUS_ID = 5				    				 													\n"
				+" AND IVD.PERFORMING_PHYSICIAN_ID =  USR.USER_NAME				 			\n"
				+" AND USR.SPECIALITY_ID = SPY.ID											 					\n"
				+" GROUP BY SPY.DESCRIPTION													 					\n";
			
		List<Dashboard> opd = new ArrayList<Dashboard>();
		List<HashMap> list = dao.selectData(sql, columns);
		
		for(int i = 0; i < list.size(); i++) {
			
			HashMap map = list.get(i);
			Dashboard dash = new Dashboard();
			dash.setDescription(map.get("DESCRIPTION").toString());
			dash.setTotal(map.get("TOTAL").toString());
			
			opd.add(dash);
		}
		
		return opd;
	}
	
	public List<Dashboard> GastroCount(String fromDate,String toDate){
		
		String[] columns = {"-","PROC_NAME","TOTAL"};
		
		String sql = "SELECT  CPT.DESCRIPTION PROC_NAME , COUNT(*) AS TOTAL 		\n"
				+" FROM " + Database.DCMS.invoiceDetail + " IVD,										\n"
				+ Database.DCMS.CPT + " CPT 																	\n"
				+" WHERE IVD.DEPARTMENT_ID = 35  															\n"
				+" AND TRN_DATE BETWEEN '"+fromDate+"' AND '"+toDate+"' 					\n"
				+" AND IVD.CPT_ID  = CPT.CPT_ID 																\n"
				+" AND IVD.SECTION_ID = 'NGPROC' 															\n"
				+" GROUP  BY  IVD.CPT_ID,  CPT.DESCRIPTION 											\n"
				+" ORDER BY COUNT(*) DESC "; 
		
		List<Dashboard> gastro = new ArrayList<Dashboard>();
		List<HashMap> list = dao.selectData(sql, columns);
		
		for(int i = 0; i < list.size(); i++) {
			
			HashMap map = list.get(i);
			Dashboard dash = new Dashboard();
			
			dash.setDescription(map.get("PROC_NAME").toString());
			dash.setTotal(map.get("TOTAL").toString());
			gastro.add(dash);
		}
		
		return gastro;
	}
		
	
	public List<Dashboard> RetrievePerformed(String fromDate,String toDate){
		
		String[] columns = {"-","MODALITY","SEC","PERFORMED"};
		
		String sql = "SELECT  MOD.DESCRIPTION MODALITY ,PS.MODALITY SEC,  COUNT(*) AS PERFORMED		\n"
				+" FROM " + Database.DCMS.pacsStudy + " PS,																				\n"
				+ Database.DCMS.modalityAnalyzer + " MOD 																				\n"
				+" WHERE TRN_DATE BETWEEN '"+fromDate+"' AND '"+toDate+"'													\n"
				+" AND PS.MACHINE_NAME = MOD.ID  																							\n"
				+"GROUP  BY PS.MACHINE_NAME , PS.MODALITY ,  MOD.DESCRIPTION";
		
		List<Dashboard> performed = new ArrayList<Dashboard>();
		List<HashMap> list = dao.selectData(sql, columns);
		
		for(int i = 0; i < list.size(); i++) {
			
			HashMap map = list.get(i);
			Dashboard dash = new Dashboard();
			dash.setModality(map.get("MODALITY").toString());
			dash.setSection(map.get("SEC").toString());
			dash.setPerformed(map.get("PERFORMED").toString());			
			
			performed.add(dash);
		}
		
		return performed;
	}
	
	public List<Dashboard> TotalDialysis(String fromDate,String toDate){
		
		String[] columns = {"-","PROCEDURE","TOTAL"};
		
		String sql = "SELECT CPT.DESCRIPTION PROCEDURE,COUNT(IVD.CPT_ID) AS TOTAL				\n"
				+" FROM " + Database.DCMS.invoiceDetail + " IVD,														\n"
				+ Database.DCMS.CPT+ " CPT 																						\n"
				+" WHERE CPT.DESCRIPTION LIKE '%DIALYSIS%' 															\n"
				+" AND CPT.CPT_ID = IVD.CPT_ID 																					\n"
				+" AND IVD.TRN_DATE BETWEEN '"+fromDate+"' AND '"+toDate+"'									\n"
				+" GROUP BY IVD.CPT_ID, CPT.DESCRIPTION";
		
		List<Dashboard> dialysis = new ArrayList<Dashboard>();
		List<HashMap> list = dao.selectData(sql, columns);
		
		for(int i = 0; i < list.size(); i++) {
			
			HashMap map = list.get(i);
			Dashboard dia = new Dashboard();
			dia.setDescription(map.get("PROCEDURE").toString());	
			dia.setTotal(map.get("TOTAL").toString());			
			dialysis.add(dia);
		}
		return dialysis;
	}
	
	public static void main(String[] args) {
		
		DashboardHandler hdl = new DashboardHandler();
		System.out.println(hdl.TotalDialysis("01-NOV-17", "15-NOV-17").size());
	}
}
