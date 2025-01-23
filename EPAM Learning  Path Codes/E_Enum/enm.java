package E_Enum;



@SuppressWarnings("ALL")
public enum enm {
    /*
    * Here the relation among the variable is Sunday is an enm variable
    * monday is an enm HERE THE RELATION TYPE IS "IS A"
    * */
    //private static int fld;// this will show an error because in enum we first defines the constants
      MONDAY("MONDAY")
    , TUESDAY("TUESDAY")
    , WEDNESDAY ("WEDNESDAY")
    , THURSDAY("THURSDAY")
    , FRIDAY("FRIDAY")
    , SATURDAY("SATURDAY")
    , SUNDAY("SUNDAY")
    ;

    public String getStr() {
        return str;
    }

    private String str;
    private enm (String str){
        this.str=str;
    }
    public void display(){
        System.out.println("Today is " + this.name());
    }
}
