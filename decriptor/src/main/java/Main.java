public class Main {
    public static void main(String[] args) {
       // System.out.println("hello world");

        String s = "носок";

        EncriptDecript ed = new EncriptDecript();

        String rotate = ed.encriptorString(s, 20);


        System.out.println(rotate);
    }
}
