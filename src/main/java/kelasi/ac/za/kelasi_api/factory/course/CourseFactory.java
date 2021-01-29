package kelasi.ac.za.kelasi_api.factory.course;

import kelasi.ac.za.kelasi_api.domain.course.Course;

import java.util.UUID;

public class CourseFactory {
    public static Course getCourse(Course course){
        return new Course.Builder(UUID.randomUUID().toString())
                .buildCourseName(course.getCourseName())
                .buildDescription(course.getDescription())
                .build();
    }
}
