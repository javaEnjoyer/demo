package xiancheng;

/**
 * Created by zhy on 16/5/9.
 */
public class XianChengDemo {

    /**
     * 多线程的概念:
     *            线程是一个任务从头到尾的执行流,线程提供了一个运行的机制.
     *            在Java中,一个程序中可以并发的启动多个线程, 也就是说线程可以在多处理器系统上同一时刻运行.
     *            多线程可以使程序反应更快,执行效率更高
     */


    /**
     * 多线程编程:
     *            举个例子演示多线程.如果我们想要创建一个多线程程序,首先要提供多个任务去执行,想要创建一个这样的任务,
     *            我们需要实现Runnable接口,Runnable源码如下:
     *                  public interface Runnable{
     *                      public abstract void run();
     *                  }
     */
    public static void main(String [] argus){
        int i = 0;
        while (i <= 20){
            Thread threadA = new Thread(new TaskA());
            Thread threadB = new Thread(new TaskB());
            Thread threadC = new Thread(new TaskC());

            threadA.start();
            threadB.start();
            threadC.start();


            i++;
        }
    }

}
