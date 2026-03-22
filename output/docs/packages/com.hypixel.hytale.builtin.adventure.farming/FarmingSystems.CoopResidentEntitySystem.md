---
title: "FarmingSystems.CoopResidentEntitySystem"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.FarmingSystems.CoopResidentEntitySystem"
api_surface: false
extends: "RefSystem<EntityStore>"
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
public static class FarmingSystems.CoopResidentEntitySystem extends RefSystem<EntityStore>
```

Handles coop resident entity lifecycle on `EntityStore`. On entity removal (unless unloading), locates the associated [CoopBlock](CoopBlock.md) in the chunk store and calls `handleResidentDespawn` to remove the resident record.

Declared as a static inner class of [FarmingSystems](FarmingSystems.md). Registered by [FarmingPlugin](FarmingPlugin.md) during setup.

## Key Methods

| Return Type | Signature |
|---|---|
| `void` / `Query` | `onEntityAdded(...)` |
| `void` / `Query` | `onEntityRemove(...)` |
| `void` / `Query` | `getQuery(...)` |
