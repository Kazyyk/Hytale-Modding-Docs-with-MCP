---
title: "PlayerSystems.PlayerInitSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSystems.PlayerInitSystem"
api_surface: false
extends: "HolderSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:17:02Z"
tags:
  - "player"
  - "entity"
  - "system"
  - "initialization"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public static class PlayerSystems.PlayerInitSystem extends HolderSystem<EntityStore>
```

ECS holder system that initializes newly added player entities. Ensures required components are present on the player holder, including `PlayerInput`, `EffectControllerComponent`, `UniqueItemUsagesComponent`, and all inventory component types (`Storage`, `Armor`, `Hotbar`, `Utility`, `Tool`, `Backpack`). Also performs inventory migration from the legacy format to component-based storage.

On entity removal, removes the `PlayerInput` component from the holder.

## Methods

| Method | Signature |
|---|---|
| `getQuery` | `Query<EntityStore> getQuery()` |
| `onEntityAdd` | `void onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)` |
| `onEntityRemoved` | `void onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)` |

## Query

Matches entities with `PlayerRef` component type.

## See Also

- [PlayerSystems](PlayerSystems.md)