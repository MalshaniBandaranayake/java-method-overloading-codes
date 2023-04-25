public class dog {
    void dog(int q , int r) {
        System.out.println(q-r);

    }
    void dog(String b ) {
        System.out.println("bark");

    }

    public static void main(String[] args) {
        dog d = new dog();
        d.dog(10 , 5);
        d.dog("bark");
    }
}
