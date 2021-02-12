package kelasi.ac.za.kelasi_api.controler.lecture;

import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.lecture.LectureInstitution;
import kelasi.ac.za.kelasi_api.service.lecture.LectureInstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kelasi/lectureinstitution")
public class LectureInstitutionController implements Icontroller<LectureInstitution,String> {
    private LectureInstitutionService lectureInstitutionService;

    @Autowired
    public LectureInstitutionController(LectureInstitutionService lectureInstitutionService) {
        this.lectureInstitutionService = lectureInstitutionService;
    }

    @PostMapping("create")
    @Override
    public LectureInstitution creat(@RequestBody LectureInstitution lectureInstitution) {
        return lectureInstitutionService.creat(lectureInstitution);
    }

    @PostMapping("update")
    @Override
    public LectureInstitution update(@RequestBody LectureInstitution lectureInstitution) {
        return lectureInstitutionService.update(lectureInstitution);
    }

    @GetMapping("read")
    @Override
    public LectureInstitution read(@RequestParam("id") String id) {
        return lectureInstitutionService.read(id);
    }

    @GetMapping("delete")
    @Override
    public boolean delete(@RequestBody LectureInstitution lectureInstitution) {
        return lectureInstitutionService.delete(lectureInstitution);
    }
    @GetMapping("reads")
    @Override
    public List<LectureInstitution> reaAll() {
        return lectureInstitutionService.reaAll();
    }
    @GetMapping("findAllByInstitution")
    public List<LectureInstitution> findAllByInstitution(@RequestParam("institutionId") String institutionId){
        return lectureInstitutionService.findAllByInstitution(institutionId);
    }
    @GetMapping("findAllByEmail")
    public List<LectureInstitution> findAllByEmail(@RequestParam("lectureEmail") String lectureEmail){
        return lectureInstitutionService.findAllByEmail(lectureEmail);
    }
}
