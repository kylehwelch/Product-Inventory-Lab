import services.CrackerService;
import services.PeanutButterService;

public class Main {
    private PeanutButterService pbs = new PeanutButterService();
    private CrackerService cs = new CrackerService();


    public static void main(String... args){
        Main app = new Main();
        app.init();
    }

    public void init(){
        Console.printWelcome();


    }


}
