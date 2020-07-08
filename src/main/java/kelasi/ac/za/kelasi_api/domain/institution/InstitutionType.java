package kelasi.ac.za.kelasi_api.domain.institution;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InstitutionType {
    @Id
    private String institutionId;
    private String typeOfInstitutionId;
    private String description;

    public InstitutionType(Builder builder) {
        this.description = builder.description;
        this.institutionId = builder.institutionId;
        this.typeOfInstitutionId = builder.typeOfInstitutionId;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public String getTypeOfInstitutionId() {
        return typeOfInstitutionId;
    }

    public String getDescription() {
        return description;
    }
    public static class Builder{
        private String institutionId;
        private String typeOfInstitutionId;
        private String description;

        public Builder(String institutionId){
            this.institutionId=institutionId;
        }
        public Builder buildTypeOfInstitution(String typeOfInstitutionId){
            this.typeOfInstitutionId = typeOfInstitutionId;
            return this;
        }
        public Builder buildDescription(String description){
            this.description = description;
            return this;
        }
        public InstitutionType build(){
            return new InstitutionType(this);
        }
    }
}
