---
title: "EventRegistry"
kind: "class"
package: "com.hypixel.hytale.event"
fqcn: "com.hypixel.hytale.event.EventRegistry"
api_surface: true
extends: "Registry<EventRegistration<?, ?>>"
implements:
  - "IEventRegistry"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "event"
  - "class"
  - "api"
---

**Package:** `com.hypixel.hytale.event`

```java
public class EventRegistry extends Registry<EventRegistration<?, ?>> implements IEventRegistry
```

Scoped event registration wrapper that delegates to a parent `IEventRegistry` while managing its own registration lifecycle and precondition checks.
