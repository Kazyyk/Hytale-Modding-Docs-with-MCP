---
title: "TimeModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.time"
fqcn: "com.hypixel.hytale.server.core.modules.time.TimeModule"
api_surface: false
extends: "JavaPlugin"
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
public class TimeModule extends JavaPlugin
```

Plugin module managing the game time system. Registers world time resources, time systems, and the time command.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `TimeModule` | `get()` |
| `public` | `ResourceType<EntityStore, WorldTimeResource>` | `getWorldTimeResourceType()` |
| `public` | `ResourceType<EntityStore, TimeResource>` | `getTimeResourceType()` |
