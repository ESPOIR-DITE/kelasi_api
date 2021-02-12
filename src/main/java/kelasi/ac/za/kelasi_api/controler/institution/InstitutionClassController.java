package kelasi.ac.za.kelasi_api.controler.institution;

import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.institution.InstitutionClass;
import kelasi.ac.za.kelasi_api.factory.institution.InstitutionClassFactory;
import kelasi.ac.za.kelasi_api.service.institution.InstitutionClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("kelasi/institutionClass/")
public class InstitutionClassController implements Icontroller<InstitutionClass,String> {
    @Autowired
    private InstitutionClassService institutionClassService;
    @PostMapping("create")
    @Override
    public InstitutionClass creat(@RequestBody InstitutionClass institution) {
        InstitutionClass institution1 = InstitutionClassFactory.getInstitutionClass(institution);
        return institutionClassService.creat(institution1);
    }
    @PostMapping("update")
    @Override
    public InstitutionClass update(@RequestBody InstitutionClass institution) {
        return institutionClassService.update(institution);
    }
    @GetMapping("read")
    @Override
    public InstitutionClass read(@RequestParam("id") String id) {
        return institutionClassService.read(id);
    }
    @GetMapping("delete")
    @Override
    public boolean delete(@RequestBody InstitutionClass institution) {
        return institutionClassService.delete(institution);
    }

    @GetMapping("reads")
    @Override
    public List<InstitutionClass> reaAll() {
        return institutionClassService.reaAll();
    }
}
