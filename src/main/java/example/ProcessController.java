package example;

public class ProcessController {

    public Boolean controlProcess(int times, String result) {
        if (times > 6 || result.equals("4A0B")) {
            return false;
        }
        return true;
    }

}