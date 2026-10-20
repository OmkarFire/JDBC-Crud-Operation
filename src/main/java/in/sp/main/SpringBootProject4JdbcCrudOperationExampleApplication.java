package in.sp.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.sp.main.dao.EmployeeDao;
import in.sp.main.entity.Employee;

@SpringBootApplication
public class SpringBootProject4JdbcCrudOperationExampleApplication implements CommandLineRunner
{

	@Autowired
	private EmployeeDao employeeDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject4JdbcCrudOperationExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//  	Employee emp=new Employee("Omkar","40000","Project Associate");
//  	Employee emp=new Employee("Mahesh","50000","Animator");
//		boolean status=employeeDao.insertEmployee(emp);
//		if(status)
//		{
//			System.out.println("Employee inserted successfully");
//		}
//		else
//		{
//			System.out.println("Employee not inserted successfully");
//		}		
		
		
//		Employee emp=new Employee("omkar","50000","Project Associate");
//		boolean status=employeeDao.updateEmployee(emp);
//		if(status)
//		{
//			System.out.println("Employee updated successfully");
//		}
//		else
//		{
//			System.out.println("Employee not updated successfully");
//		}
		
//		boolean status=employeeDao.deleteEmployee("Project Associate");
//		if(status)
//		{
//			System.out.println("Employee deleted successfully");
//		}
//		else
//		{
//			System.out.println("Employee not deleted successfully");
//		}
//		
//		Employee emp=employeeDao.getEmployeeByDesignation("Animator");
//		System.out.println("name :"+emp.getName());
//		System.out.println("salary :"+emp.getDesignation());
//		System.out.println("designation :"+emp.getSalary());
		
		List<Employee> list=employeeDao.getAllEmployee();
		for(Employee emp:list)
		{
			System.out.println("name :"+emp.getName());
			System.out.println("salary :"+emp.getSalary());
			System.out.println("name :"+emp.getDesignation());
		}
		
	}

}
