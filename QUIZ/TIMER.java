import java.util.Timer;
import java.util.TimerTask;

public class TIMER {
  Timer timer;

  public TIMER(int seconds) {
    timer = new Timer();
    timer.schedule(new StopTask(), seconds * 60);
  }

    public static void main(String[] args) {
    new TIMER(60);
    System.out.println("StopWatch Started.");
  }

  class StopTask extends TimerTask {
    public void run() {
      System.out.println("Time Up!");
      timer.cancel();
    }
  }
}