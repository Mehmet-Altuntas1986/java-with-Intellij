package day48_collection_part3;

import java.util.*;

public class ListOfMaps {

	public static void main(String[] args) {
		
		
		//List is holding map object
		
		List<Map<String,String>> employees = new ArrayList<>();  // bir List olusturduk     ,    < buraya object koyuyoruz>
		
		Map<String,String> emp1Data = new HashMap<>();
		emp1Data.put("EmpID", "123");
		emp1Data.put("EmpName", "John");
		emp1Data.put("JobTitle", "SDET");
		emp1Data.put("Salary", "100000");
		
		Map<String,String> emp2Data = new HashMap<>();
		emp2Data.put("EmpID", "124");
		emp2Data.put("EmpName", "Mike");
		emp2Data.put("JobTitle", "Dev");
		emp2Data.put("Salary", "80000");
		
		employees.add(emp1Data);
		employees.add(emp2Data);
		
		
		System.out.println(employees.toString());
		
		System.out.println(employees.size());
		
		System.out.println(employees.get(0));   //  {Salary=100000, EmpID=123, JobTitle=SDET, EmpName=John}
		
		
		System.out.println(employees.get(1).get("EmpName"));  //{Salary=80000, EmpID=124, JobTitle=Dev, EmpName=Mike}
		
		//print each employee title by using for each loop
		//
		int totalSalary = 0;
		for(Map<String,String> emp : employees) {
			//System.out.println(emp.get("JobTitle"));
			totalSalary+=Integer.parseInt(emp.get("Salary"));         //String i int degerine donusturmek icin parseInt methodunu kullandik
			
		}
		
		System.out.println("Total salary =" + totalSalary);
		
		//Dusunku 1000 lerce  emp ve maas listesi var , ve sen bunlari test edeceksin   --> for each loop ve yukaridaki yapiyi kullan
		
		
		//THE END.....
		
		
		

	}

}