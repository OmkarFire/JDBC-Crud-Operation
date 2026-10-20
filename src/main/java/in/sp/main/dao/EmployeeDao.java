package in.sp.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.sp.main.entity.Employee;
import in.sp.main.mapper.EmployeeRowMapper;

@Repository
public class EmployeeDao
{
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public boolean insertEmployee(Employee employee)
	{
		boolean status=false;
		
		try
		{
			String SQL_INSERT_QUERY="insert into employee(name,salary,designation) values(?,?,?)";
			int count=jdbctemplate.update(SQL_INSERT_QUERY, employee.getName(),employee.getSalary(),employee.getDesignation());
			if(count>0)
			{
				status=true;
			}
			else
			{
				status=false;
			}
		}
		catch(Exception e)
		{
			status=false;
			e.printStackTrace();
		}
		
		
		return status;
		
	}
	
	public boolean updateEmployee(Employee employee)
	{
		boolean status=false;
		try
		{
			String SQL_UPDATE_QUERY="update employee set name=?,salary=? where designation=?";
			int count=jdbctemplate.update(SQL_UPDATE_QUERY, employee.getName(),employee.getSalary(),employee.getDesignation());
			if(count>0)
			{
				status=true;
				
			}
			else
			{
				status=false;
			}
		}
		catch(Exception e)
		{
			status=false;
			e.printStackTrace();
		}
		return status;
		
	}
	
	public boolean deleteEmployee(String designation)
	{
		boolean status=false;
		try
		{
			String SQL_DELETE_QUERY="delete from employee where designation=?";
			int count=jdbctemplate.update(SQL_DELETE_QUERY, designation);
			if(count>0)
			{
				status=true;
				
			}
			else
			{
				status=false;
			}
			
		}
		catch(Exception e)
		{
			status=false;
			e.printStackTrace();
		}
		return status;
		
	}
	
	public Employee getEmployeeByDesignation(String designation)
	{
		String SQL_SELECT_QUERY="select * from employee where designation=?";
		return jdbctemplate.queryForObject(SQL_SELECT_QUERY, new EmployeeRowMapper(),designation);
		
	}
	
	public List<Employee> getAllEmployee()
	{
		String SQL_SELECT_QUERY="select * from Employee";
		return jdbctemplate.query(SQL_SELECT_QUERY, new EmployeeRowMapper());
		
	}
	
	
}
