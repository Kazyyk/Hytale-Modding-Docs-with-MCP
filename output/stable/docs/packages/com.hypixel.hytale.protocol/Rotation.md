---
title: "Rotation"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Rotation"
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
public enum Rotation
```

Enum with 4 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `None` | 0 | No rotation (0 degrees). |
| `Ninety` | 1 | 90-degree rotation. |
| `OneEighty` | 2 | 180-degree rotation. |
| `TwoSeventy` | 3 | 270-degree rotation. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `Rotation` constant.

```java
public static Rotation fromValue(int value)
```

Returns the `Rotation` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
