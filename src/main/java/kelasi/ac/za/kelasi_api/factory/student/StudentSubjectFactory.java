package kelasi.ac.za.kelasi_api.factory.student;

import kelasi.ac.za.kelasi_api.domain.student.StudentSubject;
import kelasi.ac.za.kelasi_api.util.GeneratId;
import org.hibernate.mapping.IdGenerator;

import java.util.Date;

public class StudentSubjectFactory {
    public static StudentSubject getStudentSubject(String subjectId,String studentId,String courseId,Date date){
        return new StudentSubject.Builder(GeneratId.getId(StudentSubjectFactory.class))
                .buildCourseId(courseId)
                .buildDate(date)
                .buildStudentId(studentId)
                .buildSubjectId(subjectId)
                .build();
    }
}
