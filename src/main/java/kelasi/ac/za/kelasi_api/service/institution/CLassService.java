package kelasi.ac.za.kelasi_api.service.institution;

import kelasi.ac.za.kelasi_api.domain.institution.Classe;
import kelasi.ac.za.kelasi_api.repository.institution.ClassRep;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CLassService implements Iservice<Classe,String> {
    private static CLassService cLassService;
    @Autowired
    private ClassRep classRep;

    public static CLassService getcLassService() {
        if (cLassService == null) {
            cLassService = new CLassService();
        }
        return cLassService;
    }

    @Override
    public Classe creat(Classe classe) {
        return classRep.save(classe);
    }

    @Override
    public Classe update(Classe classe) {
        return classRep.save(classe);
    }

    @Override
    public Classe read(String id) {
        return getHelp(id);
    }

    @Override
    public boolean delete(Classe classe) {
        Classe classe1 = getHelp(classe.getId());
        if (classe1 != null) {
            classRep.delete(classe1);
            return true;
        }
        return false;
    }

    @Override
    public List<Classe> reaAll() {
        return classRep.findAll();
    }

    @Override
    public Classe getHelp(String id) {
        Optional<Classe> classeOptional = classRep.findById(id);
        return classeOptional.orElse(null);
    }
}
