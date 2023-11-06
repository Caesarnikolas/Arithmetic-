public class Main {


    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");
        basket.add("Soloma", 20, 50, 0.3);
       basket.print("korzina");

        Arithmetic primer = new Arithmetic(3, 77);
        primer.biggestInt();

    }
}
