---
title: "WorldConfigProvider"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.WorldConfigProvider"
api_surface: true
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "world"
  - "config"
  - "persistence"
---

**Package:** `com.hypixel.hytale.server.core.universe.world`

```java
public interface WorldConfigProvider
```

Strategy interface for loading and saving `WorldConfig`. The default implementation reads from / writes to `config.json` within the world save directory, handling migration from the legacy `config.bson` format.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `load(Path, String)` | `CompletableFuture<WorldConfig>` | Loads a world config from the save path. Migrates `config.bson` to `config.json` if needed. |
| `save(Path, WorldConfig, World)` | `CompletableFuture<Void>` | Saves a world config to `config.json` in the save path. |

## Inner Types

### Default (class)

Empty default implementation that inherits the interface's default method behavior.

## See Also

- [WorldConfig](WorldConfig.md)
- [World](World.md)
