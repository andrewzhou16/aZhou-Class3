public class OrderedArrayList<T> extends Comparable<T> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super.add();
  }


  public void add(int index, T element){
      for(i = 0; i < index.length - 1; i++){
        element.compareTo(super.element);
        if (element == index[i]){
          element = index[i+1];
        }
    }
  }


  public void set(int index, T value){
    super.remove(int index);
    this.add();
    }
}
