
public class Main {

    public static void main(String[] args) {
        try {
            HelloWorld hola = new HelloWorld("Romanian");
            hola.setRepeats(3);
            System.out.print(hola.sayHello());
        } catch (LanguageNotFoundException e) {
            System.out.println("shouldn't throw exception here");
        }


    }
}
