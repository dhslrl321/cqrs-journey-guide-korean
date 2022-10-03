package com.wonit;

public interface VersionedEvent extends Event {
    Type getType();
    int getVersion();

    void setSourceId(String id);

    void setVersion(int i);
}
