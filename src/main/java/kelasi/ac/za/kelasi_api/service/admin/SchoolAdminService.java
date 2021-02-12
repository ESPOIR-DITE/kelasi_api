package kelasi.ac.za.kelasi_api.service.admin;

import kelasi.ac.za.kelasi_api.domain.admin.SchoolAdmin;
import kelasi.ac.za.kelasi_api.repository.admin.SchoolAdminRep;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolAdminService implements Iservice<SchoolAdmin,String> {

    private SchoolAdminRep schoolAdminRep;

    @Autowired
    public SchoolAdminService(SchoolAdminRep schoolAdminRep) {
        this.schoolAdminRep = schoolAdminRep;
    }

    @Override
    public SchoolAdmin creat(SchoolAdmin schoolAdmin) {
        return schoolAdminRep.save(schoolAdmin);
    }

    @Override
    public SchoolAdmin update(SchoolAdmin schoolAdmin) {
        return schoolAdminRep.save(schoolAdmin);
    }

    @Override
    public SchoolAdmin read(String id) {
        Optional<SchoolAdmin> schoolAdmin= schoolAdminRep.findById(id);
        return schoolAdmin.orElse(null);
    }

    @Override
    public boolean delete(SchoolAdmin schoolAdmin) {
        SchoolAdmin schoolAdmin1 = schoolAdminRep.getOne(schoolAdmin.getEmail());
        if (schoolAdmin1 != null) {
            schoolAdminRep.delete(schoolAdmin);
            return true;
        }
        return false;
    }

    @Override
    public List<SchoolAdmin> reaAll() {
        return schoolAdminRep.findAll();
    }

    @Override
    public SchoolAdmin getHelp(String id) {
        return null;
    }
}
