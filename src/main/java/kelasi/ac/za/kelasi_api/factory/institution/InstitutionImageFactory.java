package kelasi.ac.za.kelasi_api.factory.institution;

import kelasi.ac.za.kelasi_api.domain.institution.InstitutionImage;

import java.util.UUID;

public class InstitutionImageFactory {

    public static InstitutionImage getInstitutionImage(String institutionId, String imageId, String imageTypeId
    , String description){
        return new InstitutionImage.Builder(UUID.randomUUID().toString())
                .institutionId(institutionId)
                .imageId(imageId)
                .imageTypeId(imageTypeId)
                .description(description)
                .build();

    }
}

