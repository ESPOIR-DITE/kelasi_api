package kelasi.ac.za.kelasi_api.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class homeController {
    @GetMapping("")
    public String home(){
        return "Welcome on Kelasi api";
    }
    @GetMapping("kelasi")
    public String kelasiHome(){
        return "kelasi Home";
    }
}
