package at.kradev.spring.working_hours.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import at.kradev.spring.working_hours.model.WorkingHours;

@Repository
public interface WorkingHoursRepository extends JpaRepository<WorkingHours, Integer> {
}