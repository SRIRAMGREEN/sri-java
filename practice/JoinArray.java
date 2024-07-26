package practice;

import java.util.HashSet;
import java.util.Set;

public class JoinArray {
    public static void main(String[] args) {

        //merge common elements
        int[] arr1 = {80,10,15,2,35,60};
        int[] arr2 = {35,80,60,20,75};

        printIntersection(arr1,arr2);
        printUnion(arr1,arr2);
     }
     static void printUnion(int arr1[], int arr2[]){
        Set<Integer> s = new HashSet<>();
        for (int i=0;i< arr1.length;i++){
            s.add(arr1[i]);
        }
        for (int i=0; i<arr2.length;i++){
            s.add(arr1[i]);
        }
         System.out.println("union "+ s);
     }
     static void printIntersection(int arr1[], int arr2[]){
         Set<Integer> s = new HashSet<>();
         for (int i=0;i<arr1.length;i++){
             s.add(arr1[i]);
         }
         for (int i=0; i<arr2.length;i++){
             if(s.contains(arr2[i])){
                 System.out.println(arr2[i] + " ");
             }
         }
     }
}
