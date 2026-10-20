package in.sp.main.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.sp.main.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>
{
	
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		 
		Employee emp=new Employee();
		emp.setName(rs.getString("name"));
		emp.setSalary(rs.getString("salary"));
		emp.setDesignation(rs.getString("designation"));
		return emp;
	}
}
