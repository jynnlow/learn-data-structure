public class QuickSort {
  public static void main (String[] args){
    int[] testArray= {5,8,90,47,24};

    quickSort(testArray, 0, 4);

    for(int i = 0; i < testArray.length; i++){
      System.out.print(testArray[i] + ",");
    }
  }

  public static void quickSort(int[] array, int left, int right){
    if(left >= right){
      return;
    }else{
      int pivot = partition(array, left, right);
      quickSort(array, left, pivot - 1);
      quickSort(array, pivot + 1, right);
    }
  }

  public static int partition(int[] array, int left, int right){
    int pivot = array[right];
    int i = left - 1;
    int temp;

    for(int j = left; j < right; j++){ //element before last element 
      if (array[j] < pivot){
        i++;
        temp = array[j];
        array[j] = array[i];
        array[i] = temp;
      }
    }
    temp = array[right];
    array[right] = array[i+1];
    array[i+1] = temp;
    return i+1;
  }
}
