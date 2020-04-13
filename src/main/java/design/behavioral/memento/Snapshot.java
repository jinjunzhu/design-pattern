package design.behavioral.memento;

public class Snapshot {

    private Binlog binlog;

    public Snapshot(Binlog binlog) {
        this.binlog = binlog;
    }

    public Binlog getBinlog() {
        return this.binlog;
    }
}
