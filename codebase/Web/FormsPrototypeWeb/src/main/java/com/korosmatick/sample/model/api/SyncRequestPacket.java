package com.korosmatick.sample.model.api;

import java.util.List;

public class SyncRequestPacket {
	private int type = 1; // 1 = new object creation, 2 = update, 3 = delete

    private List<Row> records;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<Row> getRecords() {
        return records;
    }

    public void setRecords(List<Row> records) {
        this.records = records;
    }
}