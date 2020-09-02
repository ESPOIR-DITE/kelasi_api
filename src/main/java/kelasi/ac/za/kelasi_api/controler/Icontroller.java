package kelasi.ac.za.kelasi_api.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public interface Icontroller <T,t>{
    T creat(T t);
    T update(T t);
    T read(String id);
    boolean delete(T t);
    List<T> reaAll();
}
