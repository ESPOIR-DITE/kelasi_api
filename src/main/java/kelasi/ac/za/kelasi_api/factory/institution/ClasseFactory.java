package kelasi.ac.za.kelasi_api.factory.institution;

import kelasi.ac.za.kelasi_api.domain.institution.Classe;
import kelasi.ac.za.kelasi_api.domain.student.StudentCourse;

import java.util.Date;

public class ClasseFactory {

    public static Classe getClasse(String id, String title, String description){
        return new Classe.Builder()
                .id(id)
                .title(title)
                .description(description)
                .build();
    }
}
