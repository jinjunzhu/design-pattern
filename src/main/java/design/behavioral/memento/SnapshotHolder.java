package design.behavioral.memento;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SnapshotHolder {

    private Map<String, Snapshot> snapshots = new HashMap<>(100);

    public Snapshot getSnapshot(String date) {
        return snapshots.get(date);
        /*Binlog binlog = new Binlog();
        for (String key : snapshots.keySet()){
            if (key.compareTo(date) <= 0){
                binlog.append(snapshots.get(date).getBinlog().getText());
            }
        }
        return new Snapshot(binlog);*/
    }

    public void storeSnapshot(String date, Snapshot snapshot) {
        snapshots.put(date, snapshot);
    }
}
