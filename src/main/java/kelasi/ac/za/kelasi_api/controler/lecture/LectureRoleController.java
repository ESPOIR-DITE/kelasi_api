package kelasi.ac.za.kelasi_api.controler.lecture;

import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.lecture.LectureRole;
import kelasi.ac.za.kelasi_api.repository.lecture.LectureRoleRep;
import kelasi.ac.za.kelasi_api.service.lecture.LectureRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kelasi/lecturerole")
public class LectureRoleController implements Icontroller<LectureRole,String> {
    private LectureRoleService lectureRoleService;

    @Autowired
    public LectureRoleController(LectureRoleService lectureRoleService) {
        this.lectureRoleService = lectureRoleService;
    }

    @PostMapping("create")
    @Override
    public LectureRole creat(@RequestBody LectureRole lectureRole) {
        return lectureRoleService.creat(lectureRole);
    }

    @PostMapping("update")
    @Override
    public LectureRole update(@RequestBody LectureRole lectureRole) {
        return lectureRoleService.update(lectureRole);
    }

    @GetMapping("read")
    @Override
    public LectureRole read(@RequestParam("id") String id) {
        return lectureRoleService.read(id);
    }

    @GetMapping("delete")
    @Override
    public boolean delete(@RequestBody LectureRole lectureRole) {
        return lectureRoleService.delete(lectureRole);
    }

    @GetMapping("reads")
    @Override
    public List<LectureRole> reaAll() {
        return lectureRoleService.reaAll();
    }
}
