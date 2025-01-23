package A_Arrays;

import  java.util.Arrays;
class  node{
    public node(int data,node next) {
        this.data = data;
        this.next = next;
    }
    int data;
    node next;

}
@SuppressWarnings("ALL")
public class a_Array {
    public static void main(String[] args)
    {
        //node arr[]= new node[]{new node()};
        node[] arr = new node[7];
        arr[0] = new node(1,arr[1]);
        arr[1] = new node(2,arr[2]);
        arr[2] = new node(3,arr[3]);
        arr[3] = new node(4,arr[4]);
        arr[4] = new node(5,arr[5]);
        arr[5] = new node(6,arr[6]);
        arr[6] = new node(7,null);
        System.out.println("The node containing array is : ");
        for (node i : arr) {
            System.out.print(i.data + " ");
        }
        //1 2 3 4 5 6 7
        System.out.println();
        System.out.println();
        int[] array =new  int[5];
        Arrays.fill(array, 5);
        System.out.println("The filled array is (Arrays.fill(array, 5);): ");
        System.out.println(Arrays.toString(array));//[5, 5, 5, 5, 5]
        System.out.println();

        int[] newArray = Arrays.copyOf(array, 8);
        System.out.println("The copied array is (Arrays.copyOf(array, 8);): ");
        System.out.println(Arrays.toString(newArray));//[5, 5, 5, 5, 5, 0, 0, 0]
        System.out.println();

        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        System.out.println("arr1==arr2 "+ (arr1 == arr2));//false because it compares the reference
        System.out.println("Arrays.equals(arr1, arr2)"+Arrays.equals(arr1, arr2));//true because it compares the values
        //System.out.println("Arrays.deepEquals(arr1, arr2)"+Arrays.deepEquals(arr1, arr2));//Error because it requires an Object
        System.out.println();

        int[] intArr = {55, 57, 61, 66, 18, 19, 27, 38,10, 55, 15, 39, 51, 18, 83, 95};
        Arrays.sort(intArr);
        System.out.println("The sorted int array is:");
        System.out.println(Arrays.toString(intArr));

        int searchVal = 55;
        int retVal = Arrays.binarySearch(intArr, searchVal);
        System.out.println("The index of element 55 is (using binary search:(Arrays.binarySearch())): " + retVal);
        System.out.println();

        int [][] array1 = {{1, 2, 3},{4, 5, 6}};
        //System.out.println(array1); it will print the reference of the array not the values
        //System.out.println("The array is : "+Arrays.toString(array1)); it will print the reference of the array two arrays.
        System.out.println("The array is : "+Arrays.deepToString(array1));//[[1, 2, 3], [4, 5, 6]]

        int[][] array2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
        int[][] anotherArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
        System.out.println(Arrays.equals(array2, anotherArray));
        System.out.println(Arrays.deepEquals(array2, anotherArray));
        System.out.println("Hare Krishna");
        System.out.println("good to go");
        /*
        Arrays.equals(array2, anotherArray):
            -This method checks if the two arrays refer to the exact same object.
            Since array2 and anotherArray are two different objects, it returns false even though their contents are identical.
        Arrays.deepEquals(array2, anotherArray):
            -This method performs a deep comparison of the array contents.
            It checks each element of the arrays recursively. Since the contents of array2 and anotherArray are identical,
            it returns true.
        */
    }
}
