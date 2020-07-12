package kelasi.ac.za.kelasi_api.domain.student;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class StudentCourse {
    @Id
    private String email;
    private String institutionId;
    private String courseId;
    private Date date;
    private String information;

    public StudentCourse(Builder builder) {
        this.email = builder.email;
        this.information = builder.information;
        this.date = builder.date;
        this.courseId = builder.courseId;
        this.institutionId = builder.institutionId;
    }

    public String getEmail() {
        return email;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public String getCourseId() {
        return courseId;
    }

    public Date getDate() {
        return date;
    }

    public String getInformation() {
        return information;
    }
    public static class Builder {
        private String email;
        private String institutionId;
        private String courseId;
        private Date date;
        private String information;

        public Builder buildEmail(String email){
            this.email = email;
            return this;
        }
        public Builder buildInstitutionId(String institutionId){
            this.institutionId = institutionId;
            return this;
        }
        public Builder buildCourseId(String courseId){
            this.courseId = courseId;
            return this;
        }
        public Builder buildDate(Date date){
            this.date = date;
            return this;
        }
        public Builder buildInformation(String information){
            this.information = information;
            return this;
        }
        public Builder copy(StudentCourse studentCourse){
            this.email = studentCourse.email;
            this.information = studentCourse.information;
            this.date = studentCourse.date;
            this.courseId = studentCourse.courseId;
            this.institutionId = studentCourse.institutionId;
            return this;
        }
        public StudentCourse build(){
            return new StudentCourse(this);
        }
    }
}
