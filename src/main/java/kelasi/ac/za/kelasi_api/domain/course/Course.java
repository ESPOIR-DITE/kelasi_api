package kelasi.ac.za.kelasi_api.domain.course;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    private String id;
    private String courseName;
    private String description;

    public Course() {
    }

    public Course(Builder builder) {
        this.id = builder.id;
        this.courseName = builder.courseName;
        this.description = builder.description;
    }

    public String getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDescription() {
        return description;
    }
    public static class Builder{
        private String id;
        private String courseName;
        private String description;

        public  Builder(String id){
            this.id = id;
        }
        public Builder buildCourseName(String courseName){
            this.courseName = courseName;
            return this;
        }
        public Builder buildDescription(String description){
            this.description = description;
            return this;
        }
        public Course build(){
            return new Course(this);
        }
    }
}
