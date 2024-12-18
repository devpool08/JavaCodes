package E_Enum;

import java.util.Arrays;

public class enm1 {
    public static void main(String[] args) {
        System.out.println(enm0.Monday);
        System.out.println(enm.MONDAY);
        System.out.println(enm.values());
        enm[] an=enm.values();
        System.out.println(Arrays.toString(an));
        enm end=enm.MONDAY;
        end.display();
        System.out.println(end.getStr());
    }
}
