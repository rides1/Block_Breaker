public class Animate implements Runnable{
    BlockPanel bp;
    Animate(BlockPanel b){
        bp = b;
    }
    public void run(){
        while(true){
            bp.update();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
