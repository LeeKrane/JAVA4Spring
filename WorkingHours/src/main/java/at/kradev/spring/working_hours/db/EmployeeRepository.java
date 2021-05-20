package at.kradev.spring.working_hours.db;

import at.kradev.spring.working_hours.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	List<Employee> findByEmpLastName (String name);
	
	@Query("select e from Employee e where e.empLastName like %?1%")
	List<Employee> findEmpByPattern (String pattern);
}
