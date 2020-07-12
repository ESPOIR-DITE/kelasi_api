package kelasi.ac.za.kelasi_api.factory.student;

import kelasi.ac.za.kelasi_api.domain.student.StudentCourse;

import java.util.Date;

public class StudentCourseFactory {
    public static StudentCourse getStudentCourse(String email,String institutionId,String courseId,Date date,String information){
        return new StudentCourse.Builder()
                .buildCourseId(courseId)
                .buildDate(date)
                .buildEmail(email)
                .buildInformation(information)
                .buildInstitutionId(institutionId)
                .build();
    }
}
