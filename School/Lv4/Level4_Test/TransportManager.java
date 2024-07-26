package level4Exam;

public class TransportManager <T extends Movable> {
    private T transport;

    public T getTransport() {
        return transport;
    }

    public void setTransport(T transport) {
        this.transport = transport;
    }

    public void moveTransport(Double distance) {
        transport.move(distance);
    }
}
