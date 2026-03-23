---
title: "WorldPerfCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.commands.world.perf"
fqcn: "com.hypixel.hytale.server.core.universe.world.commands.world.perf.WorldPerfCommand"
api_surface: false
extends: "AbstractWorldCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "command"
  - "universe"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.commands.world.perf`

```java
public class WorldPerfCommand extends AbstractWorldCommand
```

Abstract base for related commands.

## Fields

| Field | Type | Description |
|---|---|---|
| `PRECISION` | `double` | Static final double field. |

## Constructors

| Constructor | Description |
|---|---|
| `WorldPerfCommand()` | Creates a new WorldPerfCommand instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)` | `void` | protected method. |
| `tpsFromDelta(long delta, long min)` | `double` | static public method. |
| `tpsFromDelta(double delta, long min)` | `double` | static public method. |
