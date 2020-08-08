package kelasi.ac.za.kelasi_api.repository.student.document;

import kelasi.ac.za.kelasi_api.domain.student.document.StudentDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDocumentRepository extends JpaRepository<StudentDocument,String> {
}
