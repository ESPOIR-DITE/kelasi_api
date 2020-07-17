package kelasi.ac.za.kelasi_api.factory.student.document;

import kelasi.ac.za.kelasi_api.domain.student.document.DocumentType;
import kelasi.ac.za.kelasi_api.util.GeneratId;

public class DocumentFactory {
    public static DocumentType getDocumentType(String name,String description){
        return new DocumentType.Builder(GeneratId.getId(DocumentFactory.class))
                .buildDescription(description)
                .buildName(name)
                .build();
    }
}
