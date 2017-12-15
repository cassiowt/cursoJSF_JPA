package inter.postgre.sql;

import java.util.ArrayList;

public interface GenericDAOSql<T> {
   public boolean save(T obj);
   public boolean remove(T obj);
   public T  find(Long id);
   public T  find(int id);
   public ArrayList<T> list();
}
