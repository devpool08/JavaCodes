package A_Arrays;

// Java program explaining System class method - arraycopy()
import java.lang.*;


@SuppressWarnings("ALL")
public class b_Array
{
    public static void main(String[] args)
    {
        int[] s = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] d = { 15, 25, 35, 45, 55, 65, 75, 85, 95, 105};

        int[] source_arr;
        int sourcePos;
        int[] dest_arr;
        int destPos;
        int len;
        source_arr = s;// assign array to source_arr now source_arr is pointing to s
        sourcePos = 3;// starting position in source array
        dest_arr = d;// assign array to dest_arr now dest_arr is pointing to d
        destPos = 5;// starting position in destination array
        len = 4;// number of array elements to be copied

        // Print elements of source
        System.out.print("source_array : ");
        for (int j : s) System.out.print(j + " ");
        System.out.println();

        System.out.println("sourcePos : " + sourcePos);

        // Print elements of source
        System.out.print("dest_array : ");
        for (int j : d) System.out.print(j + " ");
        System.out.println();

        System.out.println("destPos : " + destPos);

        System.out.println("len : " + len);

        // Use of arraycopy() method
        //      System.arraycopy(s, 0, d,
        //                5, 4);
        System.arraycopy(source_arr, 3, dest_arr,
                destPos, len);

        // Print elements of destination after
        System.out.print("final dest_array : ");
        for (int j : d) System.out.print(j + " ");
        
    }
}