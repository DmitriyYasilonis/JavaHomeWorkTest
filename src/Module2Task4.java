public class Module2Task4 {
    // Task4
    public static void main(String[] args) {
        int start = 10;
        int end = 150;
        int start2 = 9980;
        int end2 = 10000;
        for (int number = start; number <= end2; number++) {
            if ((number >= start && number <= end) || (number >= start2 && number <= end2))
                if (number == 0) {
                    System.out.print("Number in words: Zero");
                } else {
                    System.out.println(numberToWord(number));
                }
        }
    }

    private static String numberToWord(int number) {
        String words = "";
        String unitsArray[] = {"zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"};
        String tensArray[] = {"zero", "ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};

        if (number == 0) {
            return "zero";
        }
        if (number < 0) {
            String numberStr = "" + number;
            numberStr = numberStr.substring(1);
            return "minus " + numberToWord(Integer.parseInt(numberStr));
        }
        if ((number / 1000000) > 0) {
            words += numberToWord(number / 1000000) + " million ";
            number %= 1000000;
        }
        if ((number / 1000) > 0) {
            words += numberToWord(number / 1000) + " thousand ";
            number %= 1000;
        }
        if ((number / 100) > 0) {
            words += numberToWord(number / 100) + " hundred ";
            number %= 100;
        }

        if (number > 0) {
            if (number < 20) {
                words += unitsArray[number];
            } else {
                words += tensArray[number / 10];
                if ((number % 10) > 0) {
                    words += "-" + unitsArray[number % 10];
                }
            }
        }
        return words;
    }
}

