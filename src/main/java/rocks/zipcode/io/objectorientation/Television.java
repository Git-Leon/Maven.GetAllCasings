package rocks.zipcode.io.objectorientation;

public class Television {
    private TVChannel currentChannel;
    private boolean isTurnedOn;

    public void turnOn() {
        this.isTurnedOn = true;
    }

    public void setChannel(Integer channel) {
        if(!isTurnedOn) {
            throw new IllegalStateException();
        }
        this.currentChannel = TVChannel.getByOrdinal(channel);
    }

    public TVChannel getChannel() {
        return currentChannel;
    }
}
