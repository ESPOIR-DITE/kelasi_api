package kelasi.ac.za.kelasi_api.repository.course.assignment;

import kelasi.ac.za.kelasi_api.domain.course.assignment.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRep extends JpaRepository<Assignment,String> {
}
