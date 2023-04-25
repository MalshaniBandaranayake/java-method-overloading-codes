public class strIn {
    void display(double a){
        System.out.println("double!");

    }
    void display(String b){
        System.out.println("string!");
    }

    public static void main(String[] args) {
        strIn st = new strIn();
        st.display(78.78);
        st.display("malshani");
    }
}
