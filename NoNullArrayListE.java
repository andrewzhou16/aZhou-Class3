import java.util.ArrayList;

public class NoNullArrayList<E> extends ArrayList<E> {
  public NoNullArrayList(){
    super();
    int startingCapacity;
  }

  public boolean add(E element){
    if (element == null){
      throw new IllegalArgumentException();
    }
    return super.add(E element);
  }


  public void add(int index, E element){
    if (index.equals(null)){
      throw new IllegalArgumentException();
    }
    return super.add(E index);
    if (element == null){
      throw new IllegalArgumentException();
    }
    return super.add(int index, E element);
  }


  public boolean set(int index, E element){
    if (index.equals(null)){
      throw new IllegalArgumentException();
    }
    return super.set(E index);
    if (element == null){
      throw new IllegalArgumentException();
    }
    return super.set(E element);
  }
}
