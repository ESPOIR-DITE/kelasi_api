package kelasi.ac.za.kelasi_api.repository.course.subject;

import kelasi.ac.za.kelasi_api.domain.course.subject.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRep extends JpaRepository<Resource,String> {
}
