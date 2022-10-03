package com.wonit;

import java.util.List;

public interface EventSourced {
    String getId();
    int getVersion();
    List<VersionedEvent> getEvents();
}
