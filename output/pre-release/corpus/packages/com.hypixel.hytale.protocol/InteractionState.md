# InteractionState

Type: enum | Package: com.hypixel.hytale.protocol

public enum InteractionState

Tracks the execution state of an interaction.

## Constants

- Finished | 0
- Skip | 1
- ItemChanged | 2
- Failed | 3
- NotFinished | 4

## Methods


public int getValue()

Returns the integer wire value for this `InteractionState` constant.


public static InteractionState fromValue(int value)

Returns the `InteractionState` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`4`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- InteractionSyncData
