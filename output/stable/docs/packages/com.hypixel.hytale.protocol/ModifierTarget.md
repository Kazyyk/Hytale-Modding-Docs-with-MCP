---
title: "ModifierTarget"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ModifierTarget"
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
public enum ModifierTarget
```

Enum with 2 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Min` | 0 | Apply modifier to the minimum value. |
| `Max` | 1 | Apply modifier to the maximum value. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `ModifierTarget` constant.

```java
public static ModifierTarget fromValue(int value)
```

Returns the `ModifierTarget` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.
