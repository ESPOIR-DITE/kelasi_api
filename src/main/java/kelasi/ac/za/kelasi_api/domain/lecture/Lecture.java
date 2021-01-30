package kelasi.ac.za.kelasi_api.domain.lecture;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lecture {
    @Id
    private String email;
    private String name, surname, phoneNumber;
    private String empNumber,  date;

    private Lecture(){}

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getDate() {
        return date;
    }

    public Lecture(Builder builder)
    {
        this.name = builder.name;
        this.surname = builder.surname;
        this.phoneNumber = builder.phoneNumber;
        this.empNumber = builder.empNumber;
        this.date = builder.date;
        this.email = builder.email;
    }

    public static class Builder
    {
        private String name, surname, phoneNumber;
        private String empNumber, email, date;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }

        public Builder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder empNumber(String empNumber){
            this.empNumber = empNumber;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder date(String date){
            this.date = date;
            return this;
        }


        public Lecture build(){
            return new Lecture(this);
        }
    }


    @Override
    public String toString() {
        return "Lecture{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + "," +
                " phoneNumber='" + phoneNumber + '\'' + ", empNumber='" + empNumber + '\'' + ", " +
                "email='" + email + '\'' + ", date='" + date + '\'' + '}';
    }
}
