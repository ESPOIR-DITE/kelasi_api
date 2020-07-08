package kelasi.ac.za.kelasi_api.factory.student;

import kelasi.ac.za.kelasi_api.domain.student.Student;

import java.util.Date;

/****
 * This class will help us to get User Object
 * The method in it should be static and should return User Object.
 */
public class StudentFactory {
    public static Student getStudent(String email,String studentNumber,String name,String surname,String middleName,Date dateOdBirth,String phoneNumber){
        return new Student.Builder(email)
                .buildDateOfBirth(dateOdBirth)
                .buildMiddleName(middleName)
                .buildName(name)
                .buildPhoneNumber(phoneNumber)
                .buildStudentNumber("Need to be generated")
                .buildSurname(surname)
                .build();
    }
}
