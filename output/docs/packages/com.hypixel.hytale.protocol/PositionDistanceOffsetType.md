---
title: "PositionDistanceOffsetType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.PositionDistanceOffsetType"
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
public enum PositionDistanceOffsetType
```

Enum with 3 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `DistanceOffset` | 0 | Offset by a fixed distance. |
| `DistanceOffsetRaycast` | 1 | Offset by distance with raycast adjustment. |
| `None` | 2 | No distance offset. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `PositionDistanceOffsetType` constant.

```java
public static PositionDistanceOffsetType fromValue(int value)
```

Returns the `PositionDistanceOffsetType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
