package com.wonit.event;

import lombok.Value;

public class AbstractVersionedEvent implements VersionedEvent {
    Long sourceId;
    int version;

    @Override
    public Long getSourceId() {
        return sourceId;
    }

    @Override
    public int getVersion() {
        return version;
    }
}
