package kelasi.ac.za.kelasi_api.service.institution;

import kelasi.ac.za.kelasi_api.domain.institution.InstitutionClass;
import kelasi.ac.za.kelasi_api.repository.institution.InstitutionClassRep;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class InstitutionClassService implements Iservice<InstitutionClass,String> {
    private static InstitutionClassService institutionClassService;
@Autowired
    private InstitutionClassRep institutionClassRep;

    public static InstitutionClassService getInstitutionClassService() {
        if (institutionClassService == null) {
            institutionClassService = new InstitutionClassService();
        }
            return institutionClassService;
    }

    @Override
    public InstitutionClass creat(InstitutionClass institutionClass) {
        return institutionClassRep.save(institutionClass);
    }

    @Override
    public InstitutionClass update(InstitutionClass institutionClass) {
        return institutionClassRep.save(institutionClass);
    }

    @Override
    public InstitutionClass read(String id) {
        return getHelp(id);
    }

    @Override
    public boolean delete(InstitutionClass institutionClass) {
        InstitutionClass institutionClass1 = getHelp(institutionClass.getClassId());
        if (institutionClass1 != null) {
            institutionClassRep.delete(institutionClass1);
            return true;
        }
        return false;
    }

    @Override
    public List<InstitutionClass> reaAll() {
        return institutionClassRep.findAll();
    }

    @Override
    public InstitutionClass getHelp(String id) {
        Optional<InstitutionClass> institutionClassOptional = institutionClassRep.findById(id);
        return institutionClassOptional.orElse(null);
    }
}
