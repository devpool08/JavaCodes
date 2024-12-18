package Z5_Recursion;

//WE CAN USE HASH SET ALSO.
class remo{
	public static void unique
	(String str,int i,StringBuilder newStr,boolean map[]) {
		if(i==str.length()) {
			System.out.println(newStr);
		}
		char c=str.charAt(i);
		if(map[c-'a']==true) {
			//if true then the current character is a duplicate character
unique(str,i+1,newStr,map);
		}
		else {
			map[c-'a']=true;
			unique(str,i+1,newStr.append(c),map);
		}
		
	}
}
public class REMOVE_DUPLICATE {

	public static void main(String[] args) {
	   
		remo r= new remo();
		r.unique("debadatta", 0,new StringBuilder(""),new boolean[26]);
		

	}

}
