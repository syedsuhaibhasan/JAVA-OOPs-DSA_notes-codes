package MultiThreadingPractice;

public class prac4 extends Thread{
      private final trafficColor color;

    public prac4(trafficColor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s active",color);
          try {
              Thread.sleep(color.getOntimeInMillis());
          } catch (InterruptedException ex) {
              System.getLogger(prac4.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
          }
          System.out.printf("%s Inactive\n",color);
    }
    
    public static void main(String[] args) throws InterruptedException {
        prac4 red = new prac4(trafficColor.RED);
        prac4 green = new prac4(trafficColor.GREEN);
        prac4 yellow = new prac4(trafficColor.YELLOW);
        
        green.start();
        green.join();
        yellow.start();
        yellow.join();
        red.start();
    }
}
