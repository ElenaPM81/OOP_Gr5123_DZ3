package Servises;

import java.util.ArrayList;
import java.util.List;

import Domen.Employee;
import Domen.PersonComporator;
import Domen.Teacher;

public class TeacherServise implements iPersonService<Teacher>{
// подключим интерфейс
    private int count;
    private List<Teacher> teaches;
    private String acadDegree;

    public TeacherServise(){
        this.teaches = new ArrayList<>();
    
    
    }
    @Override
    public List<Teacher> getAll() {
        return teaches;
    }

    @Override
    public void create(String name, int age) {
// создадим учителя
        Teacher teach = new Teacher(name, age, acadDegree);
        count++;
        teaches.add(teach);
    }
 public void sortByFIO()
 {
    PersonComporator<Teacher> persComp = new PersonComporator<Teacher>();
    teaches.sort(persComp);
 }


}
