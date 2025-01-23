package D_OOPS;
import java.util.ArrayList;
class Person {
    private  final String  name;

    private final ArrayList<Person> friends = new ArrayList<>();

    public Person(String name) {this.name = name;}

    public String getName() {return name;}

    public ArrayList<Person> getFriends() {return friends;}

    public void addFriend(Person friend) {friends.add(friend);}
}
public class d_Final_Modifier {
    public static void main(String[] args) {
        Person man1 = new Person("Ram");
        Person man2 = new Person("Shyam");
        Person man3 = new Person("Hari");
        man3.addFriend(man1);
        man3.addFriend(man2);
        System.out.println("Man 3 Name is : "+man3.getName());
        ArrayList<Person> person=man3.getFriends();
        System.out.println("His Friend List is (Hash code): "+person);
        for (Person p : person) {
            //((Person) p.get(i)).setName("new name"); // compile error: final field name cannot be changed
            System.out.println(p.getName());
        }
    }
}