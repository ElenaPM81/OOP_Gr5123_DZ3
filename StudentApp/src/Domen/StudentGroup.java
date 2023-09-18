package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup  implements Iterable<Student>, Comparable<StudentGroup>{
    private List<Student> group;
    private int groupId;

    public StudentGroup(List<Student> group, int groupId) {
        this.group = group;
        this.groupId = groupId;
    }

    public List<Student> getGroup() {
        return group;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "StudentGroup =" + groupId;

    }


    @Override
    public Iterator<Student> iterator() {
       return new Iterator<Student>() {

        private int counter;

        @Override
        public boolean hasNext() {

            if(counter<group.size())
            {
                return true;
            }
            else
            {
                return false;
            }            
        }

        @Override
        public Student next() {            
            return group.get(counter++);
        }
        
       };
        
    }

 

    @Override
    public int compareTo(StudentGroup g) {
        if(this.group.size() > g.group.size())
        return 0;
        else if (this.group.size()< g.group.size())
        return -1;
        else
        return 0;

     
   
    }

    }

   
