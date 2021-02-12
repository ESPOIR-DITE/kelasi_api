package kelasi.ac.za.kelasi_api.service.admin;

import kelasi.ac.za.kelasi_api.domain.admin.KelasiAdmin;
import kelasi.ac.za.kelasi_api.repository.admin.KelasiAdminRep;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KelasiAdminService implements Iservice<KelasiAdmin,String> {
    private KelasiAdminRep kelasiAdminRep;

    @Autowired
    public KelasiAdminService(KelasiAdminRep kelasiAdminRep) {
        this.kelasiAdminRep = kelasiAdminRep;
    }

    @Override
    public KelasiAdmin creat(KelasiAdmin kelasiAdmin) {
        return kelasiAdminRep.save(kelasiAdmin);
    }

    @Override
    public KelasiAdmin update(KelasiAdmin kelasiAdmin) {
        return kelasiAdminRep.save(kelasiAdmin);
    }

    @Override
    public KelasiAdmin read(String id) {
        Optional<KelasiAdmin> kelasiAdmin = kelasiAdminRep.findById(id);
        return kelasiAdmin.orElse(null);
    }

    @Override
    public boolean delete(KelasiAdmin kelasiAdmin) {
        Optional<KelasiAdmin> kelasiAdmin1 = kelasiAdminRep.findById(kelasiAdmin.getEmail());
        if (kelasiAdmin1.isPresent()) {
            kelasiAdminRep.delete(kelasiAdmin);
            return true;
        }
        return false;
    }

    @Override
    public List<KelasiAdmin> reaAll() {
        return kelasiAdminRep.findAll();
    }

    @Override
    public KelasiAdmin getHelp(String id) {
        return null;
    }
}
