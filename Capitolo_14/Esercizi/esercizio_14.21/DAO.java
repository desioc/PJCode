import java.util.*;

public interface DAO<T> {
    Optional<T> selectById(int id);
    List<T> selectAll();
    void insert(T t);
    void update(T t);
    void delete(T t);
}
