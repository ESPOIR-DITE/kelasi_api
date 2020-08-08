package kelasi.ac.za.kelasi_api.repository.student;

import kelasi.ac.za.kelasi_api.domain.student.StudentSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentSubjectRepository extends JpaRepository<StudentSubject,String> {
}
