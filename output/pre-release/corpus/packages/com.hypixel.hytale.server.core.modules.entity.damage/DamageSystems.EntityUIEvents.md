# DamageSystems.EntityUIEvents

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.EntityUIEvents extends DamageEventSystem

Sends combat text UI updates to the attacking player when damage is dealt. Part of the inspect damage group. If the damage amount is positive and the source is an `EntitySource` with a valid player reference, queues a `CombatTextUpdate` on the source player's entity viewer, displaying the damage amount and optional hit angle.

## Related Types

- DamageSystems -- parent class
- Damage -- reads `HIT_ANGLE` meta key
- DamageEventSystem -- base class
