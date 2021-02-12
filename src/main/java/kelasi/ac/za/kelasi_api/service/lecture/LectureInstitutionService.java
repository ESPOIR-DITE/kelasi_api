package kelasi.ac.za.kelasi_api.service.lecture;

import kelasi.ac.za.kelasi_api.domain.lecture.LectureInstitution;
import kelasi.ac.za.kelasi_api.repository.lecture.LectureInstitutionRep;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LectureInstitutionService implements Iservice<LectureInstitution,String> {
    private LectureInstitutionRep lectureInstitutionRep;

    @Autowired
    public LectureInstitutionService(LectureInstitutionRep lectureInstitutionRep) {
        this.lectureInstitutionRep = lectureInstitutionRep;
    }

    @Override
    public LectureInstitution creat(LectureInstitution lectureInstitution) {
        return lectureInstitutionRep.save(lectureInstitution);
    }

    @Override
    public LectureInstitution update(LectureInstitution lectureInstitution) {
        return lectureInstitutionRep.save(lectureInstitution);
    }

    @Override
    public LectureInstitution read(String id) {
        Optional<LectureInstitution> lectureInstitution = lectureInstitutionRep.findById(id);
        return lectureInstitution.orElse(null);
    }

    @Override
    public boolean delete(LectureInstitution lectureInstitution) {
        LectureInstitution lectureInstitution1 = read(lectureInstitution.getId());
        if (lectureInstitution1 == null) {
            lectureInstitutionRep.delete(lectureInstitution);
            return true;
        }
        return false;
    }

    @Override
    public List<LectureInstitution> reaAll() {
        return lectureInstitutionRep.findAll();
    }

    @Override
    public LectureInstitution getHelp(String id) {
        return null;
    }
    public List<LectureInstitution> findAllByInstitution(String institutionId){
        return lectureInstitutionRep.findAllByInstitution(institutionId);
    }
    public List<LectureInstitution> findAllByEmail(String lectureEmail){
        return lectureInstitutionRep.findAllByEmail(lectureEmail);
    }
}
