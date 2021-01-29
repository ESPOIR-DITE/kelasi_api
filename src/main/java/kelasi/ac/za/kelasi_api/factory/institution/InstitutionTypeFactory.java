package kelasi.ac.za.kelasi_api.factory.institution;

import kelasi.ac.za.kelasi_api.domain.institution.InstitutionType;

import java.util.UUID;

public class InstitutionTypeFactory {

    public static InstitutionType getInstitutionType(String typeOfInstitutionId,String description){
        return new InstitutionType.Builder(UUID.randomUUID().toString()).buildDescription(description).buildTypeOfInstitution(typeOfInstitutionId)
                .build();


    }
}
