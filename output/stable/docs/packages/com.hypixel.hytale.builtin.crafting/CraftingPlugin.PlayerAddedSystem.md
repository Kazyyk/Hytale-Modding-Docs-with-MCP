---
title: "CraftingPlugin.PlayerAddedSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.crafting"
fqcn: "com.hypixel.hytale.builtin.crafting.CraftingPlugin.PlayerAddedSystem"
api_surface: false
extends: "RefSystem"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "builtin"
  - "crafting"
---
**Package:** `com.hypixel.hytale.builtin.crafting`

```java
public static class PlayerAddedSystem extends RefSystem<EntityStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Query<EntityStore>` | `query` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `PlayerAddedSystem( @Nonnull ComponentType<EntityStore, Player> playerComponentType, @Nonnull ComponentType<EntityStore, PlayerRef> playerRefComponentType )` |
| `public` | `Query<EntityStore>` | `getQuery()` |
| `public` | `void` | `onEntityAdded( @Nonnull Ref<EntityStore> ref, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )` |
| `public` | `void` | `onEntityRemove( @Nonnull Ref<EntityStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )` |
