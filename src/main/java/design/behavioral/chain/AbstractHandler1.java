package design.behavioral.chain;

public abstract class AbstractHandler1 implements Handler1{

    public Handler1 next;

    @Override
    public void setNext(Handler1 handler){
        this.next = handler;
    }

    @Override
    public void handle(String event) {
        boolean result = doHandle(event);
        if(!result && hasNext()){
            next.handle(event);
        }
    }

    protected boolean hasNext(){
        return this.next != null;
    }

    public abstract boolean doHandle(String event);
}
