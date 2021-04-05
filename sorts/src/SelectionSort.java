public class SelectionSort {
 public static void main (String []args){
    int[] testArray = {2,5,1,0,4,7,3};
    int temp = 0;

    for(int i = 0; i < testArray.length - 1; i++){ //j will examine the last element in the array when i = length-1
      int min = i;
      for(int j = i + 1; j < testArray.length; j++){
        if(testArray[j] < testArray[min]){
          min = j;
        }
      }
      temp = testArray[i];
      testArray[i] = testArray[min];
      testArray[min] = temp;
    }

    for(int i = 0; i < testArray.length; i++){
      System.out.println(testArray[i]);
    }
 }
}
