package Servises;

import java.util.List;

// создаем интерфейс дженерик
public interface iPersonService <T>{
    List<T> getAll();
    void create(String name, int age);

    
}
// мы его можем подключить к StudentServise, EmploeeService и TeacherServise


