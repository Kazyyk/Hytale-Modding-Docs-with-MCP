# EventHandler.PriorityEntry

Type: record | Package: com.hypixel.hytale.builtin.worldgen.modifier

public record PriorityEntry(WorldGenModifier modifier, int packPriority) implements Comparable<EventHandler.PriorityEntry>

Record pairing a WorldGenModifier with its asset pack priority for sorting.

## Record Components


WorldGenModifier modifier, int packPriority
