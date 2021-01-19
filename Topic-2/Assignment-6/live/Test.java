package live;

import music.*;
import music.string.*;
import music.wind.*;

public class Test {

    public static void main(String[] args) {
        Veena v = new Veena();
        Saxophone s = new Saxophone();
        v.play();
        s.play();
        Playable p = v;
        p.play();
        Playable r = s;
        r.play();
    }

}
