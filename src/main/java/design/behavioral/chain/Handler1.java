package design.behavioral.chain;

public interface Handler1 {

    void handle(String event);

    void setNext(Handler1 handler);

}
