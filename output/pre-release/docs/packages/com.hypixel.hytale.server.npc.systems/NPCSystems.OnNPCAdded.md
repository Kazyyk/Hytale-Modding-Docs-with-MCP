---
title: "NPCSystems.OnNPCAdded"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.NPCSystems.OnNPCAdded"
api_surface: false
extends: "com.hypixel.hytale.component.system.HolderSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:28:03Z"
tags:
  - "server"
  - "npc"
  - "ecs"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public static class OnNPCAdded extends HolderSystem<EntityStore>
```

Inner class of `NPCSystems`. ECS holder system that fires when an NPC entity is added. Migrates inventory data to components and ensures `Storage`, `Armor`, `Hotbar`, and `Utility` inventory components are present with default capacities.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)` |
| `public` | `void` | `onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)` |
| `public` | `Query<EntityStore>` | `getQuery()` |
