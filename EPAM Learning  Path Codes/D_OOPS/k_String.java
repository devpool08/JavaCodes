package D_OOPS;

class Student2 {
    private String name;
    public Student2(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }
}
public class k_String {
    public static void main(String[] args) {
        Student2 john = new Student2("John Smith");
        System.out.println("First student: " + john);
    }
}