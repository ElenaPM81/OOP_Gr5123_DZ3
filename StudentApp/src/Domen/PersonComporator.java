package Domen;

import java.util.Comparator;
// создаем дженерик:
// мы обьясняем компилятору что унас будет не простой компоратор а универсальный
public class PersonComporator<T extends Person> implements Comparator<T>{
// делаем сравнение по имени
    @Override
    public int compare(T o1, T o2) {
     int res = o1.getName().compareTo(o2.getName());
     if(res == 0)
     {
        return 0;
     }
      else 
     {
      return res;

     }
    }
    
}
