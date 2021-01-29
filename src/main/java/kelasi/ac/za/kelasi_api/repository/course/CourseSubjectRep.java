package kelasi.ac.za.kelasi_api.repository.course;

import kelasi.ac.za.kelasi_api.domain.course.CourseSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseSubjectRep extends JpaRepository<CourseSubject,String> {
}
