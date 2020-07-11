package kelasi.ac.za.kelasi_api.factory.lecture;

import kelasi.ac.za.kelasi_api.domain.lecture.Lecture;

public class LectureFactory
{
    public static Lecture getLecture(String name, String surname, String empNumber, String phoneNumber,String email, String date){
        return new Lecture.Builder()
                .name(name)
                .surname(surname)
                .empNumber(empNumber)
                .phoneNumber(phoneNumber)
                .email(email)
                .date(date)
                .build();
    }
}
