# DamageSystems.WieldingKnockbackReduction

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

@Deprecated
public static class DamageSystems.WieldingKnockbackReduction extends DamageEventSystem

Reduces knockback when the target entity is actively wielding an item. Part of the filter damage group. Similar to DamageSystems.WieldingDamageReduction but applies knockback modifiers instead of damage modifiers. Checks both standard and angled wielding knockback modifier maps, and applies the modifiers to the `KNOCKBACK_COMPONENT` meta.

## Related Types

- DamageSystems -- parent class
- DamageSystems.WieldingDamageReduction -- companion system for damage
- DamageEventSystem -- base class
