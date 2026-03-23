---
title: "WorldConfigPauseTimeCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.commands.worldconfig"
fqcn: "com.hypixel.hytale.server.core.universe.world.commands.worldconfig.WorldConfigPauseTimeCommand"
api_surface: false
extends: "AbstractWorldCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "command"
  - "universe"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.commands.worldconfig`

```java
public class WorldConfigPauseTimeCommand extends AbstractWorldCommand
```

Abstract base for related commands.

## Constructors

| Constructor | Description |
|---|---|
| `WorldConfigPauseTimeCommand()` | Creates a new WorldConfigPauseTimeCommand instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)` | `void` | protected method. |
| `pauseTime(@Nonnull CommandSender commandSender, @Nonnull World world, @Nonnull Store<EntityStore> store)` | `void` | static public method. |
