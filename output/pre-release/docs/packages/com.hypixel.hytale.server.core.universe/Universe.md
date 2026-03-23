---
title: "Universe"
kind: "class"
package: "com.hypixel.hytale.server.core.universe"
fqcn: "com.hypixel.hytale.server.core.universe.Universe"
api_surface: true
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "universe"
  - "world"
  - "plugin"
---

**Package:** `com.hypixel.hytale.server.core.universe`

```java
public class Universe extends JavaPlugin
```

Core plugin managing the universe of worlds. Handles world creation, loading, removal, player connection/disconnection, world transfers, backup scheduling, and player data persistence. Maintains the player registry mapping UUIDs to `PlayerRef` instances and provides world lookup by name.