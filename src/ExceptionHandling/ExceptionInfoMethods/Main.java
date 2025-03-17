package ExceptionHandling.ExceptionInfoMethods;

public class Main
{
    public static void main(String[] args) {
        GetMessage gm = new GetMessage();
        gm.getMsg();

        PrintST pst = new PrintST();
        pst.connectPrintST();

        TString ts = new TString();
        ts.tString();
    }
}