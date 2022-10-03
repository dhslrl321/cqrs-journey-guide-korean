package com.wonit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AbstractEventSourced implements EventSourced {

    private final Map<Type, Action<VersionedEvent>> handlers = new HashMap<>();

    @Override
    public String getId() {
        return null;
    }

    @Override
    public int getVersion() {
        return 0;
    }

    @Override
    public List<VersionedEvent> getEvents() {
        return null;
    }
}
