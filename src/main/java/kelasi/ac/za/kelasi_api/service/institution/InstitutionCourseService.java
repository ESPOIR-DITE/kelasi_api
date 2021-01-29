package kelasi.ac.za.kelasi_api.service.institution;

import kelasi.ac.za.kelasi_api.domain.institution.InstitutionCourse;
import kelasi.ac.za.kelasi_api.repository.institution.InstitutionCourseRep;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class InstitutionCourseService implements Iservice<InstitutionCourse,String> {
    private static InstitutionCourseService institutionCourseService;
    private InstitutionCourseRep institutionCourseRep;

    public static InstitutionCourseService getInstitutionCourseService() {

        if (institutionCourseService == null) {
            institutionCourseService = new InstitutionCourseService();
        }        return institutionCourseService;
    }

    @Override
    public InstitutionCourse creat(InstitutionCourse institutionCourse) {
        return institutionCourseRep.save(institutionCourse);
    }

    @Override
    public InstitutionCourse update(InstitutionCourse institutionCourse) {
        return institutionCourseRep.save(institutionCourse);
    }

    @Override
    public InstitutionCourse read(String id) {
        return getHelp(id);
    }

    @Override
    public boolean delete(InstitutionCourse institutionCourse) {
        if(getHelp(institutionCourse.getId())!=null){
            institutionCourseRep.delete(institutionCourse);
            return true;
        }
        return false;
    }

    @Override
    public List<InstitutionCourse> reaAll() {
        return institutionCourseRep.findAll();
    }

    @Override
    public InstitutionCourse getHelp(String id) {
        Optional<InstitutionCourse> institutionCourse = institutionCourseRep.findById(id);
        return institutionCourse.orElse(null);
    }
}
