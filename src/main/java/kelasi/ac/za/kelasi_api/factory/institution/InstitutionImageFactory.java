package kelasi.ac.za.kelasi_api.factory.institution;

import kelasi.ac.za.kelasi_api.domain.institution.InstitutionImage;

public class InstitutionImageFactory {

    public static InstitutionImage getInstitutionImage(String institutionId, String imageId, String imageTypeId
    , String description){
        return new InstitutionImage.Builder()
                .institutionId(institutionId)
                .imageId(imageId)
                .imageTypeId(imageTypeId)
                .description(description)
                .build();

    }
}

