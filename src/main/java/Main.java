import services.CrackerService;
import services.PeanutButterService;

import java.io.IOException;

public class Main {
    private PeanutButterService pbs = new PeanutButterService();
    private CrackerService cs = new CrackerService();

    public Main() throws IOException {
    }


    public static void main(String... args) throws IOException {
        Main app = new Main();
        app.init();
    }

    public void init(){
        Console.printWelcome();


    }


}
