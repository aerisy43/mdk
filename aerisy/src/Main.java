public class Main {
    public static void main(String[] args) {
        MySolution.main();
       
        System.out.println("Задание №1");
        System.out.println("");

        Phone phone1 = new Phone("78106762835", "bluckberry", 420);
        Phone phone2 = new Phone("78036482135", "iphone", 222);
        Phone phone3 = new Phone("78976986712", "samsung", 648);
        System.out.println("");

        phone1.receiveCall("skyel");
        System.out.println(phone1.GetNumber());
        phone2.receiveCall("k0n4");
        System.out.println(phone2.GetNumber());
        phone3.receiveCall("haatt");
        System.out.println(phone3.GetNumber());
        System.out.println("");

        phone1.receiveCall("skyel", "78106762835");
        phone2.receiveCall("k0n4", "78036482135");
        phone3.receiveCall("haatt", "78976986712");
        System.out.println("");

        String[] nums = new String[]{"78106762835", "78036482135", "78976986712"};
        Phone.sendMessage(nums);
        System.out.println("");
        System.out.println("");

        System.out.println("Задание №2");

        System.out.println("");
        Person nn = new Person();
        Person Maxim = new Person("Максим Беседин Александрович", 17);
        Maxim.move(Maxim.fullName);
        Maxim.talk(Maxim.fullName);
    }
}
