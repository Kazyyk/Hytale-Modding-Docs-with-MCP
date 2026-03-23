# DamageSystems.DamageArmor

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.DamageArmor extends DamageEventSystem

Reduces the durability of a random non-broken armor piece on the damaged entity when the damage cause has `durabilityLoss` enabled. Part of the inspect damage group. Collects all non-broken armor slots, selects one at random, and decreases its durability by 3.

## Related Types

- DamageSystems -- parent class
- DamageCause -- checked for `isDurabilityLoss()`
- DamageEventSystem -- base class
