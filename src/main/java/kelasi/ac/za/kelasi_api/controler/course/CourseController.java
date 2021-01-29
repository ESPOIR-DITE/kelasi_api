package kelasi.ac.za.kelasi_api.controler.course;

import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.course.Course;
import kelasi.ac.za.kelasi_api.factory.course.CourseFactory;
import kelasi.ac.za.kelasi_api.service.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("kelasi/course/")
public class CourseController implements Icontroller<Course,String> {
    @Autowired
    private CourseService courseService;

    @PostMapping("create")
    @Override
    public Course creat(@RequestBody Course course) {
        Course course1  = CourseFactory.getCourse(course);
        return courseService.creat(course1);
    }

    @PostMapping("update")
    @Override
    public Course update(@RequestBody Course course) {
        return courseService.update(course);
    }

    @GetMapping("read")
    @Override
    public Course read(@RequestParam("id") String id) {
        return courseService.read(id);
    }

    @GetMapping("delete")
    @Override
    public boolean delete(@RequestParam("id") Course course) {
        return courseService.delete(course);
    }
@GetMapping("reads")
    @Override
    public List<Course> reaAll() {
        return courseService.reaAll();
    }
}
