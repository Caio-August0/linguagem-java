package domian;

public class Control implements InterControl {

    private Television television;

    public Television getTelevision() {
        return television;
    }

    public void setTelevision(Television television) {
        this.television = television;
    }

    @Override
    public void power(Television television) {

        if (!television.getPower()) {
            television.setPower(true);
            System.out.println("A televisão está ligada.");
        } else {
            television.setPower(false);
            System.out.println("A televisão está desligada.");
        }

    }

    @Override
    public void upVolume(Television television) {

        if (television.getPower()) {
            if (television.getVolume() < 100) {
                television.setVolume(television.getVolume() + 1);
                System.out.println(" Volume: [ " + television.getVolume() + " ]");
            } else if (television.getVolume() == 100) {
                System.out.println("A televisão está no volume máximo.");
            }
        } else {
            System.out.println("A televisão está desligada, não podemos aumentar o volume.");
        }

    }

    @Override
    public void downVolume(Television television) {

        if (television.getPower()) {
            if (television.getVolume() > 0) {
                television.setVolume(television.getVolume() - 1);
                System.out.println(" Volume: [ " + television.getVolume() + " ]");
            } else if (television.getVolume() == 0) {
                System.out.println("A televisão está no volume mínimo.");
            }
        } else {
            System.out.println("A televisão está desligada, não podemos diminuir o volume.");
        }

    }

    @Override
    public void nextChannel(Television television) {

        if (television.getPower()) {
            television.setChannel(television.getChannel() + 1);
            System.out.println(" Canal: [ " + television.getChannel() + " ]");
        } else {
            System.out.println("A televisão está desligada, não podemos mudar de canal");
        }

    }

    @Override
    public void previousChannel(Television television) {

        if (television.getPower()) {
            television.setChannel(television.getChannel() - 1);
            System.out.println(" Canal: [ " + television.getVolume() + " ]");
        } else {
            System.out.println("A televisão está desligada, não podemos mudar de canal");
        }

    }

    @Override
    public void mute(Television television) {

        if (television.getPower()) {
            if (!television.getMute()) {
                television.setMute(true);
                System.out.println("A tevelisão está mutada.");
            } else {
                television.setMute(false);
                System.out.println("A tevelisão não está mutada.");
            }
        } else {
            System.out.println("A televisão está desligada, não podemos mutar.");
        }

    }

}
