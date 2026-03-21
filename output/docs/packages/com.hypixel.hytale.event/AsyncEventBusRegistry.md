---
title: "AsyncEventBusRegistry"
kind: "class"
package: "com.hypixel.hytale.event"
fqcn: "com.hypixel.hytale.event.AsyncEventBusRegistry"
api_surface: true
extends: "EventBusRegistry<KeyType, EventType, AsyncEventBusRegistry.AsyncEventConsumerMap<EventType>>"
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
public class AsyncEventBusRegistry extends EventBusRegistry<KeyType, EventType, AsyncEventBusRegistry.AsyncEventConsumerMap<EventType>>
```

Registry for async events that dispatches via `CompletableFuture` chains. Supports keyed, global, and unhandled async listener registration with priority ordering and timing instrumentation.
