package kelasi.ac.za.kelasi_api.repository.institution;

import kelasi.ac.za.kelasi_api.domain.institution.InstitutionImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstitutionImageRep extends JpaRepository<InstitutionImage,String> {
    List<InstitutionImage> findAllByInstitutionId(String institutionId);
    InstitutionImage findByInstitutionId(String institutionId);
}
