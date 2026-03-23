---
title: "MountSystems.OnMinecartHit"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.MountSystems.OnMinecartHit"
api_surface: false
extends: "DamageEventSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public static class OnMinecartHit extends DamageEventSystem
```

Handles damage to minecart entities. After 3 hits, the minecart is destroyed. If 10 seconds pass since the last hit without further damage, the hit counter resets.

## Constants

| Constant | Value | Description |
|---|---|---|
| `HIT_RESET_TIME` | `Duration.ofSeconds(10)` | Time after which the hit counter resets. |
| `NUMBER_OF_HITS` | `3` | Hits required to destroy the minecart. |

## Query

Matches entities with both [MinecartComponent](MinecartComponent.md) and `TransformComponent`.

## Dependencies

Ordered `AFTER` `DamageModule.getGatherDamageGroup()` and `DamageModule.getFilterDamageGroup()`, and `BEFORE` `DamageModule.getInspectDamageGroup()`.

## Behavior

On each damage event:
1. If the last hit was more than 10 seconds ago, resets the hit counter and timestamp.
2. If damage amount is positive, increments the hit counter and records the timestamp.
3. On the 3rd hit, removes the minecart entity.
4. If the damage source is a player in non-Creative mode and the minecart has a source item, drops an item entity at the minecart's position.

## Related Types

- [MountSystems](MountSystems.md) -- enclosing class
- [MinecartComponent](MinecartComponent.md) -- the component tracking hit state
- [MountSystems.EnsureMinecartComponents](MountSystems.EnsureMinecartComponents.md) -- ensures supporting components
