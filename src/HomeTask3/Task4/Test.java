package HomeTask3.Task4;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Passport, Citizen> citizens = new HashMap<>();

        Passport pspOne = new Passport("QW", "123456");
        Citizen ctzOne = new Citizen("Andrey", "Andreev", pspOne);
        citizens.put(pspOne, ctzOne);

        Passport pspTwo = new Passport("AS", "234567");
        Citizen ctzTwo = new Citizen("Ivan", "Ivanov", pspTwo);
        citizens.put(pspTwo, ctzTwo);

        Passport pspThree = new Passport("ZX", "345678");
        Citizen ctzThree = new Citizen("Andrey", "Ivanov", pspThree);
        citizens.put(pspThree, ctzThree);

        citizens.forEach((psp, ctz) ->
                System.out.println("Passport => " + psp.getFullId() + " Citizen => " + ctz.getFullName()));

    }
}
