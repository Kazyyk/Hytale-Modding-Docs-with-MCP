# DamageSystems.DamageAttackerTool

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.DamageAttackerTool extends DamageEventSystem

Reduces the durability of the attacker's held weapon when the damage cause has `durabilityLoss` enabled and the source is an `EntitySource`. Part of the inspect damage group. Decreases the active hotbar item's durability by 1 on the source living entity.

## Related Types

- DamageSystems -- parent class
- DamageCause -- checked for `isDurabilityLoss()`
- Damage.EntitySource -- required source type
- DamageEventSystem -- base class
