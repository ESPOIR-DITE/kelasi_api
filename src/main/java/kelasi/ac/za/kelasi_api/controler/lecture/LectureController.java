package kelasi.ac.za.kelasi_api.controler.lecture;

import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.lecture.Lecture;
import kelasi.ac.za.kelasi_api.service.lecture.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kelasi/lecture")
public class LectureController implements Icontroller<Lecture,String> {
    private LectureService lectureService;

    @Autowired
    public LectureController(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    @PostMapping("create")
    @Override
    public Lecture creat(@RequestBody Lecture lecture) {
        return lectureService.creat(lecture);
    }

    @PostMapping("update")
    @Override
    public Lecture update(@RequestBody Lecture lecture) {
        return lectureService.update(lecture);
    }

    @GetMapping("read")
    @Override
    public Lecture read(@RequestParam("id") String id) {
        return lectureService.read(id);
    }

    @GetMapping("delete")
    @Override
    public boolean delete(@RequestParam("id") Lecture lecture) {
        return lectureService.delete(lecture);
    }

    @GetMapping("reads")
    @Override
    public List<Lecture> reaAll() {
        return lectureService.reaAll();
    }
}
