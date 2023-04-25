public class sum {
    void cal(int a , long b) {
        System.out.println(a+b);

    }
    void cal (int c , int d){
        System.out.println(c+d);

    }

    public static void main(String[] args) {
        sum s = new sum();
        s.cal(5 , 125L);
        s.cal( 9 , 253);
    }
}
