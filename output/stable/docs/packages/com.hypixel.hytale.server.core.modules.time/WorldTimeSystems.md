---
title: "WorldTimeSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.time"
fqcn: "com.hypixel.hytale.server.core.modules.time.WorldTimeSystems"
api_surface: false
extends: ~
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
public class WorldTimeSystems
```

Container for world time initialization and ticking systems.

## Inner Types

### Init

```java
public static class WorldTimeSystems.Init extends StoreSystem<EntityStore>
```

Initializes `WorldTimeResource` from world config on system add; saves time back on remove.

### Ticking

```java
public static class WorldTimeSystems.Ticking extends TickingSystem<EntityStore>
```

Advances world time each tick.
