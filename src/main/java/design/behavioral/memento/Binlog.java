package design.behavioral.memento;

public class Binlog {

    private StringBuilder logBuilder = new StringBuilder();

    public String getText() {
        return logBuilder.toString();
    }

    public void append(String log) {
        logBuilder.append(log);
    }

    public Snapshot createSnapshot() {
        return new Snapshot(this);
    }

    public void restoreSnapshot(Snapshot snapshot) {
        this.logBuilder = new StringBuilder(snapshot.getBinlog().getText());
    }
}
