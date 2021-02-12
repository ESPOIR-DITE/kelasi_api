package kelasi.ac.za.kelasi_api.repository.admin;

import kelasi.ac.za.kelasi_api.domain.admin.AdminAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminAccountRepository extends JpaRepository<AdminAccount,String> {
}
