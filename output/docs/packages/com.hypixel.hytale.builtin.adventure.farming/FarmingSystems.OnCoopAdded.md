---
title: "FarmingSystems.OnCoopAdded"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.FarmingSystems.OnCoopAdded"
api_surface: false
extends: "RefSystem<ChunkStore>"
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
public static class FarmingSystems.OnCoopAdded extends RefSystem<ChunkStore>
```

Listens for [CoopBlock](CoopBlock.md) entity additions on `ChunkStore`. On add, schedules the next coop tick. On removal (unless unloading), calls `handleBlockBroken` to spawn residents and drop produce.

Declared as a static inner class of [FarmingSystems](FarmingSystems.md). Registered by [FarmingPlugin](FarmingPlugin.md) during setup.

## Key Methods

| Return Type | Signature |
|---|---|
| `void` / `Query` | `onEntityAdded(...)` |
| `void` / `Query` | `onEntityRemove(...)` |
| `void` / `Query` | `getQuery(...)` |
