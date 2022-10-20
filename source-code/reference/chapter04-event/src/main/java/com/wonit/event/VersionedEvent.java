package com.wonit.event;

public interface VersionedEvent {
    Long getSourceId();
    int getVersion();
}
