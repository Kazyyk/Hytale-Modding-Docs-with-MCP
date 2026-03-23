---
title: "FarmingSystems.MigrateFarming"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.FarmingSystems.MigrateFarming"
api_surface: false
extends: "BlockModule.MigrationSystem"
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
public static class FarmingSystems.MigrateFarming extends BlockModule.MigrationSystem
```

Deprecated migration system (marked `@Deprecated(forRemoval = true)`). Converts legacy [FarmingBlockState](FarmingBlockState.md) data to the current [FarmingBlock](FarmingBlock.md) component format by transferring growth progress, stage set, and spread rate.

Declared as a static inner class of [FarmingSystems](FarmingSystems.md). Registered by [FarmingPlugin](FarmingPlugin.md) during setup.

## Key Methods

| Return Type | Signature |
|---|---|
| `void` / `Query` | `onEntityAdd(...)` |
| `void` / `Query` | `onEntityRemoved(...)` |
| `void` / `Query` | `getQuery(...)` |
