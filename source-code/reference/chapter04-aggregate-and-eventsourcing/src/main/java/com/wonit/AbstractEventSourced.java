package com.wonit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class AbstractEventSourced implements EventSourced {

    @Getter
    private final String id;
    @Getter
    private int version = -1;
    @Getter
    private final Map<Type, Action<VersionedEvent>> handlers = new HashMap<>();
    private final List<VersionedEvent> pendingEvents = new ArrayList<>();

    protected AbstractEventSourced(String id) {
        this.id = id;
    }

    @Override
    public List<VersionedEvent> getEvents() {
        return pendingEvents;
    }

    protected void handles(Action<VersionedEvent> handler) {
        this.handlers.put(handler.getType(), handler);
    }

    protected void loadFrom(List<VersionedEvent> pastEvents) {
        for (VersionedEvent e : pastEvents) {
            this.handlers.get(e).invoke(e);
            this.version = e.getVersion();
        }
    }

    protected void update(VersionedEvent e) {
        e.setSourceId(this.id);
        e.setVersion(this.version + 1);
        this.handlers.get(e.getType()).invoke(e);
        this.version = e.getVersion();
        this.pendingEvents.add(e);
    }
}
