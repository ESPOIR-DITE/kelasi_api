package kelasi.ac.za.kelasi_api.domain.student;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class StudentSubject {
    @Id
    private String id;
    private String subjectId;
    private String studentId;
    private String courseId;
    private Date date;

    private StudentSubject() {
    }

    public StudentSubject(Builder builder) {
        this.id  = builder.id;
        this.date = builder.date;
        this.courseId = builder.courseId;
        this.studentId = builder.studentId;
        this.subjectId = builder.subjectId;
        this.studentId = builder.studentId;
    }

    public String getId() {
        return id;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public Date getDate() {
        return date;
    }
    public static class Builder{
        private String id;
        private String subjectId;
        private String studentId;
        private String courseId;
        private Date date;

        public Builder(String id){
            this.id = id;
        }
        public Builder buildSubjectId(String subjectId){
            this.subjectId = subjectId;
            return this;
        }
        public Builder buildStudentId(String studentId){
            this.studentId = studentId;
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
        public Builder copy(StudentSubject studentSubject){
            this.id = studentSubject.id;
            this.date = studentSubject.date;
            this.courseId = studentSubject.courseId;
            this.studentId = studentSubject.studentId;
            this.subjectId = studentSubject.subjectId;
            this.studentId = studentSubject.studentId;
            return this;
        }
        public StudentSubject build(){
            return new StudentSubject(this);
        }

    }
}
