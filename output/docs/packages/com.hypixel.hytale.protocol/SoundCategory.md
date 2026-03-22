---
title: "SoundCategory"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.SoundCategory"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "enum"
  - "audio"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public enum SoundCategory
```

Enum with 4 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Music` | 0 | Background music category. |
| `Ambient` | 1 | Ambient/environmental sound category. |
| `SFX` | 2 | Sound effects category. |
| `UI` | 3 | User interface sound category. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `SoundCategory` constant.

```java
public static SoundCategory fromValue(int value)
```

Returns the `SoundCategory` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
