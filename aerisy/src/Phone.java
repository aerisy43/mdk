public class Phone {
    String phone;
    String model;
    int weight;
    public Phone(String number, String models, int weight) {
        this(number, models);
        this.weight = weight;
        System.out.print(number + " " +  models + " ");
        System.out.print(weight);
        System.out.println("");
    }
    public Phone(String phoneNum, String models) {
        this.phone = phoneNum;
        this.model = models;
    }
    public Phone() {
    }
    public String GetNumber() {
        return phone;
    }
    public void receiveCall(String name) {
        System.out.println("Звонит вам " + name);
    }
    public void receiveCall(String name, String phoneNumber) {
        System.out.println("Звонит вам " + name + " телефон " + phoneNumber);
    }
    public static void sendMessage(String[] numbers){
        System.out.println("Вы отправили сообщения на номера: ");
        for (String number : numbers) {
            System.out.print(number + " ");
        }
    }
}