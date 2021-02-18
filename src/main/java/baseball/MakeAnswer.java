package baseball;

import utils.RandomUtils;
import java.util.Vector;

public class MakeAnswer {
    public static String makeNewAnswer() {
        Vector<Integer> v = new Vector<>();
        String newAnswer=new String();
        int temp = RandomUtils.nextInt(1,9);
        v.add(temp);
        newAnswer += Integer.toString(temp);
        for(int i=1; i < 3; i++) {
            temp = unoverlappingNumber(v);
            v.add(temp);
            newAnswer += Integer.toString(temp);
        }
        return newAnswer;
    }

    public static int unoverlappingNumber(Vector<Integer> a) {
        int temp ,overlap;
        do {
            temp = RandomUtils.nextInt(1,9);
            overlap = 0;
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) == temp) overlap = 1;
            }
        }while( overlap == 1);
        return temp;
    }

}
