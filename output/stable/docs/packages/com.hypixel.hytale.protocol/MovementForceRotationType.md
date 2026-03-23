---
title: "MovementForceRotationType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.MovementForceRotationType"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "enum"
  - "movement"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public enum MovementForceRotationType
```

Enum with 3 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `AttachedToHead` | 0 | Rotation attached to the entity's head direction. |
| `CameraRotation` | 1 | Rotation follows the camera. |
| `Custom` | 2 | Custom rotation defined by other fields. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `MovementForceRotationType` constant.

```java
public static MovementForceRotationType fromValue(int value)
```

Returns the `MovementForceRotationType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
