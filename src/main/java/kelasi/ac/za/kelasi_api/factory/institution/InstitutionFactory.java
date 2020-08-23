package kelasi.ac.za.kelasi_api.factory.institution;

import kelasi.ac.za.kelasi_api.domain.institution.Institution;

public class InstitutionFactory {

    public static Institution getInstitutionClass(String id, String name, String slogan){
        return new Institution.Builder()
                .id(id)
                .name(name)
                .slogan(slogan)
                .build();

    }
}
