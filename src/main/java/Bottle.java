public class Bottle {
    private int volume;

    public Bottle() {
        this.volume = 100;
    }

    public int getVolume() {
        return volume;
    }


    public void drink() {
        if (volume >= 10) {
            volume -= 10;
        } else {
            volume = 0;
        }
    }

    public void empty() {
        volume = 0;
    }

    public void refill() {
        volume = 100;
    }
}
