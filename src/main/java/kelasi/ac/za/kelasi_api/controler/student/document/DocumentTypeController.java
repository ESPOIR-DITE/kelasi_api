package kelasi.ac.za.kelasi_api.controler.student.document;

import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.student.document.DocumentType;
import kelasi.ac.za.kelasi_api.factory.student.document.DocumentTypeFactory;
import kelasi.ac.za.kelasi_api.service.student.document.DocumentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("kelasi/document_type/")
public class DocumentTypeController implements Icontroller<DocumentType,String> {
    @Autowired
    private DocumentTypeService documentTypeService;

    @PostMapping("create")
    @Override
    public DocumentType creat(@RequestBody DocumentType documentType) {
        DocumentType documentType1 = DocumentTypeFactory.getDocumentType(documentType.getName(),documentType.getDescription());
        return documentTypeService.creat(documentType1);
    }

    @PostMapping("update")
    @Override
    public DocumentType update(DocumentType documentType) {
        return documentTypeService.update(documentType);
    }

    @GetMapping("read")
    @Override
    public DocumentType read(String id) {
        return documentTypeService.read(id);
    }

    @PostMapping("delete")
    @Override
    public boolean delete(DocumentType documentType) {
        return documentTypeService.delete(documentType);
    }

    @GetMapping("reads")
    @Override
    public List<DocumentType> reaAll() {
        return documentTypeService.reaAll();
    }
}
