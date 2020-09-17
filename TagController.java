import java.util.Timer;
import java.util.TimerTask;

public class TagController extends TimerTask {

    private boolean debug = true;//prints debug info when true
    private TagView view;
    private Timer timer;
    private final int timerMS = 500;
    private final int frameWidth = 900;
    private final int frameHeight = 600;

    public static void main(String[] args) {//constructs an instance of TagController
        TagController theGame = new TagController();
    }

    public TagController() {

        timer = new Timer();
        view = new TagView(debug, frameWidth, frameHeight);


    }

    public void startTimer() {//begin the timer
        timer.schedule(this, 0, timerMS);

    }

    public void stopTimer() {//end the timer
        timer.cancel();

    }

    public void run() {//called every tick
        if (debug)
            System.out.println("Timer ran ");

    }

}
