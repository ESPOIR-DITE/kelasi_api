package kelasi.ac.za.kelasi_api.repository.admin;

import kelasi.ac.za.kelasi_api.domain.admin.SchoolAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolAdminRep extends JpaRepository<SchoolAdmin,String> {
}
