package kelasi.ac.za.kelasi_api.factory.student.document;

import kelasi.ac.za.kelasi_api.domain.student.document.StudentDocument;
import kelasi.ac.za.kelasi_api.util.GeneratId;

import java.util.Date;

public class StudentDocumentFactory {
    public static StudentDocument getStudentDocument(String email,String documentTypeId,String documentId,String institutionId,Date date){
        return new StudentDocument.Builder(GeneratId.getId(StudentDocumentFactory.class))
                .buildDate(date)
                .buildDocumentId(documentId)
                .buildDocumentTypeId(documentTypeId)
                .buildEmail(email)
                .buildInstitutionId(institutionId)
                .build();
    }
}
