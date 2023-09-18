package Servises;

import java.util.ArrayList;
import java.util.List;

import Domen.Employee;
import Domen.PersonComporator;
import Domen.Student;

public class StudentServise implements iPersonService<Student>{//подключим интерфейс

 
    private int count;
    private List<Student> students;




    public StudentServise() {
        this.students = new ArrayList<>();
   }
    @Override
    public List<Student> getAll() {
    return students;
    }
    @Override
    public void create(String name, int age) {
//    создадим студента
Student stud = new Student(name, age);
count++;
students.add(stud);


    }
        
 public void sortByFIO()
 {
    PersonComporator<Student> persComp = new PersonComporator<Student>();
    students.sort(persComp);
 }
    }

