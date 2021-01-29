package kelasi.ac.za.kelasi_api.controler.institution;

import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.institution.InstitutionType;
import kelasi.ac.za.kelasi_api.factory.institution.InstitutionTypeFactory;
import kelasi.ac.za.kelasi_api.service.institution.InstitutionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("kelasi/institutionType/")
public class InstitutionTypeController implements Icontroller<InstitutionType,String> {
    @Autowired
    private InstitutionTypeService institutionTypeService;
    @PostMapping("create")
    @Override
    public InstitutionType creat(@RequestBody InstitutionType institution) {
        InstitutionType institution1 = InstitutionTypeFactory.getInstitutionType(institution.getInstitutionId(),institution.getTypeOfInstitutionId());
        return institutionTypeService.creat(institution1);
    }
    @PostMapping("update")
    @Override
    public InstitutionType update(@RequestBody InstitutionType institution) {
        return institutionTypeService.update(institution);
    }
    @GetMapping("read")
    @Override
    public InstitutionType read(@RequestParam("id") String id) {
        return institutionTypeService.read(id);
    }
    @GetMapping("delete")
    @Override
    public boolean delete(@RequestBody InstitutionType institution) {
        return institutionTypeService.delete(institution);
    }

    @GetMapping("reads")
    @Override
    public List<InstitutionType> reaAll() {
        return institutionTypeService.reaAll();
    }
}
