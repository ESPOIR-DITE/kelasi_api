package kelasi.ac.za.kelasi_api.repository.course.assignment;

import kelasi.ac.za.kelasi_api.domain.course.assignment.AssignmentFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentFileRep extends JpaRepository<AssignmentFile,String> {
}
