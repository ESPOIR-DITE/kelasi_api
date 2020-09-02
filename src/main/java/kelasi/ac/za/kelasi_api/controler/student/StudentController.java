package kelasi.ac.za.kelasi_api.controler.student;

import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.student.Student;
import kelasi.ac.za.kelasi_api.factory.student.StudentFactory;
import kelasi.ac.za.kelasi_api.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("kelasi/student/")
public class StudentController implements Icontroller<Student,String> {
    @Autowired
    private StudentService studentService;

    @PostMapping("create")
    @Override
    public Student creat(@RequestBody Student student) {
        return studentService.creat(student);
    }

    @PostMapping("update")
    @Override
    public Student update(@RequestBody Student student) {
        return studentService.update(student);
    }

    @GetMapping("read")
    @Override
    public Student read(@RequestParam("id") String id) {
        return studentService.read(id);
    }

    @PostMapping("delete")
    @Override
    public boolean delete(@RequestParam("id") Student student) {
        return studentService.delete(student);
    }

    @GetMapping("reads")
    @Override
    public List<Student> reaAll() {
        return studentService.reaAll();
    }
}
