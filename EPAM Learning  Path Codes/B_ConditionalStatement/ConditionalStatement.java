package B_ConditionalStatement;

public class ConditionalStatement {
    public static int defineLevel(String role) {
        var result = switch (role) {
            case "guest" -> 0;
            case "client" -> 1;
            case "moderator" -> 2;
            case "admin" -> 3;
            default  -> {
                System.out.println("non-authentic role = " + role);
                yield -1;
            }
        };
        return result;
    }

    public static void main(String[] args) {

        System.out.println(defineLevel("guest")); // 0
        System.out.println(defineLevel("client")); // 1
        System.out.println(defineLevel("moderator")); // 2
        System.out.println(defineLevel("admin")); // 3
        System.out.println(defineLevel("non-authentic role")); // non-authentic role = non-authentic role


        int value = 777;
        switch (value) {
            case 1, 2, 3, 4 -> System.out.println("1 or 2 or 3 or 4");
            case 777 -> System.out.println("Range: " + value);
            case 0 -> System.out.println("0");
            default -> System.out.println("Default");
        }
    }

}
