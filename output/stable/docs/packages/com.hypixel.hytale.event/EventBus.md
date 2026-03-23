---
title: "EventBus"
kind: "class"
package: "com.hypixel.hytale.event"
fqcn: "com.hypixel.hytale.event.EventBus"
api_surface: true
extends: null
implements:
  - "IEventBus"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "event"
  - "class"
  - "api"
---

**Package:** `com.hypixel.hytale.event`

```java
public class EventBus implements IEventBus
```

Central event bus that manages sync and async event registries. Routes registrations and dispatches to the appropriate `SyncEventBusRegistry` or `AsyncEventBusRegistry` based on event type. Supports keyed, global, and unhandled listeners with priority.
