---
title: "AmbienceFXAltitude"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.AmbienceFXAltitude"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "enum"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public enum AmbienceFXAltitude
```

Specifies the vertical positioning strategy for 3D ambience sound playback.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Normal` | 0 |  |
| `Lowest` | 1 |  |
| `Highest` | 2 |  |
| `Random` | 3 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `AmbienceFXAltitude` constant.

```java
public static AmbienceFXAltitude fromValue(int value)
```

Returns the `AmbienceFXAltitude` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [AmbienceFXSound](AmbienceFXSound.md)
