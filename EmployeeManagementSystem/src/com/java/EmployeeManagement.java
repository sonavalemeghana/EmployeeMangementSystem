package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			ArrayList<Employee>EmployeeArray=new ArrayList<Employee> ();
			int choice;double salary = 10000;
			int age;
			String name,city,designation;
			Scanner scanner= new Scanner(System.in);
			while(true){
				System.out.println("Press 1 for Add Employee details");
				System.out.println("Press 2 for Show Employee detail ");
				System.out.println("Press 3 for Update Employee details");
				System.out.println("Press 4 for search Employee by name ");
				System.out.println("Press 5 for Delete Employee record by name ");
				System.out.println("Press 6 for Exist");
				
			
			System.out.println("Make your choice");
			choice= scanner.nextInt();
			switch(choice){
			case 1:
				System.out.print("Enter the Employee name ");
				name= scanner.next();
				System.out.print("Enter the Employee age ");
				age= scanner.nextInt();
				System.out.print("Enter the Employee city name ");
				city= scanner.next();
				System.out.print("Enter the  Employee designation ");
				designation = scanner.next();
				System.out.print("Enter the  Employee salary ");
				salary= scanner.nextInt();
				Employee e =new Employee();
				e.setName(name);
				e.setAge(age);
				e.setCity(city);
				e.setSalary(salary);
				e.setDesignation(designation);
				
				EmployeeArray.add(e);
				System.out.println("**********Employee record has been added****************");
				break;
				
			case 2:
				for(int i=0; i<EmployeeArray.size(); i++){
					System.out.println("Employee record: "+(i+1));
					System.out.println("Employee name: "+EmployeeArray.get(i).getName());
					System.out.println("Employee age: "+EmployeeArray.get(i).getAge());
					System.out.println("Employee city: "+EmployeeArray.get(i).getCity());
					System.out.println("Employee designation: "+EmployeeArray.get(i).getDesignation());
					System.out.println("Employee salary :" +EmployeeArray.get(i).getSalary());
					System.out.println("************** Display the employee records*************************************");
					break;
				}
				case 3:
					System.out.println("Enter Employee designation for update salary ");
				
				String desination =scanner.next();
				int count=0;
				for(int i=0;i<EmployeeArray.size();i++) {
					if(EmployeeArray.get(i).getDesignation().contains(desination)) {
						
						System.out.println("Employee Record :"+(i+1));
						System.out.println("Enter the  salary to update");
						double sal=scanner.nextInt();
						EmployeeArray.get(i).getSalary();
						count++;
						System.out.println("Salary is updated");
						
					}
				}
				
				
				case 4:
					System.out.println("Enter the Employee  name for search: ");
					name= scanner.next();
					int search=0;
					for(int i=0; i<EmployeeArray.size(); i++){
						if(EmployeeArray.get(i).getName().contains(name)){
							System.out.println("Student record: "+(++search));
							System.out.println("Student name: "+EmployeeArray.get(i).getName());
							System.out.println("Student age: "+EmployeeArray.get(i).getAge());
							System.out.println("Student city: "+EmployeeArray.get(i).getCity());
							System.out.println("Employee designation "+EmployeeArray.get(i).getDesignation());
							System.out.println("Employee salary" +EmployeeArray.get(i).getSalary());
							System.out.println("***************************************************");
						}
					}
					if(search==0){
						System.out.println("No record found for that search ");
					}
					break;
					
				case 5:
					System.out.println("Enter the student name for delete: ");
					name= scanner.next();
					int search1=0;
					for(int i=0; i<EmployeeArray.size(); i++){
						if(EmployeeArray.get(i).getName().contains(name)){
							System.out.println("Employee record: "+(++search1));
							EmployeeArray.remove(i);
							System.out.println("***************************************************");
						}
					}
					if(search1==0){
						System.out.println("Record is not deleted");
					}else{
						System.out.println("Record is deleted succesfully");
					}
					break;
					
				case 6:
					System.out.println("");
					System.exit(0);
					break;
					
					default:
						System.out.println("Enter invalid choice");
				}
			
						
				}
			
	}
			}

	

