# SleepMultiplayer

Type: class | Package: com.hypixel.hytale.protocol.packets.world

public class SleepMultiplayer

Sub-structure representing multiplayer sleep state, tracking how many players are sleeping vs awake and a sample of awake player UUIDs.

## Fields

- public int sleepersCount
- public int awakeCount
- @Nullable public UUID[] awakeSample

## Methods

- @Nonnull public static SleepMultiplayer deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- public void serialize(@Nonnull ByteBuf buf)
- public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
