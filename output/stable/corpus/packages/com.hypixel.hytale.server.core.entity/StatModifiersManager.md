# StatModifiersManager

Type: class | Package: com.hypixel.hytale.server.core.entity

public class StatModifiersManager

Manages equipment-based stat modifiers for a `LivingEntity`. Tracks which stats need recalculation via an `AtomicBoolean` flag and maintains a set of stats to clear. Processes armor inventory changes to apply/remove `StaticModifier` instances from the entity's `EntityStatMap`, and handles entity effect modifiers from equipped items.
