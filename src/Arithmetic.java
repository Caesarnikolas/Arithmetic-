public class Arithmetic {

    private int first;
    private int second;

    public Arithmetic(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public void addition() {
        int totalSum = first + second;
        System.out.println("total sum = " + totalSum);

    }


    public void multiplication() {
        int totalSum = first * second;
        System.out.println("total sum = " + totalSum);

    }

    public void biggestInt() {
        int bigInt = first > second ? first : second;
        System.out.println("biggest integer = " + bigInt);

    }

    public void lowestInt() {
        int lowInt = first < second ? first : second;
        System.out.println("lowest integer = " + lowInt);

    }


}
