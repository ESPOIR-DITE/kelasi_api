package kelasi.ac.za.kelasi_api.factory.institution;

import kelasi.ac.za.kelasi_api.domain.institution.Classe;
import kelasi.ac.za.kelasi_api.domain.student.StudentCourse;

import java.util.Date;
import java.util.UUID;

public class ClasseFactory {

    public static Classe getClasse(String title, String description){
        return new Classe.Builder()
                .id(UUID.randomUUID().toString())
                .title(title)
                .description(description)
                .build();
    }
}
