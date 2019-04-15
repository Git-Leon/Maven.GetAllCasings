package rocks.zipcode.io.objectorientation;

public class Television {
    private TVChannel currentChannel;
    private boolean isTurnedOn;

    public void turnOn() {
        this.isTurnedOn = true;
    }

    public void turnOff() {
        this.isTurnedOn = true;
    }

    public Boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setChannel(Integer channel) {
        this.currentChannel = TVChannel.getByOrdinal(channel);
    }

    public TVChannel getChannel() {
        return currentChannel;
    }
}
