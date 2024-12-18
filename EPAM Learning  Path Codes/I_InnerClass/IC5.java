package I_InnerClass;

class Hotel{
    private String name;
    private int totalRooms;
    private  int reservedRooms;
    Hotel(String name, int totalRooms, int reservedRooms){
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }
    public  void  reserveRoom(String guestName ,int numOfRooms){
        System.out.println(reservedRooms);
        class ReservationValidator{
            boolean validate(){
                if(guestName==null || guestName.isBlank()){
                    System.out.println("Invalid guest name.");
                    return false;
                }else if(numOfRooms<=0){
                    System.out.println("Invalid number of rooms.");
                    return false;
                } else if (numOfRooms+reservedRooms>totalRooms) {
                    int available=totalRooms-(reservedRooms);
                    System.out.println("Not enough available rooms.("+available+") room available");
                    return false;
                }else {
                    System.out.println("Reservation successful for "+guestName+" for "+numOfRooms+" rooms.");
                    return true;
                }
            }
        }
        ReservationValidator validator = new ReservationValidator();
        if(validator.validate()){
            System.out.println( "all good.." );
            reservedRooms+=numOfRooms;
        }else {
            System.out.println("sorry for the inconvenience");
        }
    }
}
public class IC5 {
    public static void main(String[] args) {
        Hotel h = new Hotel("My Hotel", 100, 50);
        h.reserveRoom("John Doe", 20);
        h.reserveRoom("Jane Smith", 29);
        h.reserveRoom("Tom Brown", 10);
        h.reserveRoom("", 15);
        h.reserveRoom("Alice Johnson", -5);
        h.reserveRoom("Bob Brown", 1);
    }
}
