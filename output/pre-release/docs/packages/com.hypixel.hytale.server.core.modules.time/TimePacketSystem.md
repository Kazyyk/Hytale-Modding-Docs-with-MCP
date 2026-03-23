---
title: "TimePacketSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.time"
fqcn: "com.hypixel.hytale.server.core.modules.time.TimePacketSystem"
api_surface: false
extends: "DelayedSystem<EntityStore>"
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
public class TimePacketSystem extends DelayedSystem<EntityStore>
```

Broadcasts the current game time to all players at 1-second intervals when game time is not paused.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `delayedTick(float dt, int systemIndex, Store<EntityStore> store)` |
