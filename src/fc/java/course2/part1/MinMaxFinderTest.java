package fc.java.course2.part1;

import fc.java.model2.MinMaxFinder;

public class MinMaxFinderTest {
    public static void main(String[] args) {
        int[]  arr={3,2,9,1,7};
        int min =MinMaxFinder.findMin(arr);
        int max =MinMaxFinder.findMax(arr);

        System.out.println("min = " + min); //1
        System.out.println("max = " + max); //9
    }

}
