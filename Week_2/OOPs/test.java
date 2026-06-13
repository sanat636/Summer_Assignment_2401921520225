package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public interface Playable {
    void play();
}
public class Veena implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Veena");
    }
}
public class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Saxophone");
    }
}

public class Test {

    public static void main(String[] args) {
        Veena veena = new Veena();
        veena.play();
        Saxophone saxophone = new Saxophone();
        saxophone.play();
        Playable p1 = new Veena();
        p1.play();
        Playable p2 = new Saxophone();
        p2.play();
    }
}
