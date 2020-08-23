package kelasi.ac.za.kelasi_api.factory.institution;

import kelasi.ac.za.kelasi_api.domain.institution.Institution;
import kelasi.ac.za.kelasi_api.domain.institution.InstitutionClass;

public class InstitutionClassFactory {

    public static InstitutionClass getInstitutionClass(String institutionId, String classId, String settes,
                                                       String status){
        return new InstitutionClass.Builder()
                .institutionId(institutionId)
                .classId(classId)
                .settes(settes)
                .status(status)
                .build();

    }
}

