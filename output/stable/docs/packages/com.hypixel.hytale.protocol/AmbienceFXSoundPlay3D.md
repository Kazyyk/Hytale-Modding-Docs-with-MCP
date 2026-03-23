---
title: "AmbienceFXSoundPlay3D"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.AmbienceFXSoundPlay3D"
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
public enum AmbienceFXSoundPlay3D
```

Specifies how 3D positional audio is determined for ambience sounds.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Random` | 0 |  |
| `LocationName` | 1 |  |
| `No` | 2 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `AmbienceFXSoundPlay3D` constant.

```java
public static AmbienceFXSoundPlay3D fromValue(int value)
```

Returns the `AmbienceFXSoundPlay3D` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [AmbienceFXSound](AmbienceFXSound.md)
