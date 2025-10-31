package com.ems.main;
import com.ems.doa.EmployeeDAO;
import com.ems.model.Employee;
import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 EmployeeDAO dao = new EmployeeDAO();
		 
		 while (true) {
	            System.out.println("\n=== Employee Management ===");
	            System.out.println("1. Add Employee");
	            System.out.println("2. View Employees");
	            System.out.println("3. Update Employee Salary");
	            System.out.println("4. Delete Employee");
	            System.out.println("5. Exit");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();
	            
	            switch (choice) {
	            case 1:
	            	 System.out.print("Name: ");
	                    sc.nextLine();
	                    String name = sc.nextLine();
	                    System.out.print("Department: ");
	                    String dept = sc.nextLine();
	                    System.out.print("Salary: ");
	                    double salary = sc.nextDouble();
	                    
	                    dao.addEmployee( new Employee(name,dept,salary));
	                    break;
	            case 2:
	            	dao.getAllEmployee().forEach(e->
	            	System.out.println(e.getid()+ "|"+e.getName()+"|"+e.getDepartment()+"|"+e.getSalary()));
	            	break;
	            	
	            case 3:
	            	System.out.println("enter the ID ");
	            	int id = sc.nextInt();
	            	
	            	System.out.println("enter the salary");
	            	double newsalary = sc.nextDouble();
	            	
	            	dao.updateEmployee(id, newsalary);
	            	break;
	            	
	            case 4:
	            	System.out.println("enter the id ");
	            	int delid = sc.nextInt();
	            	dao.deleteEmployee(delid);
	            	break;
	            case 5:
	            	System.out.println("Exiting");
	            	sc.close();
	            	break;
	            default:
	            	System.out.println("invlaid option");
	            	
	            }
	            	

	}
	
	
	}}
