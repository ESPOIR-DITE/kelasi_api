package kelasi.ac.za.kelasi_api.service.student;

import kelasi.ac.za.kelasi_api.domain.student.StudentSubject;
import kelasi.ac.za.kelasi_api.repository.student.StudentSubjectRepository;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentSubjectService implements Iservice<StudentSubject,String> {
    @Autowired
    private StudentSubjectRepository studentSubjectRepository;
    private static StudentSubjectService studentSubjectService;

    public static StudentSubjectService getStudentSubjectService() {
        if (studentSubjectService == null) {
            studentSubjectService = new StudentSubjectService();
        }
        return studentSubjectService;
    }

    @Override
    public StudentSubject creat(StudentSubject studentSubject) {
        return studentSubjectRepository.save(studentSubject);
    }

    @Override
    public StudentSubject update(StudentSubject studentSubject) {
        return studentSubjectRepository.save(studentSubject);
    }

    @Override
    public StudentSubject read(String id) {
        return getHelp(id);
    }

    @Override
    public boolean delete(StudentSubject studentSubject) {
        StudentSubject studentSubject1 = getHelp(studentSubject.getId());
        if (studentSubject1 != null) {
            studentSubjectRepository.delete(studentSubject1);
            return true;
        }
        return false;
    }

    @Override
    public List<StudentSubject> reaAll() {
        return studentSubjectRepository.findAll();
    }

    @Override
    public StudentSubject getHelp(String id) {
        Optional<StudentSubject> result = studentSubjectRepository.findById(id);
        return result.orElse(null);
    }
}
