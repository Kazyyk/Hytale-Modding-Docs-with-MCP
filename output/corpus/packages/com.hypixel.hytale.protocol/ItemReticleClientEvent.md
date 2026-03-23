# ItemReticleClientEvent

Type: enum | Package: com.hypixel.hytale.protocol

public enum ItemReticleClientEvent

Identifies client-side events that can trigger reticle animations.

## Constants

- OnHit | 0
- Wielding | 1
- OnMovementLeft | 2
- OnMovementRight | 3
- OnMovementBack | 4

## Methods


public int getValue()

Returns the integer wire value for this `ItemReticleClientEvent` constant.


public static ItemReticleClientEvent fromValue(int value)

Returns the `ItemReticleClientEvent` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`4`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- ItemReticleConfig
