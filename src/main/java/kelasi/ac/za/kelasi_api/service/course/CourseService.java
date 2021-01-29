package kelasi.ac.za.kelasi_api.service.course;

import kelasi.ac.za.kelasi_api.domain.course.Course;
import kelasi.ac.za.kelasi_api.repository.course.CourseRep;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CourseService implements Iservice<Course,String> {
    private static  CourseService courseService;
    @Autowired
    private CourseRep courseRep;

    public static CourseService getCourseService() {

        if (courseService == null) {
            courseService = new CourseService();
        }
        return courseService;
    }

    @Override
    public Course creat(Course course) {
        return courseRep.save(course);
    }

    @Override
    public Course update(Course course) {
        return courseRep.save(course);
    }

    @Override
    public Course read(String id) {
        return getHelp(id);
    }

    @Override
    public boolean delete(Course course) {
        if(getHelp(course.getId())!=null){
            courseRep.delete(course);
            return true;
        }
        return false;
    }

    @Override
    public List<Course> reaAll() {
        return courseRep.findAll();
    }

    @Override
    public Course getHelp(String id) {
        Optional<Course> courseOptional =courseRep.findById(id);
        return courseOptional.orElse(null);
    }
}
