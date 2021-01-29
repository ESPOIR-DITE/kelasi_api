package kelasi.ac.za.kelasi_api.repository.lecture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Lecture extends JpaRepository<Lecture,String> {
}
