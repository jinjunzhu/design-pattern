package design.behavioral.memento;

import design.behavioral.DateUtils;

public class ApplicationMain {

    public static void main(String[] args) {
        Binlog binlog = new Binlog();
        SnapshotHolder snapshotsHolder = new SnapshotHolder();
        String newLog = "insert into t values(1, 12345)";
        binlog.append(newLog);
        //备份
        snapshotsHolder.storeSnapshot(DateUtils.getCurrentDate(), new Snapshot(binlog));
        String newLog1 = "insert into t1 values(1, 12345)";
        binlog.append(newLog1);
        //恢复
        binlog = snapshotsHolder.getSnapshot(DateUtils.getCurrentDate()).getBinlog();

    }
}
