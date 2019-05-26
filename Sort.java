public class Sort{
    public int[] array;

    Sort(){
    array = new int[10];
    }


    public String ary(){
        String ary = "";
        for(int i = 0; i < array.length; i++){
          ary = ary + array[i] + ",";
        }
      return ary;
    }



public void insertionSort(){
  int temp = 0;
  for(int i = 0; i <= array.length - 1; i++){
     int k = i;
     //System.out.println("k: " + k);
     while ((k-1 >=0) && (array[k-1] > array[k])) {

          temp = array[k];
          array[k] = array[k-1];
          array[k-1] = temp;
          //System.out.println("array[k]= " + array[k]);
          k=k-1;
          //System.out.println("k2: " + k);


     }
  }
}


public void bubbleSort(){
  boolean sorted = false;
  int temp = 0;
  while(!sorted){
    sorted = true;
    for (int i = 0; i < array.length - 1; i++){
      if (array[i] > array[i+1]){
        temp = array[i];
        array[i] = array[i+1];
        array[i+1] = temp;
        sorted = false;
      }
    }
  }
}


public void selectionSort(){
  int minIndex = 0;
  int swap = 0;
    for(int i = 0; i < array.length - 1; i++){
      minIndex = i+1;
      for(int j = i+1; j <= array.length - 1; j++){
        if(array[minIndex] > array[j]){
          minIndex = j;
        }
      }
      if(array[i] > array[minIndex]){
      swap = array[i];
      array[i] = array[minIndex];
      array[minIndex] = swap;
    }
  }
}


public void quickSort(){
  boolean sorted=false;
  int temp = 0;
  while(!sorted){
    array[array.length/2] = temp;
    array[array.length - 1] = array[array.length/2];
    array[array.length - 1] = temp;
    for(int i = array.length - 1; i > 0; i--){
      if(array[i] < array[i - 1]){
        array[i - 1] = temp;
        array[i - 1] = array[i];
        array[i] = temp;
      }
    }
  }
}
}
