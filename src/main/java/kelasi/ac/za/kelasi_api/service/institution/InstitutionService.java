package kelasi.ac.za.kelasi_api.service.institution;

import kelasi.ac.za.kelasi_api.domain.institution.Institution;
import kelasi.ac.za.kelasi_api.repository.institution.InstitutionRep;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstitutionService implements Iservice<Institution,String> {
    @Autowired
    InstitutionRep institutionRep;
    private InstitutionService institutionService;

    public InstitutionService getInstitutionService() {
        if (institutionService == null) {
            institutionService = new InstitutionService();
        }
        return institutionService;
    }

    @Override
    public Institution creat(Institution institution) {
        return institutionRep.save(institution);
    }

    @Override
    public Institution update(Institution institution) {
        return institutionRep.save(institution);
    }

    @Override
    public Institution read(String id) {
        Optional<Institution> institutionOptional = institutionRep.findById(id);
        return institutionOptional.orElse(null);
    }

    @Override
    public boolean delete(Institution institution) {
        Institution institution1 = read(institution.getId());
        if (institution1 != null) {
            institutionRep.delete(institution1);
            return true;
        }
        return false;
    }

    @Override
    public List<Institution> reaAll() {
        return institutionRep.findAll();
    }

    @Override
    public Institution getHelp(String id) {
        return null;
    }
}
