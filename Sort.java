public class Sort{
    public int[] array;

    Sort(){
    array = new int[10];
    }


  public boolean insertionSort(){
    boolean sorted = false;
    int x = 0;
    int temp = 0;
    while(!sorted){
      for(int i = 0; i < array.length - 1; i++){
        if(array[i] >= array[x]){
          temp = array[x];
          array[x] = array[i];
          array[i] = temp;
          sorted = false;
        }
      }
    }
    return array;
    }


public boolean bubbleSort(){
    boolean sorted = false;
    int temp = 0;
    while(!sorted) {
        sorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                sorted = false;
            }
        }
    }
    return array;
  }


public boolean selectionSort(){
  boolean sorted = false;
  int temp = 0;
  int x = 0;
  while(!sorted){
    sorted = true;
    for(int i = 0; i < array.length - 1; i++){
      if(array[x] > array[x + 1]){
        temp = array[x];
        array[x] = array[x+1];
        array[x+1] = temp;
        sorted = false;
        int x++;
      }
    }
  }
  return array;
}



public boolean quickSort(){
  boolean sorted = false;
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
  return array;
}
}
