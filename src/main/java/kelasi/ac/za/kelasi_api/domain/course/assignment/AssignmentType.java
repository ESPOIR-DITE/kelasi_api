package kelasi.ac.za.kelasi_api.domain.course.assignment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AssignmentType {
    @Id
    private String id;
    private String name;

    public AssignmentType() {
    }

    public AssignmentType(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public static class Builder{
        private String id;
        private String name;
        public Builder(String id){
            this.id = id;
        }
        public Builder buildName(String name){
            this.name = name;
            return this;
        }
        public AssignmentType build(){
            return new AssignmentType(this);
        }
    }
}
