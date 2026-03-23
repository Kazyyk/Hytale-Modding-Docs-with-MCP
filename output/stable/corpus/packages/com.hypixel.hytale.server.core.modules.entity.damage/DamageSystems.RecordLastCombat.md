# DamageSystems.RecordLastCombat

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.RecordLastCombat extends DamageEventSystem

Records the timestamp of the last combat action on both the damaged entity and the attacker (if applicable). Part of the inspect damage group. Sets `DamageDataComponent.lastCombatAction` on the target, and also on the source entity if the source is an `EntitySource` with a valid reference that has a `DamageDataComponent`.

## Related Types

- DamageSystems -- parent class
- Damage.EntitySource -- checked for bidirectional combat tracking
- DamageEventSystem -- base class
