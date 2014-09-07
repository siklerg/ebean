package hu.zerotohero.ebean.dao;

import hu.zerotohero.ebean.entities.Employee;

import com.avaje.ebean.Ebean;

/**
 * 
 * @author Attila Budai <attila.budai@zerotohero.hu>
 * 
 */
public class EmployeeDao {

	public Employee findEmployeeById(Integer id) {
		return Ebean.find(Employee.class).where().eq("id", id).findUnique();
	}

	public Employee findEmployeeWithJobById(Integer id) {
		return Ebean.find(Employee.class).fetch("job").where().eq("id", id).findUnique();
	}

	public Employee findManagerByEmployee(Employee employee) {
		return Ebean.find(Employee.class).where().eq("employees", employee).findUnique();
	}

}
