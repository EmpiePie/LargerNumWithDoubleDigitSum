public class Main {

    public static void main(String[] args) {

        System.out.println(solutions(10));

    }

    public static int solutions (int N){

        if (N < 1 || N > 500) {

            return -1;
        }

        int nNumber = N;

        int nSum = 0;
        String nString = Integer.toString(nNumber);

        for (int i = 0; i < nString.length(); i++) {

            nSum += nNumber % 10;

            nNumber /= 10;

        }

        int checkNumber = N;

        while (true) {

            checkNumber++;

            int temp = checkNumber;
            int checkSum = 0;
            String checkString = Integer.toString(temp);

            for (int j = 0; j < checkString.length(); j++) {

                checkSum += temp % 10;

                temp /= 10;

            }

            if (checkSum == nSum * 2) {

                return checkNumber;

            }

        }

    }
}
