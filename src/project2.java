import java.util.*;

public class project2 {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,4};
        int[] array2 = {3,1,4,1,5,9,2,6,5,3,5,8,9,3,9};
        int[] array3 = {1,1,1,1};





        showNonDuplicateArray(array1);
        showNonDuplicateArray(array2);
        showNonDuplicateArray(array3);
    }

    /*
     * Remove duplicate elements in an array
     * and print it in the standard output
     * @param a the input array
     */
    //移去完全一样的元素
    public static void showNonDuplicateArray(int[] array) {
        List<Integer> list=new ArrayList<Integer>(); //能在方法里进行对象的创建和使用？
        for (int i : array) {
             list.add(i);
        }
        Set<Integer> set=new HashSet<Integer>();
        set.addAll(list);
        System.out.println(set);
    }
}
