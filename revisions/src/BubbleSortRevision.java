public class BubbleSortRevision{
  public static void main (String []args){
    int[] array = {6,86,45,21,10,6,22};
    int temp = 0;
    for(int i = 0; i < array.length; i ++){
      for(int j = 0; j < array.length - 1; j ++){
        if(array[j] > array[j+1]){
          temp = array[j+1];
          array[j+1] = array[j];
          array[j] = temp;
        }
      }
    }
    for(int i = 0; i < array.length; i ++){
      System.out.print(array[i] + ",");
    }
  }
}
