package kelasi.ac.za.kelasi_api.factory.institution;

import kelasi.ac.za.kelasi_api.domain.institution.Institution;

import java.util.UUID;

public class InstitutionFactory {

    public static Institution getInstitutionClass(String name, String slogan){
        return new Institution.Builder()
                .id(UUID.randomUUID().toString())
                .name(name)
                .slogan(slogan)
                .build();

    }
}
