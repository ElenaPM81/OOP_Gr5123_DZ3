package Domen;

import java.util.Iterator;
import java.util.List;
// создаем класс StudentSteam
public class StudentSteam implements Iterable<StudentGroup>{
    // который содержит в себе список групп
    private List<StudentGroup> steam;
    //  и номер потока
    private int numSteam;

    // создаем конструктор
    public StudentSteam(List<StudentGroup> steam, int numSteam) {
        this.steam = steam;
        this.numSteam = numSteam;
    }


    public List<StudentGroup> getSteam() {
        return steam;
    }




    public int getNumSteam() {
        return numSteam;
    }

 public void setSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }




    public void setNumSteam(int numSteam) {
        this.numSteam = numSteam;
    }
// создаем метод который возвращает нам строку: номер потока

    @Override
    public String toString() {
      return "StudentSteam = " + numSteam;
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return new SteamIterator(steam);
    }

  
}







   







