package kelasi.ac.za.kelasi_api.domain.institution;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
@Entity
public class InstitutionClass {
    @Id
    private String id;
         private String institutionId;
         private String classId;
         private String settes;
         private String status;


         public InstitutionClass(){

         }

    private InstitutionClass(Builder builder) {
        this.institutionId = builder.institutionId;
        this.classId = builder.classId;
        this.settes = builder.settes;
        this.status = builder.status;
        this.id = builder.id;
    }


    public String getId() {
        return id;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public String getClassId() {
        return classId;
    }

    public String getSettes() {
        return settes;
    }

    public String getStatus() {
        return status;
    }

    public static class Builder{

             private String id;
        private String institutionId;
        private String classId;
        private String settes;
        private String status;


        public Builder(String id){
            this.id = id;
        }
        public Builder institutionId(String institutionId) {
            this.institutionId = institutionId;
            return this;
        }

        public Builder classId(String classId) {
            this.classId = classId;
            return this;
        }

        public Builder settes(String settes) {
            this.settes = settes;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder copy(InstitutionClass institutionClass){
            this.institutionId = institutionClass.institutionId;
            this.classId = institutionClass.classId;
            this.settes = institutionClass.settes;
            this.status = institutionClass.status;

            return this;
        }

        public InstitutionClass build() {
            return new InstitutionClass(this);
        }


    }

    @Override
    public String toString() {
        return "InstitutionClass{" +
                "institutionId='" + institutionId + '\'' +
                ", classId='" + classId + '\'' +
                ", settes='" + settes + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstitutionClass institutionClass = (InstitutionClass) o;
        return institutionId.equals(institutionClass.institutionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(institutionId);
    }
}
