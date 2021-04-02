public class BubbleSort {
    public static void main(String[] args) throws Exception {
        int [] numbers = {4,7,23,1,3,10,5};
        doWhileLoopSort(numbers);
        for (int i = 0; i < numbers.length; i ++){
            System.out.print(numbers[i] + ",");
        }
    }

    public static void doWhileLoopSort(int[] testArray) {
        int temp = 0;
        boolean hasSwapped;
        //int countLoop = 0;
        do {
            hasSwapped = false;
            for(int i = 0; i < testArray.length-1; i++) {
                if (testArray[i] > testArray[i+1]){
                    temp = testArray[i+1];
                    testArray[i+1] = testArray[i];
                    testArray[i] = temp;
                    hasSwapped = true;
                }
            }
            //countLoop += 1;
        }while (hasSwapped);
        //System.out.println(countLoop);
    }

    public static void forLoopSort(int[] testArray) {
        int temp = 0;
        for (int i = 0; i < testArray.length; i++){
            boolean hasSwapped = false;
            for (int j = 0; j < testArray.length-1; j++){
                if (testArray[j] > testArray[j+1]){
                    temp = testArray[j+1];
                    testArray[j+1] = testArray[j];
                    testArray[j] = temp;
                    hasSwapped = true;
                }
            }
            if (hasSwapped == false) {
                break;
            }
        }
    }
}
