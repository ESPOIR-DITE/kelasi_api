package kelasi.ac.za.kelasi_api.service.lecture;

import kelasi.ac.za.kelasi_api.domain.lecture.Lecture;
import kelasi.ac.za.kelasi_api.repository.lecture.LectureRep;
import kelasi.ac.za.kelasi_api.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class LectureService implements Iservice<Lecture,String> {
    private LectureRep lectureRep;

    @Autowired
    public LectureService(LectureRep lectureRep) {
        this.lectureRep = lectureRep;
    }

    @PostMapping("create")
    @Override
    public Lecture creat(Lecture lecture) {
        return lectureRep.save(lecture);
    }

    @Override
    public Lecture update(Lecture lecture) {
        return lectureRep.save(lecture);
    }

    @Override
    public Lecture read(String id) {
        Optional<Lecture> lecture = lectureRep.findById(id);
        return lecture.orElse(null);
    }

    @Override
    public boolean delete(Lecture lecture) {
        Lecture lecture1 = read(lecture.getEmail());
        if (lecture1 != null) {
            lectureRep.delete(lecture1);
            return true;
        }
        return false;
    }

    @Override
    public List<Lecture> reaAll() {
        return lectureRep.findAll();
    }

    @Override
    public Lecture getHelp(String id) {
        return null;
    }
}
