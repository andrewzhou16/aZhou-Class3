public class OrderedArrayList<E> extends Comparable<E> extends NoNullArrayList<E>{
  public OrderedArrayList(){
    super.add();
    int startingCapacity;
  }


  public void Position(int index, E element){
    for(i = 0; i < super.size - 1; i++){
      element.compareTo(super.element);
      if (element == index[i]){
        element = index[i+1];
  }


@Override
  public boolean add(E value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    return super.add(E value);
  }


@Override
  public int add(int index, E element){
      for(i = 0; i < index.length - 1; i++){
        element.compareTo(super.element);
        if (element == index[i]){
          element = index[i+1];
          return true;
        }
    }
    return false;
  }


@Override
  public void set(int index, E value){
    super.remove(int index);
    super.add(E value);
    }
}
