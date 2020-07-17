package kelasi.ac.za.kelasi_api.domain.student.document;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class StudentDocument {
    @Id
    private String id;
    private String email;
    private String documentTypeId;
    private String documentId;
    private String institutionId;
    private Date date;

    private StudentDocument() {
    }

    public StudentDocument(Builder builder) {
        this.date = builder.date;
        this.documentId = builder.documentId;
        this.documentTypeId = builder.documentTypeId;
        this.email = builder.email;
        this.institutionId = builder.institutionId;
        this.id = builder.id;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getDocumentTypeId() {
        return documentTypeId;
    }

    public String getDocumentId() {
        return documentId;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public Date getDate() {
        return date;
    }
    public static class Builder{
        private String id;
        private String email;
        private String documentTypeId;
        private String documentId;
        private String institutionId;
        private Date date;

        public Builder(String id){
            this.id = id;
        }
        public Builder buildEmail(String email){
            this.email = email;
            return this;
        }
        public Builder buildDocumentTypeId(String documentTypeId){
            this.documentTypeId = documentTypeId;
            return this;
        }
        public Builder buildDocumentId(String documentId){
            this.documentId = documentId;
            return this;
        }
        public Builder buildInstitutionId(String institutionId){
            this.institutionId = institutionId;
            return this;
        }
        public Builder buildDate(Date date){
            this.date = date;
            return this;
        }
        public Builder copy(StudentDocument studentDocument){
            this.id = studentDocument.id;
            this.date = studentDocument.date;
            this.email = studentDocument.email;
            this.documentId = studentDocument.documentId;
            this.institutionId = studentDocument.institutionId;
            this.documentTypeId = studentDocument.documentTypeId;
            return this;
        }
        public StudentDocument build(){
            return new StudentDocument(this);
        }
    }

}
