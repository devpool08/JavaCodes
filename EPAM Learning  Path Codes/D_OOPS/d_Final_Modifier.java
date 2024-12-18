package D_OOPS;
import java.util.ArrayList;
class Person {
    private  final String  name;

    public String getName() {return name;}

    public Person(String name) {this.name = name;}

    private final ArrayList<Person> friends = new ArrayList<>();

    public ArrayList getFriends() {return friends;}

    public void addFriend(Person friend) {friends.add(friend);}
}
public class d_Final_Modifier {
    public static void main(String[] args) {
        Person man1 = new Person("ram");
        Person man2 = new Person("shyam");
        Person man3 = new Person("govind");
        man3.addFriend(man1);
        man3.addFriend(man2);
        System.out.println(man3.getName());
        ArrayList p=man3.getFriends();
        System.out.println(p);
        for(int i=0;i<p.size();i++){
            //((Person) p.get(i)).setName("new name"); // compile error: final field name cannot be changed
            System.out.println(((Person) p.get(i)).getName());
        }
    }
}