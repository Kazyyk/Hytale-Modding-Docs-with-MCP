---
title: "RotationType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.RotationType"
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
public enum RotationType
```

Enum with 2 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `AttachedToPlusOffset` | 0 | Rotation attached to an entity/node with an offset. |
| `Custom` | 1 | Custom rotation defined by other fields. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `RotationType` constant.

```java
public static RotationType fromValue(int value)
```

Returns the `RotationType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.
