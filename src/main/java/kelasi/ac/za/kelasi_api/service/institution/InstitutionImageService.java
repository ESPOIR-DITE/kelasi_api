package kelasi.ac.za.kelasi_api.service.institution;

import kelasi.ac.za.kelasi_api.domain.institution.Institution;
import kelasi.ac.za.kelasi_api.domain.institution.InstitutionImage;
import kelasi.ac.za.kelasi_api.repository.institution.InstitutionImageRep;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class InstitutionImageService implements Iservice<InstitutionImage,String> {
    private static InstitutionImageService institutionImageService;

    @Autowired
    private InstitutionImageRep institutionImageRep;

    public static InstitutionImageService getInstitutionImageService() {

        if (institutionImageService == null) {
            institutionImageService = new InstitutionImageService();
        }        return institutionImageService;
    }

    @Override
    public InstitutionImage creat(InstitutionImage institutionImage) {
        return institutionImageRep.save(institutionImage);
    }

    @Override
    public InstitutionImage update(InstitutionImage institutionImage) {
        return institutionImageRep.save(institutionImage);
    }

    @Override
    public InstitutionImage read(String id) {
        return getHelp(id);
    }

    @Override
    public boolean delete(InstitutionImage institutionImage) {
        if(getHelp(institutionImage.getImageId())!=null){
            institutionImageRep.delete(institutionImage);
            return true;
        }
        return false;
    }

    @Override
    public List<InstitutionImage> reaAll() {
        return institutionImageRep.findAll();
    }
    public List<InstitutionImage> reaAllByInstitutionId(String institutionId) {
        return institutionImageRep.findAllByInstitutionId(institutionId);
    }
    public InstitutionImage reaByInstitutionId(String institutionId) {
        return institutionImageRep.findByInstitutionId(institutionId);
    }
    @Override
    public InstitutionImage getHelp(String id) {
        Optional<InstitutionImage> institutionImageOptional = institutionImageRep.findById(id);
        return institutionImageOptional.orElse(null);
    }
}
