---
title: "FarmingSystems.Ticking"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.FarmingSystems.Ticking"
api_surface: false
extends: "EntityTickingSystem<ChunkStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "ecs"
  - "system"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming`

```java
public static class FarmingSystems.Ticking extends EntityTickingSystem<ChunkStore>
```

Main tick system for the farming module operating on `ChunkStore`. Iterates over ticking blocks in each section and dispatches to `FarmingUtil.tickFarming` for farming blocks, `tickSoil` for tilled soil, and `tickCoop` for coop blocks. Soil ticking handles decay timers, watering state, and block type transitions. Coop ticking handles wild NPC capture, resident spawning/despawning based on roam time, produce generation, and interaction state updates.

Declared as a static inner class of [FarmingSystems](FarmingSystems.md). Registered by [FarmingPlugin](FarmingPlugin.md) during setup.

## Key Methods

| Return Type | Signature |
|---|---|
| `void` / `Query` | `tick(...)` |
| `void` / `Query` | `getQuery(...)` |
