package com.ems.doa;


import com.ems.model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ems.connection.EmployeeDBConnection;

public class EmployeeDAO {
	
	 public void addEmployee(Employee emp) {
		 String query= "INSERT INTO employees(name,department,salary) values(?,?,?)";
	     try (Connection conn = EmployeeDBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(query)){
			ps.setString(1, emp.getName());
			ps.setString(2,emp.getDepartment());
			ps.setDouble(3,emp.getSalary());
			ps.executeUpdate();
			System.out.println(" employee successfully added");
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	 }
	
	 public List<Employee> getAllEmployee(){
		List<Employee>list = new ArrayList<>();
		
		String query = "select * from employees";
		try( Connection conn = EmployeeDBConnection.getConnection();
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(query)) {
			 	while(rs.next()) {
			 		Employee emp = new Employee();
			 		emp.setid(rs.getInt("id"));
			 		emp.setName(rs.getString("name"));
			 		emp.setDepartment(rs.getString("department"));
			 		emp.setSalary(rs.getDouble("salary"));
			 		list.add(emp);
			 	}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list; 
	
}
	 
	 public void updateEmployee(int id,double salary) {
		 String query = "update employees set salary=? where id =? "; 
		 try(Connection conn = EmployeeDBConnection.getConnection();
			 PreparedStatement ps = conn.prepareStatement(query)){
			 ps.setDouble(1, salary);
			 ps.setInt(2, id);
			 ps.executeUpdate();
			 System.out.println("Employee updated successfully");
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
	 }
	 
	 public void deleteEmployee(int id) {
		 String query = "delete employee where id=?";
		 
		 try(Connection conn =EmployeeDBConnection.getConnection();
				PreparedStatement ps =conn.prepareStatement(query);
				 ){
			 ps.setInt(1, id);
			 ps.executeUpdate();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
	}
