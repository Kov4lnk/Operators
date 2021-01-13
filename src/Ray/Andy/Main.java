package Ray.Andy;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // resut = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = "+ result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2;
        result += 2;
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;
        System.out.println("10 - 2 = " + result);



        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("It is not an alien!");
        }


        int topScore = 100;
        if (topScore == 100){
            System.out.println("You got the high score!");
        }

        


//        Challenge
        double doubleOne = 20.00d;
        double doubleTwo = 80.00d;
        double firstResult = (doubleOne + doubleTwo) * 100.00d;
        System.out.println(firstResult);
        double remainResult = firstResult % 40.00d;
        System.out.println(remainResult);

        boolean isDevidedbyFourty = (remainResult == 0) ? true : false;
        System.out.println(isDevidedbyFourty);

        if (!isDevidedbyFourty){
            System.out.println("Got some remainder");
        }




    }
}
