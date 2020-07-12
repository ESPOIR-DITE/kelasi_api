package kelasi.ac.za.kelasi_api.factory.lecture;

import kelasi.ac.za.kelasi_api.domain.lecture.RoleOfLecture;

public class RoleFactory
{
    public static RoleOfLecture getRole(String role, String Id){
        return new RoleOfLecture.Builder()
                .Id(Id)
                .role(role)
                .build();
    }
}
