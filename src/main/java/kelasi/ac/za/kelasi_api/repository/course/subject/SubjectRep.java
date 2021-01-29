package kelasi.ac.za.kelasi_api.repository.course.subject;

import kelasi.ac.za.kelasi_api.domain.course.subject.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRep extends JpaRepository<Subject,String> {
}
