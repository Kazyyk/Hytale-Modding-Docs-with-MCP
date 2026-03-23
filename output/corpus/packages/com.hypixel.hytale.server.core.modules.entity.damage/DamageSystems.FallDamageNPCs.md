# DamageSystems.FallDamageNPCs

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: EntityTickingSystem<EntityStore>

public static class DamageSystems.FallDamageNPCs extends EntityTickingSystem<EntityStore>

Calculates and applies fall damage to non-player living entities. Part of the gather damage group. Only active when fall damage is enabled in the world config. Uses a quadratic curve: `damage% = (0.58 * (yVelocity - minFallSpeed))^2 + 10`. Rolling mitigates damage: full mitigation below `maxFallSpeedRollFullMitigation`, partial mitigation below `maxFallSpeedToEngageRoll`. Resets fall distance after landing.

## Static Fields

- CURVE_MODIFIER | float | Fall damage curve modifier: `0.58`.
- CURVE_MULTIPLIER | float | Fall damage curve power: `2.0`.
- MIN_DAMAGE | double | Minimum damage percentage: `10.0`.

## Related Types

- DamageSystems -- parent class
- DamageSystems.FallDamagePlayers -- equivalent system for players
- DamageCause -- uses `FALL` cause
