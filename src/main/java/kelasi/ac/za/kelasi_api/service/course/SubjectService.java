package kelasi.ac.za.kelasi_api.service.course;

import kelasi.ac.za.kelasi_api.domain.course.subject.Subject;
import kelasi.ac.za.kelasi_api.repository.course.subject.SubjectRep;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService implements Iservice<Subject,String> {
    private static SubjectService subjectService;
    private SubjectRep subjectRep;

    public static SubjectService getSubjectService() {
        if (subjectService == null) {
            subjectService = new SubjectService();
        }
        return subjectService;
    }

    @Override
    public Subject creat(Subject subject) {
        return subjectRep.save(subject);
    }

    @Override
    public Subject update(Subject subject) {
        return subjectRep.save(subject);
    }

    @Override
    public Subject read(String id) {
        return getHelp(id);
    }

    @Override
    public boolean delete(Subject subject) {
        if(getHelp(subject.getId())!=null){
            subjectRep.delete(subject);
            return true;
        }
        return false;
    }

    @Override
    public List<Subject> reaAll() {
        return subjectRep.findAll();
    }

    @Override
    public Subject getHelp(String id) {
        Optional<Subject> subjectOptional = subjectRep.findById(id);
        return subjectOptional.orElse(null);
    }
}
