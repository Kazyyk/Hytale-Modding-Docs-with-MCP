# DamageSystems.PlayerDamageFilterSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.PlayerDamageFilterSystem extends DamageEventSystem

Cancels damage to players who have spawn protection active, and cancels player-vs-player damage when PvP is disabled in the world config. Part of the filter damage group. Checks `Player.hasSpawnProtection()` first; if the player is not protected, checks if PvP is disabled and the source is another player, cancelling the damage if so.

## Related Types

- DamageSystems -- parent class
- Damage.EntitySource -- checked for PvP source detection
- DamageEventSystem -- base class
