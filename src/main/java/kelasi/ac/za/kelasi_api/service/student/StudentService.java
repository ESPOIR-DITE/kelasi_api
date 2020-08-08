package kelasi.ac.za.kelasi_api.service.student;

import kelasi.ac.za.kelasi_api.domain.student.Student;
import kelasi.ac.za.kelasi_api.repository.student.StudentRepository;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements Iservice<Student,String> {
    @Autowired
    private StudentRepository studentRepository;
    private static StudentService studentService;

    public static StudentService getStudentService() {
        if (studentService == null) {
            studentService= new StudentService();
        }
        return studentService;
    }

    @Override
    public Student creat(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        Student student1 = getHelp(student.getEmail());
        if (student1 != null) {
            studentRepository.delete(student1);
            return creat(student);
        }
        return null;
    }

    @Override
    public Student read(String id) {
        return getHelp(id);
    }

    @Override
    public boolean delete(Student student) {
        Student student1 = getHelp(student.getEmail());
        if (student1 != null) {
            studentRepository.delete(student1);
            return true;
        }
        return false;
    }

    @Override
    public List<Student> reaAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getHelp(String id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.orElse(null);
    }
}
