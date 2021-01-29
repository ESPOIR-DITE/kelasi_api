package kelasi.ac.za.kelasi_api.repository.course.subject;

import kelasi.ac.za.kelasi_api.domain.course.subject.SubjectResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectResourceRep extends JpaRepository<SubjectResource,String> {
}
