import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sumOfTheDiagonal();
    }
    public static void sumOfArray(){
        int[] array = {1, 10, 20, 30};
        int sumOfArray = array[0] + array[1] + array[2] + array[3];
        System.out.println(sumOfArray);
    }
    public static void printElementsOf2dMatrix(){
        int[][] array = new int[4][3];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;
        array[3][0] = 10;
        array[3][1] = 11;
        array[3][2] = 12;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.println(array[i][j]);
            }
        }
    }

  public static void biggestElementArray(){
      int[] array = {10, 20, 30, 40};

      int max = array[0];

      for (int i = 0; i < array.length; i++) {

          if(array[i] > max)
              max = array[i];
      }
      System.out.println(max);
  }

  public static void reverseOrderLinkedList(){
      LinkedList<String> list = new LinkedList<String>();
      list.add("Coffee");
      list.add("Tea");
      list.add("Water");
      list.add("Beer");
      Iterator iterator = list.descendingIterator();
      System.out.println("Reverse order of list is:");
      while(iterator.hasNext()){
          System.out.println(iterator.next());
      }
  }

  public static void sumOfTheDiagonal(){
        int[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
                int diagonal = array[0][0] + array[1][1] + array[2][2] + array[3][3];
                System.out.println(diagonal);

        }


}










