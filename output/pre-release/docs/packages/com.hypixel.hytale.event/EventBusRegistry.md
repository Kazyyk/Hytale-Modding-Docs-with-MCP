---
title: "EventBusRegistry"
kind: "class"
package: "com.hypixel.hytale.event"
fqcn: "com.hypixel.hytale.event.EventBusRegistry"
api_surface: true
extends: null
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
public class EventBusRegistry
```

Abstract base for keyed event bus registries. Manages priority-sorted consumer maps, global and unhandled listener channels, and lifecycle (shutdown). Contains inner abstract classes `EventConsumer` (priority + timer) and `EventConsumerMap` (concurrent priority-keyed consumer storage implementing `IEventDispatcher`).
