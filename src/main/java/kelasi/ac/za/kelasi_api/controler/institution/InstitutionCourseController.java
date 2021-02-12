package kelasi.ac.za.kelasi_api.controler.institution;

import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.institution.InstitutionCourse;
import kelasi.ac.za.kelasi_api.factory.institution.InstitutionCourseFactory;
import kelasi.ac.za.kelasi_api.service.institution.InstitutionCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("kelasi/institutionCourse/")
public class InstitutionCourseController implements Icontroller<InstitutionCourse,String> {
    @Autowired
    private InstitutionCourseService institutionCourseService;
    @PostMapping("create")
    @Override
    public InstitutionCourse creat(@RequestBody InstitutionCourse institution) {
        InstitutionCourse institution1 = InstitutionCourseFactory.getInstitutionCourse(institution);
        return institutionCourseService.creat(institution1);
    }
    @PostMapping("update")
    @Override
    public InstitutionCourse update(@RequestBody InstitutionCourse institution) {
        return institutionCourseService.update(institution);
    }
    @GetMapping("read")
    @Override
    public InstitutionCourse read(@RequestParam("id") String id) {
        return institutionCourseService.read(id);
    }
    @GetMapping("delete")
    @Override
    public boolean delete(@RequestBody InstitutionCourse institution) {
        return institutionCourseService.delete(institution);
    }

    @GetMapping("reads")
    @Override
    public List<InstitutionCourse> reaAll() {
        return institutionCourseService.reaAll();
    }
}
