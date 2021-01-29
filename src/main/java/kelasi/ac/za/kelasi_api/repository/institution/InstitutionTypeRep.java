package kelasi.ac.za.kelasi_api.repository.institution;

import kelasi.ac.za.kelasi_api.domain.institution.InstitutionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitutionTypeRep extends JpaRepository<InstitutionType, String> {
}
