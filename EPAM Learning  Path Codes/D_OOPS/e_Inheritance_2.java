package D_OOPS;
@SuppressWarnings("ALL")
class Cat {
    String msg;
    Cat() {
        System.out.println("Aham purvam");
    }
    Cat(String msg) {
        System.out.println("" + msg);
    }
}
class BritishCat extends Cat {
    BritishCat() {
        System.out.println("I'm second");
    }
    BritishCat(String msg) {
        super(msg);
        System.out.println("Radhe Shyam");
        //super(msg);  Call to 'super()' must be first statement in constructor body
    }
}
@SuppressWarnings("ALL")
public class e_Inheritance_2 {
    public static void main(String[] arg) {
        /*
        In this example, only default constructors are declared in the
        classes Cat and BritishCat. The constructor in the class BritishCat
         does not explicitly call the constructor in the class Cat.
         As you can see, the constructor in the class Cat is executed.
        */
        BritishCat Cat = new BritishCat();

        BritishCat Cat2 = new BritishCat("Hare Krishna");


    }
}

/*
If a superclass has no default constructor and the subclass constructor
 does not invoke another superclass constructor explicitly, the Java
 compiler will throw an error.


class Person {
    private String name;

    // Parameterized constructor
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student extends Person {
    private int studentId;

    // Constructor for Student
    public Student(String name, int studentId) {
        super(name); // Explicitly call the superclass constructor
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }
}
//this one is incorrect please comment it before run
class Student extends Person {
    private int studentId;
    // Constructor for Student
    public Student(String name, int studentId) {
        // Error: No default constructor in Person
        // super(); // Uncommenting this line would fix the error
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }
}
public class Main {
    public static void main(String[] args) {
        // Create a Person
        Person person = new Person("Alice");
        System.out.println("Person's name: " + person.getName());

        // Create a Student
        Student student = new Student("Bob", 12345);
        System.out.println("Student's name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
    }
}

*/




