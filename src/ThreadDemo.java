public class ThreadDemo extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println("thread"+i);
        }
    }

    public static void main(String[] args) {

        ThreadDemo threadDemo=new ThreadDemo();
        threadDemo.start();
        for (int i = 0; i <100 ; i++) {
            System.out.println("main:"+i);
        }
    }
}
