package kelasi.ac.za.kelasi_api.controler.student.document;

import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.student.document.StudentDocument;
import kelasi.ac.za.kelasi_api.factory.student.document.StudentDocumentFactory;
import kelasi.ac.za.kelasi_api.service.student.document.StudentDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("kelasi/student_document/")
public class StudentDocumentController implements Icontroller<StudentDocument,String> {
    @Autowired
    private StudentDocumentService studentDocumentService;

    @PostMapping("create")
    @Override
    public StudentDocument creat(@RequestBody StudentDocument studentDocument) {
        StudentDocument studentDocument1 = StudentDocumentFactory.getStudentDocument(studentDocument.getEmail(),studentDocument.getDocumentTypeId(),studentDocument.getDocumentId(),studentDocument.getInstitutionId(),studentDocument.getDate());
        return studentDocumentService.creat(studentDocument1);
    }

    @PostMapping("update")
    @Override
    public StudentDocument update(@RequestBody StudentDocument studentDocument) {
        return studentDocumentService.update(studentDocument);
    }

    @GetMapping("read")
    @Override
    public StudentDocument read(@RequestParam("id") String id) {
        return studentDocumentService.read(id);
    }

    @PostMapping("delete")
    @Override
    public boolean delete(@RequestBody StudentDocument studentDocument) {
        return studentDocumentService.delete(studentDocument);
    }

    @GetMapping("reads")
    @Override
    public List<StudentDocument> reaAll() {
        return studentDocumentService.reaAll();
    }
}
