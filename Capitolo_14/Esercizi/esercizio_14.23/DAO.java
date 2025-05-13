import java.util.*;

public interface DAO<T> {
    String URL = "jdbc:derby:..\\..\\..\\lib\\Music";
    
    Optional<T> selectById(int id);
    List<T> selectAll();
    void insert(T t);
    void update(T t);
    void delete(T t);
}