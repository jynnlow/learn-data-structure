public class QuickSort_2 {
  public static void main (String[] args){
    int[] testArray= {5,8,90,47,24};

    quickSort(testArray, 0, 4);

    for(int i = 0; i < testArray.length; i++){
      System.out.print(testArray[i] + ",");
    }
  }

  public static void quickSort(int[] array, int left, int right){
    int pivot = 0;
    if(left >= right){
      return;
    }else{
      pivot = array[right]; //assign pivot
      int i = left - 1;
      int temp;

      //j larger than pivot, i smaller than pivot
      for(int j = left; j < right - 1; j++){  //j will examine until the element before pivot
        if (array[j] < pivot){  //find the element smaller than pivot - swap j with i element
          i++;
          temp = array[j];
          array[j] = array[i];
          array[i] = temp;
        }
      }
      //swap pivot(array[right]) with array[i+1]
      temp = array[right];
      array[right] = array[i+1];
      array[i+1] = temp;

      quickSort(array, left, i);
      quickSort(array, i+2, right);

    }
  }
}

