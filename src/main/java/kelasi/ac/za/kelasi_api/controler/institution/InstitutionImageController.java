package kelasi.ac.za.kelasi_api.controler.institution;

import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.institution.InstitutionImage;
import kelasi.ac.za.kelasi_api.factory.institution.InstitutionImageFactory;
import kelasi.ac.za.kelasi_api.service.institution.InstitutionImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("kelasi/institutionImage/")
public class InstitutionImageController implements Icontroller<InstitutionImage,String> {
    @Autowired
    private InstitutionImageService institutionImageService;
    @PostMapping("create")
    @Override
    public InstitutionImage creat(@RequestBody InstitutionImage institutionImage) {
        InstitutionImage institution1 = InstitutionImageFactory.getInstitutionImage(institutionImage.getInstitutionId(),institutionImage.getImageId(),institutionImage.getImageTypeId(),institutionImage.getDescription());
        return institutionImageService.creat(institution1);
    }
    @PostMapping("update")
    @Override
    public InstitutionImage update(@RequestBody InstitutionImage institution) {
        return institutionImageService.update(institution);
    }
    @GetMapping("read")
    @Override
    public InstitutionImage read(@RequestParam("id") String id) {
        return institutionImageService.read(id);
    }
    @GetMapping("delete")
    @Override
    public boolean delete(@RequestBody InstitutionImage institution) {
        return institutionImageService.delete(institution);
    }

    @Override
    public List<InstitutionImage> reaAll() {
        return institutionImageService.reaAll();
    }
}
