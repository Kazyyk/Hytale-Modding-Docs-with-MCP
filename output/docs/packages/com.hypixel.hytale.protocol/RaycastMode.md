---
title: "RaycastMode"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.RaycastMode"
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
public enum RaycastMode
```

Enum with 2 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `FollowMotion` | 0 | Raycast follows the entity's motion direction. |
| `FollowLook` | 1 | Raycast follows the entity's look direction. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `RaycastMode` constant.

```java
public static RaycastMode fromValue(int value)
```

Returns the `RaycastMode` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.
