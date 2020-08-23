package kelasi.ac.za.kelasi_api.domain.institution;

import java.util.Objects;

public class InstitutionCourse {

    private String email;
    private String institutionId;
    private String course;
    private String date;
    private String information;

   public InstitutionCourse(){

   }

    private InstitutionCourse(Builder builder) {
        this.email = builder.email;
        this.institutionId = builder.institutionId;
        this.course = builder.course;
        this.date = builder.date;
        this.information = builder.information;
    }

    public String getEmail() {
        return email;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public String getCourse() {
        return course;
    }

    public String getDate() {
        return date;
    }

    public String getInformation() {
        return information;
    }

    public static class Builder{

        private String email;
        private String institutionId;
        private String course;
        private String date;
        private String information;


        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder institutionId(String institutionId) {
            this.institutionId = institutionId;
            return this;
        }

        public Builder course(String course) {
            this.course = course;
            return this;
        }

        public Builder date(String date) {
            this.date = date;
            return this;
        }

        public Builder information(String information) {
            this.information = information;
            return this;
        }


        public Builder copy(InstitutionCourse institutionCourse){
            this.email = institutionCourse.email;
            this.institutionId = institutionCourse.institutionId;
            this.course = institutionCourse.course;
            this.date = institutionCourse.date;
            this.information = institutionCourse.information;

            return this;
        }

        public InstitutionCourse build() {
            return new InstitutionCourse(this);
        }


    }

    @Override
    public String toString() {
        return "InstitutionCourse{" +
                "email='" + email + '\'' +
                ", institutionId='" + institutionId + '\'' +
                ", course='" + course + '\'' +
                ", date='" + date + '\'' +
                ", information='" + information + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstitutionCourse institutionCourse = (InstitutionCourse) o;
        return email.equals(institutionCourse.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
