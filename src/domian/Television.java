package domian;

public class Television {

    public Television(String name, int volume, boolean power) {
        this.name = name;
        this.volume = volume;
        this.power = power;
    }

    private String name;
    private int volume;
    private int channel;
    private boolean power;
    private boolean mute;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public boolean getPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public boolean getMute() {
        return mute;
    }

    public void setMute(boolean mute) {
        this.mute = mute;
    }

    @Override
    public String toString() {
        return "Television{" +
                "volume=" + volume +
                ", channel=" + channel +
                ", power=" + power +
                ", mute=" + mute +
                ", name='" + name + '\'' +
                '}';
    }
}
