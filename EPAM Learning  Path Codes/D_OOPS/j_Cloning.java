package D_OOPS;

import java.util.Date;

//class Student {//this will show an error because
// it does not implement the runnable interface
@SuppressWarnings("ALL")
class Student  implements Cloneable{
    private Date yearSet;
    private int group;
    public Student(Date year, int group) {
        this.yearSet = year;
        this.group = group;
    }
    public String toString() {
        return "year = " + yearSet + ", group = " + group;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class j_Cloning {
    public static void main(String[] arg) throws Exception  {
        Date dd = new Date( System.currentTimeMillis() );
        Student stud1 = new Student(dd, 201);
        System.out.println(stud1);
        Student stud2 = (Student) stud1.clone();
        System.out.println(stud2);
    }
}