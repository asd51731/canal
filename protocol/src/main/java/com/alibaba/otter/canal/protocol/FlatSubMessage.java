package com.alibaba.otter.canal.protocol;

import java.io.Serializable;
import java.util.Map;

/**
 * @author machengyuan 2018-9-13 下午10:31:14
 * @version 1.0.0
 */
public class FlatSubMessage implements Serializable {

    private static final long serialVersionUID = -3386650678735860050L;
    private long xid;
    private String database;
    private String table;
    private String type;
    private boolean commit;
    private long ts;
    private Map<String, String> data;
    private Map<String, String> old;

    public FlatSubMessage() {
    }

    public FlatSubMessage(FlatMessage flatMessage) {
        this.xid = flatMessage.getId();
        this.database = flatMessage.getDatabase();
        this.table = flatMessage.getTable();
        if (flatMessage.getType().equalsIgnoreCase("alter")) {
            this.type = "table-alter";
        } else {
            this.type = flatMessage.getType().toLowerCase();
        }
        this.commit = true;
        if (flatMessage.getTs() != null && flatMessage.getTs() > 100l) {
            this.ts = flatMessage.getTs();
        } else if (flatMessage.getEs() != null && flatMessage.getEs() > 100l) {
            this.ts = flatMessage.getEs();
        }
    }

    public long getXid() {
        return xid;
    }

    public void setXid(long xid) {
        this.xid = xid;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    public Map<String, String> getOld() {
        return old;
    }

    public void setOld(Map<String, String> old) {
        this.old = old;
    }

    public boolean isCommit() {
        return commit;
    }

    public void setCommit(boolean commit) {
        this.commit = commit;
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }
}
