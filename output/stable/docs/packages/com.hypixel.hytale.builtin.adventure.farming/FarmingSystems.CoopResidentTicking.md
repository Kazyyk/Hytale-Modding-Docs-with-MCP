---
title: "FarmingSystems.CoopResidentTicking"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.FarmingSystems.CoopResidentTicking"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
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
public static class FarmingSystems.CoopResidentTicking extends EntityTickingSystem<EntityStore>
```

Ticks coop resident entities. If a resident is marked for despawn, removes it from the entity store.

Declared as a static inner class of [FarmingSystems](FarmingSystems.md). Registered by [FarmingPlugin](FarmingPlugin.md) during setup.

## Key Methods

| Return Type | Signature |
|---|---|
| `void` / `Query` | `tick(...)` |
| `void` / `Query` | `getQuery(...)` |
