package kelasi.ac.za.kelasi_api.domain.institution;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
@Entity
public class InstitutionImage {
@Id
private String id;
    private String institutionId;
    private String imageId;
    private String imageTypeId;
    private String description;

    public InstitutionImage(){

    }

    private InstitutionImage(Builder builder) {
        this.institutionId = builder.institutionId;
        this.imageId = builder.imageId;
        this.imageTypeId = builder.imageTypeId;
        this.description = builder.description;
        this.id = builder.id;
    }

    public String getId() {
        return id;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public String getImageId() {
        return imageId;
    }

    public String getImageTypeId() {
        return imageTypeId;
    }

    public String getDescription() {
        return description;
    }

    public static class Builder{

        private String id;
        private String institutionId;
        private String imageId;
        private String imageTypeId;
        private String description;

        public Builder(String id){
            this.id = id;
        }
        public Builder institutionId(String institutionId) {
            this.institutionId = institutionId;
            return this;
        }

        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        public Builder imageTypeId(String imageTypeId) {
            this.imageTypeId = imageTypeId;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder copy(InstitutionImage institutionImage){
            this.institutionId = institutionImage.institutionId;
            this.imageId = institutionImage.imageId;
            this.imageTypeId = institutionImage.imageTypeId;
            this.description = institutionImage.description;

            return this;
        }

        public InstitutionImage build() {
            return new InstitutionImage(this);
        }
    }

    @Override
    public String toString() {
        return "InstitutionImage{" +
                "institutionId='" + institutionId + '\'' +
                ", imageId='" + imageId + '\'' +
                ", imageTypeId='" + imageTypeId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstitutionImage institutionImage = (InstitutionImage) o;
        return imageId.equals(institutionImage.imageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId);
    }
}
