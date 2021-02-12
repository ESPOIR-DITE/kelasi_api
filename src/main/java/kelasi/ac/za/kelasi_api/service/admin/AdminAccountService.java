package kelasi.ac.za.kelasi_api.service.admin;

import kelasi.ac.za.kelasi_api.domain.admin.AdminAccount;
import kelasi.ac.za.kelasi_api.repository.admin.AdminAccountRepository;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminAccountService implements Iservice<AdminAccount,String> {

    private AdminAccountRepository adminAccountRepository;

    @Autowired
    public AdminAccountService(AdminAccountRepository adminAccountRepository) {
        this.adminAccountRepository = adminAccountRepository;
    }

    @Override
    public AdminAccount creat(AdminAccount adminAccount) {
        return adminAccountRepository.save(adminAccount);
    }

    @Override
    public AdminAccount update(AdminAccount adminAccount) {
        return adminAccountRepository.save(adminAccount);
    }

    @Override
    public AdminAccount read(String id) {
        Optional<AdminAccount> adminAccount = adminAccountRepository.findById(id);
        return adminAccount.orElse(null);
    }

    @Override
    public boolean delete(AdminAccount adminAccount) {
        AdminAccount adminAccount1 = read(adminAccount.getId());
        if (adminAccount1 != null) {
            adminAccountRepository.delete(adminAccount1);
            return true;
        }
        return false;
    }

    @Override
    public List<AdminAccount> reaAll() {
        return adminAccountRepository.findAll();
    }

    @Override
    public AdminAccount getHelp(String id) {
        return null;
    }
}
