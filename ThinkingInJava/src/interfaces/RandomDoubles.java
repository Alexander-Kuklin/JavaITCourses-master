package interfaces;

import java.util.Random;

/**
 * Created by ����� on 06.10.15.
 */
public class RandomDoubles {
    private Random random = new Random(47);
    public double next(){
        return random.nextDouble();
    }

}
