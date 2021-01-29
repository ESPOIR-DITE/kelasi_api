package kelasi.ac.za.kelasi_api.factory.course;

import kelasi.ac.za.kelasi_api.domain.course.subject.Subject;

import java.util.UUID;

public class SubjectFactory {
    public static Subject getSubject(Subject subject){
        return new Subject.Builder(UUID.randomUUID().toString())
                .buildCode(subject.getCode())
                .buildDescription(subject.getDescription())
                .buildName(subject.getName())
                .build();
    }
}
