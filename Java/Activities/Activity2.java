package Activities;

public class Activity2 {
    public static void main(String[] args) {
        int [] array= {10, 77, 10, 54, -11, 10};

        //System.out.println(Arrays.toString(array));

        int searchNum = 10;
        int value =30;

        System.out.println(result(array,searchNum,value));


    }
    public static boolean result(int[]numbers, int searchNum, int value){

        int temp =0;

        for (int number:numbers) {
            if (number == searchNum) {
                temp += searchNum;

            }
            if (temp > value)
            {
                break;
            }
        }
    return temp==value;
    }
}
