package kelasi.ac.za.kelasi_api.domain.course.subject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
    @Id
    private String id;
    private String name;
    private String code;
    private String description;

    public Subject() {
    }

    public Subject(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.code = builder.code;
        this.description = builder.description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
    public static class Builder{
        private String id;
        private String name;
        private String code;
        private String description;

        public Builder(String id){
            this.id = id;
        }
        public Builder buildName(String name){
            this.name = name;
            return this;
        }
        public Builder buildCode(String code){
             this.code = code;
             return this;
        }
        public Builder buildDescription(String description){
            this.description = description;
            return this;
        }
        public Subject build(){
            return  new Subject(this);
        }
    }
}
