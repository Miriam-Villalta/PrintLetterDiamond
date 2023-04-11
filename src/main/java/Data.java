
public class Data {
    String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private void printResult(int letters){
        printUp(letters);
        printMiddle(letters);
        printDown(letters);
    }

    private void printDown(int letters) {
        for (int i = letters-1; i >= 0; i--){
            String blank = " ".repeat(letters-i-1);

            String firstSeq = abc.substring(0, i);
            char letter = abc.charAt(i);
            String finalSeq = new StringBuilder(firstSeq).reverse().toString();

            System.out.println(blank + firstSeq + letter + finalSeq);
        }
    }

    private void printMiddle(int letters) {
        String firstSeq = abc.substring(0, letters-1);
        char letter = abc.charAt(letters-1);
        String finalSeq = new StringBuilder(firstSeq).reverse().toString();

        System.out.println(firstSeq + letter + finalSeq);
    }

    private void printUp(int letters) {
        for (int i = 0; i < letters-1; i++){
            String blank = " ".repeat(letters-i-1);

            String firstSeq = abc.substring(0, i);
            char letter = abc.charAt(i);
            String finalSeq = new StringBuilder(firstSeq).reverse().toString();

            System.out.println(blank + firstSeq + letter + finalSeq);
        }
    }

    public static void main(String[] args) {
        Data data = new Data();

        data.printResult(7);
    }
}