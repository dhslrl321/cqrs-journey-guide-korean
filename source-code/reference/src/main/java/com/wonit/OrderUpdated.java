package com.wonit;

public class OrderUpdated implements VersionedEvent {
    public OrderUpdated(Object convertItems) {

    }

    @Override
    public Type getType() {
        return null;
    }

    @Override
    public int getVersion() {
        return 0;
    }

    @Override
    public void setSourceId(String id) {

    }

    @Override
    public void setVersion(int i) {

    }
}
