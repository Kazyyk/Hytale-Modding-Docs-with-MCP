# SleepClock

Type: class | Package: com.hypixel.hytale.protocol.packets.world

public class SleepClock

Sub-structure representing sleep clock state, including start/target game times, progress, and duration.

## Fields

- @Nullable public InstantData startGametime
- @Nullable public InstantData targetGametime
- public float progress
- public float durationSeconds

## Methods

- @Nonnull public static SleepClock deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- public void serialize(@Nonnull ByteBuf buf)
- public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
