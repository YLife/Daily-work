/**
 * @author yanglun
 * @description: singleton pattern - lazy pattern and
 * @date 2018/2/27 22:00
 */
public class LazyPattern {

    private static LazyPattern lazyPattern;

    private LazyPattern(){}

    public static synchronized LazyPattern getInstance(){
        if (lazyPattern == null){
            lazyPattern = new LazyPattern();
        }
        return lazyPattern;
    }

    public static void main(String[] args) {
        getInstance();
    }

}
