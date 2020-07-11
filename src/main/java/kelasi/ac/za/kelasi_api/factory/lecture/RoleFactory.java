package kelasi.ac.za.kelasi_api.factory.lecture;

import kelasi.ac.za.kelasi_api.domain.lecture.Role;

public class RoleFactory
{
    public static Role getRole(String role, String Id){
        return new Role.Builder()
                .Id(Id)
                .role(role)
                .build();
    }
}
