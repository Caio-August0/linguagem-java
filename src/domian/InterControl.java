package domian;

public interface InterControl {

    abstract void power(Television television);
    abstract void upVolume(Television television);
    abstract void downVolume(Television television);
    abstract void nextChannel(Television television);
    abstract void previousChannel(Television television);
    abstract void mute(Television television);

}
