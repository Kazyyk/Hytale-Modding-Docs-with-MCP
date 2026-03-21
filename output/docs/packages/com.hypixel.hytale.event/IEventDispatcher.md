---
title: "IEventDispatcher"
kind: "interface"
package: "com.hypixel.hytale.event"
fqcn: "com.hypixel.hytale.event.IEventDispatcher"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "event"
  - "interface"
  - "api"
---

**Package:** `com.hypixel.hytale.event`

```java
public interface IEventDispatcher
```

Dispatches events to registered listeners. Provides `hasListener()` to check if any listeners are registered, and `dispatch(EventType)` to fire events.
