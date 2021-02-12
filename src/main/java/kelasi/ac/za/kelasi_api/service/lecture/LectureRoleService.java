package kelasi.ac.za.kelasi_api.service.lecture;

import kelasi.ac.za.kelasi_api.domain.lecture.LectureRole;
import kelasi.ac.za.kelasi_api.repository.lecture.LectureRoleRep;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LectureRoleService implements Iservice<LectureRole,String> {
    private LectureRoleRep lectureRoleRep;

    @Autowired
    public LectureRoleService(LectureRoleRep lectureRoleRep) {
        this.lectureRoleRep = lectureRoleRep;
    }

    @Override
    public LectureRole creat(LectureRole lectureRole) {
        return lectureRoleRep.save(lectureRole);
    }

    @Override
    public LectureRole update(LectureRole lectureRole) {
        return lectureRoleRep.save(lectureRole);
    }

    @Override
    public LectureRole read(String id) {
        Optional<LectureRole> lectureRole = lectureRoleRep.findById(id);
        return lectureRole.orElse(null);
    }

    @Override
    public boolean delete(LectureRole lectureRole) {
        LectureRole lectureRole1 = read(lectureRole.getId());
        if (lectureRole1 != null) {
            lectureRoleRep.delete(lectureRole);
            return true;
        }
        return false;
    }

    @Override
    public List<LectureRole> reaAll() {
        return lectureRoleRep.findAll();
    }

    @Override
    public LectureRole getHelp(String id) {
        return null;
    }
}
