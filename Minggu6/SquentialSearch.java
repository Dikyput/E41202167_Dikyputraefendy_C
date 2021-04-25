
package bubblesortexample;

/**
 *
 * @author DIKYPUT PC
 */
public class SquentialSearch {
 public static void main(String[] args) {
     int[] exampleVariableOne = {3, 7, 2, 5, 9};
     int target = 3;
     sequentialSearch(exampleVaribleOne, target);
 }
 public static void sequentialSearch(int[] parameterOne, int parameterTwo){
     int index = -1;
     // searches each index of the array until it reaches the last index
     for (int i = 0; i < parameterOne.length; i++) {
         if (parameterOne[i] == parameterTwo) {
             // if yhe target ids found, int index is set as the valie of i and
             // the for loop is teminated
             index = i;
             break;
         }
     }
     if (index == -1) {
         System.out.println("Your target integer does not exist in the array");
     } else {
         System.out.println("Your target integer is in index" + index + " of the arrray");
     }
 }
}
