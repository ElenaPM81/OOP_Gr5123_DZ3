package Domen;

import java.util.Iterator;
import java.util.List;

public class SteamIterator implements Iterator<StudentGroup>{
    private int countSt;
    private List<StudentGroup> steam;


    public SteamIterator( List<StudentGroup> steam) {  
        this.steam = steam;
    }


    // @Override
    // // public boolean hasNextSt() {
        
    //     return countSt< steam.size();
    // }


    @Override
    public StudentGroup next() {
        countSt++;
        return steam.get(countSt-1);
    }


    @Override
    public boolean hasNext() {
       return countSt < steam.size();
    }

    

    

    
}
