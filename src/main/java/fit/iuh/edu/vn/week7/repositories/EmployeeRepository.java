package fit.iuh.edu.vn.week7.repositories;

import fit.iuh.edu.vn.week7.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}