# DamageSystems.FilterUnkillable

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.FilterUnkillable extends DamageEventSystem

Cancels damage to entities that cannot be killed. Part of the filter damage group. Cancels damage if any of the following conditions are true: the entity has an invulnerable entity effect, the entity is already dead (has `DeathComponent`), the entity has the `Invulnerable` component, the entity has the `Intangible` component, or the `CAUSE_DESYNC` debug flag is active.

## Static Fields

- CAUSE_DESYNC | boolean | Debug flag toggled by the DesyncDamageCommand. When `true`, all damage is cancelled.

## Related Types

- DamageSystems -- parent class
- DeathComponent -- checked to determine if entity is already dead
- DesyncDamageCommand -- toggles the `CAUSE_DESYNC` flag
- DamageEventSystem -- base class
