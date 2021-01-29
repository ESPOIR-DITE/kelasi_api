package kelasi.ac.za.kelasi_api.repository.course;

import kelasi.ac.za.kelasi_api.domain.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRep extends JpaRepository<Course,String> {
}
