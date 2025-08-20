public class Main {

    public static void main(String[] args) {
        IPhone basePhone = new IPhone(
                1200,
                "IPhone 17",
                "Base IPhone complectation",
                "IPhone17.png"
        );

        IPhone proMaxIPhone = basePhone.clone();
        proMaxIPhone.setImageUrl("proMaxIPhone.png");
        proMaxIPhone.setName("IPhone 17 Pro Max");
        proMaxIPhone.setDescription("Ultimate IPhone complectation");
        proMaxIPhone.setPrice(1500);

        System.out.println(basePhone.toString());
        System.out.println(proMaxIPhone.toString());
    }
}
