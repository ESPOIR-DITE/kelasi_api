package kelasi.ac.za.kelasi_api.repository.student.document;

import kelasi.ac.za.kelasi_api.domain.student.document.DocumentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentTypeRepository extends JpaRepository<DocumentType,String> {
}
