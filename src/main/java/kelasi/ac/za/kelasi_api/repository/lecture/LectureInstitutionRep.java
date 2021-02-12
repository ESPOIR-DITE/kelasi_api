package kelasi.ac.za.kelasi_api.repository.lecture;

import kelasi.ac.za.kelasi_api.domain.lecture.LectureInstitution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LectureInstitutionRep extends JpaRepository<LectureInstitution,String> {

    List<LectureInstitution> findAllByInstitution(String institutionId);
    List<LectureInstitution> findAllByEmail(String email);
}
