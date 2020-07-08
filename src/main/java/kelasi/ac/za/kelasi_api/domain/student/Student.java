package kelasi.ac.za.kelasi_api.domain.student;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/****
 * this is a pattern that need to be replicated on all the entity and aggregated classes(Domain class)
 */
@Entity
public class Student { //never mind if the className has a red line, it ok!
    @Id
    private String email;
    private String studentNumber;
    private String name;
    private String surname;
    private String middleName;
    private Date dateOdBirth;
    private String phoneNumber;

    public Student(Builder builder) {
        this.phoneNumber = builder.phoneNumber;
        this.dateOdBirth = builder.dateOdBirth;
        this.middleName = builder.middleName;
        this.surname = builder.surname;
        this.name = builder.name;
        this.email = builder.email;
        this.studentNumber = builder.studentNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Date getDateOdBirth() {
        return dateOdBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static class Builder{
        private String email;
        private String studentNumber;
        private String name;
        private String surname;
        private String middleName;
        private Date dateOdBirth;
        private String phoneNumber;

        public Builder(String email){
            this.email = email;
        }
        public Builder buildStudentNumber(String studentNumber){
            this.studentNumber = studentNumber;
            return this;
        }
        public Builder buildName(String name){
            this.name = name;
            return this;
        }
        public Builder buildSurname(String surname){
            this.surname = surname;
            return this;
        }
        public Builder buildMiddleName(String middleName){
            this.middleName = middleName;
            return this;
        }
        public Builder buildDateOfBirth(Date dateOdBirth){
            this.dateOdBirth = dateOdBirth;
            return this;
        }
        public Builder buildPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Builder copy(Student student){
            this.phoneNumber = student.phoneNumber;
            this.dateOdBirth = student.dateOdBirth;
            this.middleName = student.middleName;
            this.surname = student.surname;
            this.name = student.name;
            this.email = student.email;
            this.studentNumber = student.studentNumber;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }
}
