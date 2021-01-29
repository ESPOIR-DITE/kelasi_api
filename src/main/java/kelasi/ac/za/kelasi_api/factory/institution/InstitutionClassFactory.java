package kelasi.ac.za.kelasi_api.factory.institution;

import kelasi.ac.za.kelasi_api.domain.institution.Institution;
import kelasi.ac.za.kelasi_api.domain.institution.InstitutionClass;
import kelasi.ac.za.kelasi_api.domain.institution.InstitutionCourse;

import java.util.UUID;

public class InstitutionClassFactory {

    public static InstitutionClass getInstitutionClass(InstitutionClass institutionClass){
        return new InstitutionClass.Builder(UUID.randomUUID().toString())
                .institutionId(institutionClass.getInstitutionId())
                .classId(institutionClass.getClassId())
                .settes(institutionClass.getSettes())
                .status(institutionClass.getStatus())
                .build();

    }
}

