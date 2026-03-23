# EntityMatcherType

Type: enum | Package: com.hypixel.hytale.protocol

public enum EntityMatcherType

Identifies the category of entity matching: server-side, vulnerability-based, or player-specific.

## Constants

- Server | 0
- VulnerableMatcher | 1
- Player | 2

## Methods


public int getValue()

Returns the integer wire value for this `EntityMatcherType` constant.


public static EntityMatcherType fromValue(int value)

Returns the `EntityMatcherType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- EntityMatcher
