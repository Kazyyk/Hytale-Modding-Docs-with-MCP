# MountSystems.OnMinecartHit

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: DamageEventSystem

public static class OnMinecartHit extends DamageEventSystem

Handles damage to minecart entities. After 3 hits, the minecart is destroyed. If 10 seconds pass since the last hit without further damage, the hit counter resets.

## Constants

- HIT_RESET_TIME | Duration.ofSeconds(10) | Time after which the hit counter resets.
- NUMBER_OF_HITS | 3 | Hits required to destroy the minecart.

## Query

Matches entities with both MinecartComponent and `TransformComponent`.

## Dependencies

Ordered `AFTER` `DamageModule.getGatherDamageGroup()` and `DamageModule.getFilterDamageGroup()`, and `BEFORE` `DamageModule.getInspectDamageGroup()`.

## Behavior

On each damage event:
1. If the last hit was more than 10 seconds ago, resets the hit counter and timestamp.
2. If damage amount is positive, increments the hit counter and records the timestamp.
3. On the 3rd hit, removes the minecart entity.
4. If the damage source is a player in non-Creative mode and the minecart has a source item, drops an item entity at the minecart's position.

## Related Types

- MountSystems -- enclosing class
- MinecartComponent -- the component tracking hit state
- MountSystems.EnsureMinecartComponents -- ensures supporting components
