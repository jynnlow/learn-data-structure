public class InsertionSort {
  public static void main (String [] args){
    int[] testArray= {5,8,90,47,24};
    int temp = 0;
    for (int i = 1; i < testArray.length; i++){
      for (int j = i - 1; j >= 0; j--){
        if(testArray[i] < testArray[j]){
          temp = testArray[i];
          testArray[i] = testArray[j];
          testArray[j] = temp;
          i--;
        }
      }
    }
    for(int i = 0; i < testArray.length; i++){
      System.out.print(testArray[i] + ",");
    }
}
}


 // for(int i = 1; i < testArray.length; i++){
    //   j = i - 1;

    //   while(j >= 0 &&  testArray[j] > testArray[i]){
    //     temp = testArray[i];
    //     testArray[i] = testArray[j];
    //     testArray[j] = temp;
    //     j--;
    //   }
    // }