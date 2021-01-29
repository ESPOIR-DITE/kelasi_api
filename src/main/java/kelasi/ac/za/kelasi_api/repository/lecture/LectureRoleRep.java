package kelasi.ac.za.kelasi_api.repository.lecture;

import kelasi.ac.za.kelasi_api.domain.lecture.LectureRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureRoleRep extends JpaRepository<LectureRole,String> {
}
