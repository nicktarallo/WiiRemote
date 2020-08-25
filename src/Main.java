import wiiremotej.WiiRemote;
import wiiremotej.WiiRemoteJ;

public class Main {
    public static void main(String[] args){

        WiiRemote remote =  null;
        while (remote == null) {
            try {
                remote = WiiRemoteJ.findRemote();
            }
            catch(Exception e) {
                remote = null;
                e.printStackTrace();
                System.out.println("Failed to connect remote. Trying again.");
            }
        }
    }
}
