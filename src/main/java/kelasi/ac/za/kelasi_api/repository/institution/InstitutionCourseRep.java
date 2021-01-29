package kelasi.ac.za.kelasi_api.repository.institution;

import kelasi.ac.za.kelasi_api.domain.institution.InstitutionCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstitutionCourseRep extends JpaRepository<InstitutionCourse, String> {
}
