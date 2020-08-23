package kelasi.ac.za.kelasi_api.factory.institution;

import kelasi.ac.za.kelasi_api.domain.institution.InstitutionCourse;

public class InstitutionCourseFactory {

    public static InstitutionCourse getInstitutionCourse(String email, String institutionid, String course
    , String date, String information){
        return new InstitutionCourse.Builder()
                .email(email)
                .institutionId(institutionid)
                .course(course)
                .date(date)
                .information(information)
                .build();

    }
}
