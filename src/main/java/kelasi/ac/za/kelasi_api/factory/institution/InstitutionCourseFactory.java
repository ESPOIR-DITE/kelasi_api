package kelasi.ac.za.kelasi_api.factory.institution;

import kelasi.ac.za.kelasi_api.domain.institution.InstitutionCourse;

import java.util.UUID;

public class InstitutionCourseFactory {

    public static InstitutionCourse getInstitutionCourse(InstitutionCourse institutionCourse){
        return new InstitutionCourse.Builder()
                .email(institutionCourse.getEmail())
                .institutionId(institutionCourse.getInstitutionId())
                .course(institutionCourse.getCourse())
                .date(institutionCourse.getDate())
                .information(institutionCourse.getInformation())
                .buildId(UUID.randomUUID().toString())
                .build();
    }
}
