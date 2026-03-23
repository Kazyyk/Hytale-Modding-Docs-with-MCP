---
title: "SyncEventBusRegistry"
kind: "class"
package: "com.hypixel.hytale.event"
fqcn: "com.hypixel.hytale.event.SyncEventBusRegistry"
api_surface: true
extends: "EventBusRegistry<KeyType, EventType, SyncEventBusRegistry.SyncEventConsumerMap<EventType>>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "event"
  - "class"
  - "api"
---

**Package:** `com.hypixel.hytale.event`

```java
public class SyncEventBusRegistry extends EventBusRegistry<KeyType, EventType, SyncEventBusRegistry.SyncEventConsumerMap<EventType>>
```

Registry for synchronous events that dispatches directly to consumers. Supports keyed, global, and unhandled listener registration with priority ordering and timing instrumentation.
