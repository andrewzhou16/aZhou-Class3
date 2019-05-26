public class Test{
public static void main (String[] args){
  Sort andrew = new Sort();

  andrew.array[0] = 10;
  andrew.array[1] = 9;
  andrew.array[2] = 5;
  andrew.array[3] = 7;
  andrew.array[4] = 6;
  andrew.array[5] = 1;
  andrew.array[6] = 4;
  andrew.array[7] = 3;
  andrew.array[8] = 8;
  andrew.array[9] = 2;
  System.out.println("Original array: " + andrew.ary());
  andrew.bubbleSort();
  System.out.println("Testing for bubbleSort: " + andrew.ary());
  System.out.println("-----------");

  andrew.array[0] = 7;
  andrew.array[1] = 5;
  andrew.array[2] = 8;
  andrew.array[3] = 3;
  andrew.array[4] = 2;
  andrew.array[5] = 9;
  andrew.array[6] = 4;
  andrew.array[7] = 10;
  andrew.array[8] = 8;
  andrew.array[9] = 4;
  System.out.println("Original array: " + andrew.ary());
  andrew.selectionSort();
  System.out.println("Testing for selectionSort: " + andrew.ary());
  System.out.println("-----------");

  andrew.array[0] = 0;
  andrew.array[1] = 9;
  andrew.array[2] = 2;
  andrew.array[3] = 3;
  andrew.array[4] = 8;
  andrew.array[5] = 1;
  andrew.array[6] = 5;
  andrew.array[7] = 4;
  andrew.array[8] = 7;
  andrew.array[9] = 3;
  System.out.println("Original array: " + andrew.ary());
  //andrew.quickSort();
  System.out.println("Testing for quickSort: " + andrew.ary());

  andrew.array[0] = 1;
  andrew.array[1] = 9;
  andrew.array[2] = 2;
  andrew.array[3] = 3;
  andrew.array[4] = 8;
  andrew.array[5] = 0;
  andrew.array[6] = 5;
  andrew.array[7] = 4;
  andrew.array[8] = 7;
  andrew.array[9] = 3;
  System.out.println("Original array: " + andrew.ary());
  andrew.insertionSort();
  System.out.println("Testing for insertionSort: " + andrew.ary());
  System.out.println("-----------");

}
}
