package kelasi.ac.za.kelasi_api.controler.admin;

import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.admin.SchoolAdmin;
import kelasi.ac.za.kelasi_api.service.admin.SchoolAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kelasi/schooladmin")
public class SchoolAdminController implements Icontroller<SchoolAdmin,String> {

    SchoolAdminService schoolAdminService;

    @Autowired
    public SchoolAdminController(SchoolAdminService schoolAdminService) {
        this.schoolAdminService = schoolAdminService;
    }

    @PostMapping("create")
    @Override
    public SchoolAdmin creat(@RequestBody SchoolAdmin schoolAdmin) {
        return schoolAdminService.creat(schoolAdmin);
    }

    @PostMapping("update")
    @Override
    public SchoolAdmin update(@RequestBody SchoolAdmin schoolAdmin) {
        return schoolAdminService.update(schoolAdmin);
    }

    @GetMapping("read")
    @Override
    public SchoolAdmin read(@RequestParam("id") String id) {
        return schoolAdminService.read(id);
    }

    @GetMapping("delete")
    @Override
    public boolean delete(@RequestParam("id") SchoolAdmin schoolAdmin) {
        return schoolAdminService.delete(schoolAdmin);
    }

    @Override
    public List<SchoolAdmin> reaAll() {
        return null;
    }
}
