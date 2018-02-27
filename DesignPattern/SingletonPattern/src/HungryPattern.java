/**
 * @author yanglun
 * @description: singleton pattern - hungry pattern
 * @date 2018/2/27 22:32
 */
public class HungryPattern {

    private static HungryPattern hungryPattern = new HungryPattern();

    private HungryPattern(){}

    public  static HungryPattern getInstance(){
        return hungryPattern;
    }

    public static void main(String[] args) {
        getInstance();
    }
}
