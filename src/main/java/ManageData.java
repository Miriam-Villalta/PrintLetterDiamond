
public class ManageData {
    Data data;
    int opt;
    public void manage(AskData input, Data data){
        this.data = data;

        System.out.println(input.getData());
        opt = input.readData();
        int sequence = data.loop(opt);
        printResult(sequence);
    }

    private void printResult(int output){
        System.out.println(output);
    }
}
