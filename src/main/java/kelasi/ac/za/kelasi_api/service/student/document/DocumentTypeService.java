package kelasi.ac.za.kelasi_api.service.student.document;

import kelasi.ac.za.kelasi_api.domain.student.document.DocumentType;
import kelasi.ac.za.kelasi_api.repository.student.document.DocumentTypeRepository;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentTypeService implements Iservice<DocumentType,String> {
    @Autowired
    private DocumentTypeRepository documentTypeRepository;
    private static DocumentTypeService documentTypeService;

    public static DocumentTypeService getDocumentTypeService() {
        if (documentTypeService == null) {
            documentTypeService= new DocumentTypeService();
        }
        return documentTypeService;
    }

    @Override
    public DocumentType creat(DocumentType documentType) {
        return documentTypeRepository.save(documentType);
    }

    @Override
    public DocumentType update(DocumentType documentType) {
        DocumentType documentType1 = getHelp(documentType.getId());
        if (documentType1 != null) {
            documentTypeRepository.delete(documentType1);
            return creat(documentType);
        }
        return null;
    }

    @Override
    public DocumentType read(String id) {
        return getHelp(id);
    }

    @Override
    public boolean delete(DocumentType documentType) {
        DocumentType documentType1 = getHelp(documentType.getId());
        if (documentType1 != null) {
            documentTypeRepository.delete(documentType1);
            return true;
        }
        return false;
    }

    @Override
    public List<DocumentType> reaAll() {
        return documentTypeRepository.findAll();
    }

    @Override
    public DocumentType getHelp(String id) {
        Optional<DocumentType> documentType = documentTypeRepository.findById(id);
        return documentType.orElse(null);
    }
}
