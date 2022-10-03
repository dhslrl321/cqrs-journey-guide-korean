package com.wonit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AbstractEventSourced implements EventSourced {

    private final Map<Type, Action<VersionedEvent>> handlers = new HashMap<>();
    private final List<VersionedEvent> pendingEvents = new ArrayList<>();

    private final String id;
    private int version = -1;

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public int getVersion() {
        return this.version;
    }

    @Override
    public List<VersionedEvent> getEvents() {
        return this.pendingEvents;
    }

    // protected void handles(Action<Event> handler) {
    protected void handles(Action<VersionedEvent> handler) {
        this.handlers.put(null, handler);
    }

    protected void loadFrom(List<VersionedEvent> pastEvents) {
        for (VersionedEvent e : pastEvents) {
            this.handlers.get(e.getType()).invoke(e);
            this.version = e.getVersion();
        }
    }

    protected void update(VersionedEvent e) {
        e.setSourceId(this.id);
        e.setVersion(this.version + 1);
        this.handlers.get(e.getType()).invoke(e);
        this.pendingEvents.add(e);
    }








}
