# DamageSystems.FallDamagePlayers

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: EntityTickingSystem<EntityStore>

public static class DamageSystems.FallDamagePlayers extends EntityTickingSystem<EntityStore>

Calculates and applies fall damage to player entities. Part of the gather damage group. Only active when fall damage is enabled in the world config. Processes the player's movement update queue to detect landing events, using the same quadratic curve as DamageSystems.FallDamageNPCs. Rolling mitigates damage partially or fully depending on velocity thresholds. Runs before `PlayerSystems.ProcessPlayerInput`.

## Static Fields

- CURVE_MODIFIER | float | Fall damage curve modifier: `0.58`.
- CURVE_MULTIPLIER | float | Fall damage curve power: `2.0`.
- MIN_DAMAGE | double | Minimum damage percentage: `10.0`.

## Related Types

- DamageSystems -- parent class
- DamageSystems.FallDamageNPCs -- equivalent system for NPCs
- DamageCause -- uses `FALL` cause
