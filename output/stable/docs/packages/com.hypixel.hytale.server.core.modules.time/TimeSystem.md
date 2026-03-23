---
title: "TimeSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.time"
fqcn: "com.hypixel.hytale.server.core.modules.time.TimeSystem"
api_surface: false
extends: "TickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "time"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.time`

```java
public class TimeSystem extends TickingSystem<EntityStore>
```

Advances the `TimeResource` clock by the delta time each tick.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `tick(float dt, int systemIndex, Store<EntityStore> store)` |
