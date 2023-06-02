package activities;

public class Activity2 {
    public static void main(String[] args) {
        int[] array = {10, 77, 10, 54, -11, 10};
        int searchNum = 10;
        int finalTotal = 30;
        System.out.println("The sum of total number of 10s in the array is 30? " + total(array, searchNum, finalTotal));
    }
        public static boolean total(int array[], int searchNum,int finalTotal)
        {
            int sum=0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == searchNum) {
                    sum = sum + array[i];
                    if (sum > finalTotal) {
                        break;

                    }
                }
            }
                return sum==finalTotal;

            }
        }
