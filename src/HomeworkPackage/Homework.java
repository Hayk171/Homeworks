package HomeworkPackage;

public class Homework {

    public static void main(String[] args) {


        // Homework 2/ Task 1
        int a = 2;

        int[] intArray = new int[10];
        for (int j = 0; j < 10; j++) {
            intArray[j] = a;
            System.out.print(intArray[j] + " ");

        }


        System.out.println();
        System.out.println();

        // Homework 2/ Task 2
        int[] intArray2 = new int[101];
        for (int k = 0; k <= (intArray2.length - 1); k++) {
            intArray2[k] = k;
            System.out.print(intArray2[k] + " ");
        }



        System.out.println();
        System.out.println();


        // Homework 2/ Task 3 ????????????????????????????????????????????
        int k = -20;
        int[] oddArray = new int[20];

        for (int j = 0; j < oddArray.length; j++) {

            if (k % 2 != 0){
                oddArray[j] = k;
                System.out.print(oddArray[j] + " ");
            }k++;
        }




        System.out.println();
        System.out.println();



        // Homework 3/ Task 1
        int[] randomArray = {10,8,-3,7,820,-61,7912,-75,61,48,5,1,789,-125,713};
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] % 5 == 0){
                System.out.print(randomArray[i] + " ");
            }

        }




        System.out.println();
        System.out.println();





        // Homework 3/ Task 2
        double[] doubleArr = {1.5, 5.9, 4567.8, 74.5, -7.9, 123.8, -89.2, 456.1, 1.2, 7.9, -12.7, -9456.7, 45698.7891};
        for (int i = 0; i < doubleArr.length; i++) {
            if ((doubleArr[i] > 24.12) && (doubleArr[i] < 467.23)) {
                System.out.print(doubleArr[i] + " ");
            }
        }



        System.out.println();
        System.out.println();




        // Homework 3/ Task 3

        int count = 0;

        int[] countArrNumbers = {5, 6, 10, -5, 860, -50, 985, 655564, -46561, 549, -46, -81, 79, -64};
        for (int i = 0; i < countArrNumbers.length; i++) {
            if(countArrNumbers[i] % 2 == 0){
                count++;
            }

        }

        System.out.println(count);




        System.out.println();
        System.out.println();




        // Homework 4

        int f = 9;
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < f; j++) {
            }
            System.out.println(f + "x" + i +  "=" + f*i);

        }





        }


}
