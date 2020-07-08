package kelasi.ac.za.kelasi_api.service;

import java.util.List;

/****
 * This interface should be implemented only in the service classes
 * when implementing Note following
 * Iservice<T,t> T should be replaced by entity or aggregated class
 *               t should be replaced by id primitive type of entity or aggregated class
 */
public interface Iservice<T,t> {
    T creat(T t);
    T update(T t);
    T read(String id);
    boolean delete(T t);
    List<T> reaAll();
    T getHelp(String id); // This method will help to reduce repetitions
}
