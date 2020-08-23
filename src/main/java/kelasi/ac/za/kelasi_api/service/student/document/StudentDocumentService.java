package kelasi.ac.za.kelasi_api.service.student.document;

import kelasi.ac.za.kelasi_api.domain.student.document.StudentDocument;
import kelasi.ac.za.kelasi_api.repository.student.document.StudentDocumentRepository;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentDocumentService implements Iservice<StudentDocument,String> {
    @Autowired
    private StudentDocumentRepository studentDocumentRepository;
    private static StudentDocumentService studentDocumentService;

    public static StudentDocumentService getStudentDocumentService() {
        if (studentDocumentService == null) {
            studentDocumentService = new StudentDocumentService();
        }
        return studentDocumentService;
    }

    @Override
    public StudentDocument creat(StudentDocument studentDocument) {
        return studentDocumentRepository.save(studentDocument);
    }

    @Override
    public StudentDocument update(StudentDocument studentDocument) {
        return studentDocumentRepository.save(studentDocument);
    }

    @Override
    public StudentDocument read(String id) {
        return getHelp(id);
    }

    @Override
    public boolean delete(StudentDocument studentDocument) {
        StudentDocument studentDocument1 = getHelp(studentDocument.getId());
        if (studentDocument1 != null) {
            studentDocumentRepository.delete(studentDocument1);
            return true;
        }
        return false;
    }

    @Override
    public List<StudentDocument> reaAll() {
        return studentDocumentRepository.findAll();
    }

    @Override
    public StudentDocument getHelp(String id) {
        Optional<StudentDocument> result = studentDocumentRepository.findById(id);
        return result.orElse(null);
    }
}
