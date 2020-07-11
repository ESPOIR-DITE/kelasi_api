package kelasi.ac.za.kelasi_api.factory.lecture;

import kelasi.ac.za.kelasi_api.domain.lecture.LectureRole;

public class LectureRoleFactory
{
    public static LectureRole getLectureRole(String roleId, String email, String date){
        return new LectureRole.Builder()
                .email(email)
                .roleId(roleId)
                .date(date)
                .build();
    }
}
