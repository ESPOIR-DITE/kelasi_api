package kelasi.ac.za.kelasi_api.service.student;

import kelasi.ac.za.kelasi_api.domain.student.StudentCourse;
import kelasi.ac.za.kelasi_api.repository.student.StudentCourseRepository;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentCourseService implements Iservice<StudentCourse,String> {
    @Autowired
    private StudentCourseRepository studentCourseRepository;

    private static StudentCourseService studentCourseService;

    public static StudentCourseService getStudentCourseService() {
        if (studentCourseService == null) {
            studentCourseService = new StudentCourseService();
        }
        return studentCourseService;
    }

    @Override
    public StudentCourse creat(StudentCourse studentCourse) {
        return studentCourseRepository.save(studentCourse);
    }

    @Override
    public StudentCourse update(StudentCourse studentCourse) {
        return studentCourseRepository.save(studentCourse);
    }

    @Override
    public StudentCourse read(String id) {
        return getHelp(id);
    }

    @Override
    public boolean delete(StudentCourse studentCourse) {
        StudentCourse studentCourse1 = getHelp(studentCourse.getCourseId());
        if (studentCourse1 != null) {
            studentCourseRepository.delete(studentCourse1);
            return true;
        }
        return false;
    }

    @Override
    public List<StudentCourse> reaAll() {
        return studentCourseRepository.findAll();
    }

    @Override
    public StudentCourse getHelp(String id) {
        Optional<StudentCourse> studentCourse = studentCourseRepository.findById(id);
        return studentCourse.orElse(null);
    }
}
