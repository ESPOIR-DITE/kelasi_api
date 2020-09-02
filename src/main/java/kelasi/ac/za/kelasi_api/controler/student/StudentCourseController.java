package kelasi.ac.za.kelasi_api.controler.student;

import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.student.StudentCourse;
import kelasi.ac.za.kelasi_api.factory.student.StudentCourseFactory;
import kelasi.ac.za.kelasi_api.service.student.StudentCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("kelasi/student_course/")
public class StudentCourseController implements Icontroller<StudentCourse,String> {
    @Autowired
    private StudentCourseService studentCourseService;
    @PostMapping("create")
    @Override
    public StudentCourse creat(@RequestBody StudentCourse studentCourse) {
        StudentCourse studentCourse1 = StudentCourseFactory.getStudentCourse(studentCourse.getEmail(),studentCourse.getInstitutionId(),studentCourse.getCourseId(),studentCourse.getDate(),studentCourse.getInformation());
        return studentCourseService.creat(studentCourse1);
    }

    @PostMapping("update")
    @Override
    public StudentCourse update(@RequestBody StudentCourse studentCourse) {
        return studentCourseService.update(studentCourse);
    }

    @GetMapping("read")
    @Override
    public StudentCourse read(@RequestParam("id") String id) {
        return studentCourseService.read(id);
    }

    @PostMapping("delete")
    @Override
    public boolean delete(@RequestBody StudentCourse studentCourse) {
        return studentCourseService.delete(studentCourse);
    }

    @GetMapping("reads")
    @Override
    public List<StudentCourse> reaAll() {
        return studentCourseService.reaAll();
    }
}
