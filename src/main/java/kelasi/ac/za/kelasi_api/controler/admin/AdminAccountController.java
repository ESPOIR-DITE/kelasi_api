package kelasi.ac.za.kelasi_api.controler.admin;

import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.admin.AdminAccount;
import kelasi.ac.za.kelasi_api.service.admin.AdminAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kelasi/dmin")
public class AdminAccountController implements Icontroller<AdminAccount,String> {
    private AdminAccountService adminAccountService;

    @Autowired
    public AdminAccountController(AdminAccountService adminAccountService) {
        this.adminAccountService = adminAccountService;
    }

    @PostMapping("create")
    @Override
    public AdminAccount creat(@RequestBody AdminAccount adminAccount) {
        return adminAccountService.creat(adminAccount);
    }
    @PostMapping("update")
    @Override
    public AdminAccount update(@RequestBody AdminAccount adminAccount) {
        return adminAccountService.update(adminAccount);
    }

    @GetMapping("read")
    @Override
    public AdminAccount read(@RequestParam("id") String id) {
        return adminAccountService.read(id);
    }

    @GetMapping("delete")
    @Override
    public boolean delete(@RequestParam("id") AdminAccount adminAccount) {
        return adminAccountService.delete(adminAccount);
    }

    @GetMapping("reads")
    @Override
    public List<AdminAccount> reaAll() {
        return adminAccountService.reaAll();
    }
}
