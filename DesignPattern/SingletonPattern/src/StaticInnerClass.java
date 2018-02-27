/**
 * @author yanglun
 * @description: singleton pattern - static inner class(the best)
 * @date 2018/2/27 22:36
 */
public class StaticInnerClass {

    private static class Singleton{
        private final static StaticInnerClass instance = new StaticInnerClass();
    }

    private StaticInnerClass(){}

    public static StaticInnerClass getInstance(){
        return Singleton.instance;
    }

    public static void main(String[] args) {
        getInstance();
    }
}
