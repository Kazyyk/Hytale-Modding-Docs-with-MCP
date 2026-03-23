---
title: "MouseInputTargetType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.MouseInputTargetType"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "enum"
  - "input"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public enum MouseInputTargetType
```

Enum with 4 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Any` | 0 | Accept input targeting any object. |
| `Block` | 1 | Accept input targeting blocks only. |
| `Entity` | 2 | Accept input targeting entities only. |
| `None` | 3 | No input target required. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `MouseInputTargetType` constant.

```java
public static MouseInputTargetType fromValue(int value)
```

Returns the `MouseInputTargetType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
