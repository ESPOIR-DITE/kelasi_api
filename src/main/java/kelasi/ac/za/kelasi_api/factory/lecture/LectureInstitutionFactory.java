package kelasi.ac.za.kelasi_api.factory.lecture;

import kelasi.ac.za.kelasi_api.domain.lecture.LectureInstitution;

public class LectureInstitutionFactory
{
    public static LectureInstitution getLectureInstitution(String email, String subject, String description, String institution, String date){
        return new LectureInstitution.Builder()
                .email(email)
                .description(description)
                .institution(institution)
                .subject(subject)
                .date(date)
                .build();
    }
}
