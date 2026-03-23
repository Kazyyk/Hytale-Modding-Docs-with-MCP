---
title: "FarmingSystems.OnFarmBlockAdded"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.FarmingSystems.OnFarmBlockAdded"
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
public static class FarmingSystems.OnFarmBlockAdded extends RefSystem<ChunkStore>
```

Initializes newly added [FarmingBlock](FarmingBlock.md) components. Sets the starting stage set, determines the initial growth progress by matching the current block type against stage data, applies the first stage if no match is found, and triggers the initial farming tick.

Declared as a static inner class of [FarmingSystems](FarmingSystems.md). Registered by [FarmingPlugin](FarmingPlugin.md) during setup.

## Key Methods

| Return Type | Signature |
|---|---|
| `void` / `Query` | `onEntityAdded(...)` |
| `void` / `Query` | `onEntityRemove(...)` |
| `void` / `Query` | `getQuery(...)` |
