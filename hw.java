public hw(){
  int int[] array1;
  int int[] array2;
  int int[] a;
  int n;
  int left;
  int right;
  int search;
}
public void mergeSort(int[] a, int n){
  if (n < 2) {
      return;
  }
  int mid = n / 2;
  int[] array1 = new int[mid];
  int[] array2 = new int[n - mid];

  for (int i = 0; i < mid; i++) {
      array1[i] = a[i];
  }
  for (int i = mid; i < n; i++) {
      array2[i - mid] = a[i];
  }
  mergeSort(array1, mid);
  mergeSort(array2, n - mid);

  merge(a, array1, array2, mid, n - mid);
}

public void merge(int[] a, int[] array1, int[] array2, int left, int right){
  int i = 0;
  int j = 0;
  int k = 0;
  while (i < left && j < right) {
      if (array1[i] <= array2[j]) {
          a[k++] = array1[i++];
      }
      else {
          a[k++] = array2[j++];
      }
  }
  while (i < left) {
      a[k++] = array1[i++];
  }
  while (j < right) {
      a[k++] = array2[j++];
  }
}

public void binarySearch(int search){
  for(int j = 0; j < array.length - 1; j++){
    if(array[i] == search && i > array.length - 1/2){
      for(int i = array.length - 1; i > array.length -1/){
        array2[i] = array[i];
        array = array2;
      }
    }
  }
}
