package Servises;

import java.util.ArrayList;
import java.util.List;

import Domen.Employee;
import Domen.PersonComporator;
import Domen.Student;

public class EmploeeService implements iPersonService<Employee> {
    private int count;
    private List<Employee> emploees;

    public EmploeeService() {
        this.emploees = new ArrayList<>();
    }
    @Override
    public List<Employee> getAll() {
        return emploees;
    }

    @Override
    public void create(String name, int age) {

        Employee empl = new Employee(name, age,"basic");
        count++;
        emploees.add(empl);
    }
 public void sortByFIO()
 {
    PersonComporator<Employee> persComp = new PersonComporator<Employee>();
    emploees.sort(persComp);
 }
}
