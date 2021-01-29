package kelasi.ac.za.kelasi_api.service.institution;

import kelasi.ac.za.kelasi_api.domain.institution.Institution;
import kelasi.ac.za.kelasi_api.domain.institution.InstitutionType;
import kelasi.ac.za.kelasi_api.repository.institution.InstitutionTypeRep;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class InstitutionTypeService implements Iservice<InstitutionType,String> {
    private static InstitutionTypeService institutionTypeService;
    @Autowired
    private InstitutionTypeRep institutionTypeRep;

    public static InstitutionTypeService getInstitutionTypeService() {
        if (institutionTypeService == null) {
            institutionTypeService = new InstitutionTypeService();
        }
        return institutionTypeService;
    }

    @Override
    public InstitutionType creat(InstitutionType institutionType) {
        return institutionTypeRep.save(institutionType);
    }

    @Override
    public InstitutionType update(InstitutionType institutionType) {
        return institutionTypeRep.save(institutionType);
    }

    @Override
    public InstitutionType read(String id) {
        return null;
    }

    @Override
    public boolean delete(InstitutionType institutionType) {
        return false;
    }

    @Override
    public List<InstitutionType> reaAll() {
        return null;
    }

    @Override
    public InstitutionType getHelp(String id) {
        Optional<InstitutionType> institutionOptional = institutionTypeRep.findById(id);
        return institutionOptional.orElse(null);
    }
}
