package kelasi.ac.za.kelasi_api.controler.admin;

import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.admin.KelasiAdmin;
import kelasi.ac.za.kelasi_api.service.admin.KelasiAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kelasi/kelasiadmin")
public class KelasiAdminController implements Icontroller<KelasiAdmin,String> {
    private KelasiAdminService kelasiAdminService;

    @Autowired
    public KelasiAdminController(KelasiAdminService kelasiAdminService) {
        this.kelasiAdminService = kelasiAdminService;
    }

    @PostMapping("create")
    @Override
    public KelasiAdmin creat(@RequestBody KelasiAdmin kelasiAdmin) {
        return kelasiAdminService.creat(kelasiAdmin);
    }

    @PostMapping("update")
    @Override
    public KelasiAdmin update(@RequestBody KelasiAdmin kelasiAdmin) {
        return kelasiAdminService.update(kelasiAdmin);
    }

    @GetMapping("read")
    @Override
    public KelasiAdmin read(@RequestParam("id") String id) {
        return kelasiAdminService.read(id);
    }

    @GetMapping("delete")
    @Override
    public boolean delete(@RequestParam("id") KelasiAdmin kelasiAdmin) {
        return kelasiAdminService.delete(kelasiAdmin);
    }

    @Override
    public List<KelasiAdmin> reaAll() {
        return kelasiAdminService.reaAll();
    }
}
