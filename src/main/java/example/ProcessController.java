package example;

public class ProcessController {

    public Boolean controlProcess(int times, String result) {
        return times <= 6 && !result.equals("4A0B");
    }

}