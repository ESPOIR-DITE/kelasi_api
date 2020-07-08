package kelasi.ac.za.kelasi_api.repository.student;

import kelasi.ac.za.kelasi_api.domain.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/***
 * this is all we need in this interface
 * extends JpaRepository<Student,String>
 *     extends JpaRepository
 *     send entity class and it primary key type
 *     That is all.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,String> {
}
