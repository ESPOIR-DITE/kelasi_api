package kelasi.ac.za.kelasi_api.repository.admin;

import kelasi.ac.za.kelasi_api.domain.admin.KelasiAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KelasiAdminRep extends JpaRepository<KelasiAdmin,String> {
}
