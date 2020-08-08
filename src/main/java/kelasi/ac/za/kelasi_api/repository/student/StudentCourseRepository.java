package kelasi.ac.za.kelasi_api.repository.student;

import kelasi.ac.za.kelasi_api.domain.student.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCourseRepository extends JpaRepository<StudentCourse,String> {
}
