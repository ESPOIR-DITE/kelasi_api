package kelasi.ac.za.kelasi_api.domain.student.document;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DocumentType {
    @Id
    private String id;
    private String name;
    private String description;

    private DocumentType() {
    }

    public DocumentType(Builder builder) {
        this.description = builder.description;
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public static class Builder{
        private String id;
        private String name;
        private String description;

        public Builder(String id){
            this.id = id;
        }
        public Builder buildName(String name){
            this.name = name;
            return this;
        }
        public Builder buildDescription(String description){
            this.description = description;
            return this;
        }
        public Builder copy(DocumentType documentType){
            this.description = documentType.description;
            this.name = documentType.name;
            this.id = documentType.id;
            return this;
        }
        public DocumentType build(){
            return new DocumentType(this);
        }
    }
}
