package kelasi.ac.za.kelasi_api.domain.course;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CourseSubject {
    @Id
    private String courseId;
    private String subjectId;
    private String institutionId;
    private String prerequisite;
    private String code;

    public CourseSubject() {
    }

    public CourseSubject(Builder builder) {
        this.courseId = builder.courseId;
        this.subjectId = builder.subjectId;
        this.institutionId = builder.institutionId;
        this.prerequisite = builder.prerequisite;
        this.code = builder.code;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public String getCode() {
        return code;
    }
    public static class Builder{
        private String courseId;
        private String subjectId;
        private String institutionId;
        private String prerequisite;
        private String code;

        public Builder(String courseId){
            this.courseId = courseId;
        }
        public Builder buildSubjectId(String subjectId){
            this.subjectId = subjectId;
            return this;
        }
        public Builder buildInstitutionId(String institutionId){
            this.institutionId = institutionId;
            return this;
        }
        public Builder buildPrerequisite(String prerequisite){
            this.prerequisite = prerequisite;
            return this;
        }
        public Builder buildCode(String code){
            this.code = code;
            return this;
        }
        public CourseSubject build(){
            return new CourseSubject(this);
        }
    }
}
