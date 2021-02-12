package kelasi.ac.za.kelasi_api.controler.institution;

import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.institution.Institution;
import kelasi.ac.za.kelasi_api.factory.institution.InstitutionFactory;
import kelasi.ac.za.kelasi_api.service.institution.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("kelasi/institution/")
public class InstitutionController implements Icontroller<Institution,String> {
    @Autowired
    private InstitutionService institutionService;
    @PostMapping("create")
    @Override
    public Institution creat(@RequestBody Institution institution) {
        Institution institution1 = InstitutionFactory.getInstitutionClass(institution.getName(),institution.getSlogan());
        return institutionService.creat(institution1);
    }
    @PostMapping("update")
    @Override
    public Institution update(@RequestBody Institution institution) {
        return institutionService.update(institution);
    }
    @GetMapping("read")
    @Override
    public Institution read(@RequestParam("id") String id) {
        return institutionService.read(id);
    }
    @GetMapping("delete")
    @Override
    public boolean delete(@RequestBody Institution institution) {
        return institutionService.delete(institution);
    }

    @GetMapping("reads")
    @Override
    public List<Institution> reaAll() {
        return institutionService.reaAll();
    }
}
