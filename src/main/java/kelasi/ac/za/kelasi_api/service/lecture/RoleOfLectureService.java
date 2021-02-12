package kelasi.ac.za.kelasi_api.service.lecture;

import kelasi.ac.za.kelasi_api.domain.lecture.RoleOfLecture;
import kelasi.ac.za.kelasi_api.repository.lecture.RoleOfLectureRep;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleOfLectureService implements Iservice<RoleOfLecture,String> {
    private RoleOfLectureRep roleOfLectureRep;

    @Autowired
    public RoleOfLectureService(RoleOfLectureRep roleOfLectureRep) {
        this.roleOfLectureRep = roleOfLectureRep;
    }

    @Override
    public RoleOfLecture creat(RoleOfLecture roleOfLecture) {
        return roleOfLectureRep.save(roleOfLecture);
    }

    @Override
    public RoleOfLecture update(RoleOfLecture roleOfLecture) {
        return roleOfLectureRep.save(roleOfLecture);
    }

    @Override
    public RoleOfLecture read(String id) {
        Optional<RoleOfLecture> roleOfLecture = roleOfLectureRep.findById(id);
        return roleOfLecture.orElse(null);
    }

    @Override
    public boolean delete(RoleOfLecture roleOfLecture) {
        RoleOfLecture roleOfLecture1 = read(roleOfLecture.getId());
        if (roleOfLecture1 != null) {
            roleOfLectureRep.delete(roleOfLecture);
            return true;
        }
        return false;
    }

    @Override
    public List<RoleOfLecture> reaAll() {
        return roleOfLectureRep.findAll();
    }

    @Override
    public RoleOfLecture getHelp(String id) {
        return null;
    }
}
