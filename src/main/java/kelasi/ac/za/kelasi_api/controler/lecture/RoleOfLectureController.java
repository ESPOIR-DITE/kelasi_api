package kelasi.ac.za.kelasi_api.controler.lecture;

import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.lecture.RoleOfLecture;
import kelasi.ac.za.kelasi_api.service.lecture.RoleOfLectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kelasi/role-lecture")
public class RoleOfLectureController implements Icontroller<RoleOfLecture,String> {
    private RoleOfLectureService roleOfLectureService;

    @Autowired
    public RoleOfLectureController(RoleOfLectureService roleOfLectureService) {
        this.roleOfLectureService = roleOfLectureService;
    }

    @PostMapping("create")
    @Override
    public RoleOfLecture creat(@RequestBody RoleOfLecture roleOfLecture) {
        return roleOfLectureService.creat(roleOfLecture);
    }

    @PostMapping("update")
    @Override
    public RoleOfLecture update(@RequestBody RoleOfLecture roleOfLecture) {
        return roleOfLectureService.update(roleOfLecture);
    }

    @GetMapping("read")
    @Override
    public RoleOfLecture read(@RequestParam("id") String id) {
        return roleOfLectureService.read(id);
    }

    @GetMapping("delete")
    @Override
    public boolean delete(@RequestBody RoleOfLecture roleOfLecture) {
        return roleOfLectureService.delete(roleOfLecture);
    }
    @GetMapping("reads")
    @Override
    public List<RoleOfLecture> reaAll() {
        return roleOfLectureService.reaAll();
    }
}
