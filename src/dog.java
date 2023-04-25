public class dog {
    void cat(int q , int r) {
        System.out.println(q-r);

    }
    void cat(String b ) {
        System.out.println("bark");

    }

    public static void main(String[] args) {
        dog d = new dog();
        d.cat(10 , 5);
        d.cat("bark");
    }
}
