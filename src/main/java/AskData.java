import java.util.Scanner;

public class AskData {
    String input = "Introduce un número:";

    public String getData(){ return this.input; }
    public int readData(){ return new Scanner(System.in).nextInt(); }


}
