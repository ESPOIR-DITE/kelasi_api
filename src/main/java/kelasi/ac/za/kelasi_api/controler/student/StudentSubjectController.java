package kelasi.ac.za.kelasi_api.controler.student;

import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.student.StudentSubject;
import kelasi.ac.za.kelasi_api.factory.student.StudentSubjectFactory;
import kelasi.ac.za.kelasi_api.service.student.StudentSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("kelasi/student_subject/")
public class StudentSubjectController implements Icontroller<StudentSubject,String> {
    @Autowired
    private StudentSubjectService studentSubjectService;

    @PostMapping("create")
    @Override
    public StudentSubject creat(@RequestBody StudentSubject studentSubject) {
        StudentSubject studentSubject1 = StudentSubjectFactory.getStudentSubject(studentSubject.getSubjectId(),studentSubject.getStudentId(),studentSubject.getCourseId(),studentSubject.getDate());
        return studentSubjectService.creat(studentSubject1);
    }

    @PostMapping("update")
    @Override
    public StudentSubject update(@RequestBody StudentSubject studentSubject) {
        return studentSubjectService.update(studentSubject);
    }

    @GetMapping("read")
    @Override
    public StudentSubject read(@RequestParam("id") String id) {
        return studentSubjectService.read(id);
    }

    @PostMapping("delete")
    @Override
    public boolean delete(@RequestBody StudentSubject studentSubject) {
        return studentSubjectService.delete(studentSubject);
    }

    @GetMapping("reads")
    @Override
    public List<StudentSubject> reaAll() {
        return studentSubjectService.reaAll();
    }
}
