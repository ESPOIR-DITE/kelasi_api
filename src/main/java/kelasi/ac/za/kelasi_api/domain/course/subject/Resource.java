package kelasi.ac.za.kelasi_api.domain.course.subject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Resource {
    @Id
    private String id;
    private String resource;
    private String description;

    public Resource() {
    }

    public Resource(Builder builder) {
        this.id = builder.id;
        this.resource = builder.resource;
        this.description = builder.description;
    }

    public String getId() {
        return id;
    }

    public String getResource() {
        return resource;
    }

    public String getDescription() {
        return description;
    }

    public static class Builder {
        private String id;
        private String resource;
        private String description;

        public Builder(String id) {
            this.id = id;
        }

        public Builder buildResource(String resource){
            this.resource = resource;
            return this;
        }
        public Builder buildDescription(String description){
            this.description = description;
            return this;
        }
        public Resource build(){
            return new Resource(this);
        }
    }
}
