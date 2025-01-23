package G_GenericsJava;

import java.util.ArrayList;


@SuppressWarnings("ALL")
public class gen1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();//if we are not defined the generic it stores the element in form of object
        list.add("Hello");
        list.add(123);
        list.add(3.14);

       //String str0= list.get(0); show error because the element is object type ,but we store it in string type
        String str = (String) list.get(0);
        //String str1 = (String) list.get(1);//it show run time error because we store here int type but cast it in to string type.
    }
}
