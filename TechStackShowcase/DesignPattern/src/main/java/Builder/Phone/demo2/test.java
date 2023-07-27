package Builder.Phone.demo2;

public class test {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("samsung")
                .screen("LGD")
                .memory("12GB")
                .board("apple")
                .build();

        System.out.println(phone);
    }
}
