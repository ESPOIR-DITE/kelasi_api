package kelasi.ac.za.kelasi_api.controler.course;

import kelasi.ac.za.kelasi_api.controler.Icontroller;
import kelasi.ac.za.kelasi_api.domain.course.subject.Subject;
import kelasi.ac.za.kelasi_api.factory.course.SubjectFactory;
import kelasi.ac.za.kelasi_api.service.course.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("kelasi/subject/")
public class SubjectController implements Icontroller<Subject,String> {
    @Autowired
    private SubjectService subjectService;
    private SubjectService sub;

    @Override
    @PostMapping("create")
    public  Subject creat(@RequestBody Subject subject) {
        Subject subject1 = SubjectFactory.getSubject(subject);
        return subjectService.creat(subject1);
    }

    @PostMapping("update")
    @Override
    public Subject update(@RequestBody Subject subject) {
        return subjectService.update(subject);
    }

    @GetMapping("read")
    @Override
    public Subject read(@RequestParam("id") String id) {
        return subjectService.read(id);
    }

    @GetMapping("delete")
    @Override
    public boolean delete(@RequestBody Subject subject) {
        return subjectService.delete(subject);
    }

    @GetMapping("reads")
    @Override
    public List<Subject> reaAll() {
        return subjectService.reaAll();
    }
}
