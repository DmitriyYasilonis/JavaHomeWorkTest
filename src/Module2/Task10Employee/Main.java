package Module2.Task10Employee;

public class Main {

    public static void main(String[] args) {
        ITest[] testList = new ITest[1];

        testList[0] = new TestEmployee();


        for (int i = 0; i < testList.length; i++) {

            System.out.println("Test number 10 - Employee");
            String result = testList[i].run();
            if (result != "")
                System.out.println(result);
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
