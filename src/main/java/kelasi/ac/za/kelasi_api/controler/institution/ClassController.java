package kelasi.ac.za.kelasi_api.controler.institution;


import com.sun.xml.bind.v2.ClassFactory;
import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.institution.Classe;
import kelasi.ac.za.kelasi_api.factory.institution.ClasseFactory;
import kelasi.ac.za.kelasi_api.service.institution.CLassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("kelasi/class/")
public class ClassController implements Icontroller<Classe,String> {
    @Autowired
    private CLassService cLassService;
    @PostMapping("create")
    @Override
    public Classe creat(@RequestBody Classe classe) {
        Classe classe1 = ClasseFactory.getClasse(classe.getTitle(),classe.getDescription());
        return cLassService.creat(classe1);
    }

    @PostMapping("update")
    @Override
    public Classe update(@RequestBody Classe classe) {
        return cLassService.update(classe);
    }

    @GetMapping("read")
    @Override
    public Classe read(@RequestParam("id") String id) {
        return cLassService.read(id);
    }
    @GetMapping("delete")
    @Override
    public boolean delete(@RequestBody Classe classe) {
        return cLassService.delete(classe);
    }

    @GetMapping("reads")
    @Override
    public List<Classe> reaAll() {
        return cLassService.reaAll();
    }
}
