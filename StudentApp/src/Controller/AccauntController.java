package Controller;
// создадим метод, который будет контролировать выплату з.п.

import java.util.ArrayList;
import java.util.List;

import Domen.Person;
import Domen.Teacher;
import Servises.iPersonService;

public class AccauntController {
    // у методов слева создаетcя тип Т
    
    public<T extends Teacher> void paySalary(T person, int salary){
//для того, чтобы защитить наши данные от ошибок мы принудительно укажем нужный нам тип данных 

        System.out.println(person.getName() + ": выплачена зарплата " + salary + " р. ");
    }
    public static <T extends Person> double averageAge(List<T> persons){
       
        double sum = 0;
        for(T pers: persons){
         sum += pers.getAge();
        }
        return sum / persons.size();
    
    }
}