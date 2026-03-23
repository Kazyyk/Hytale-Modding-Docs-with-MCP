---
title: "EffectOp"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.EffectOp"
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
public enum EffectOp
```

Identifies whether an entity effect is being added or removed.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Add` | 0 |  |
| `Remove` | 1 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `EffectOp` constant.

```java
public static EffectOp fromValue(int value)
```

Returns the `EffectOp` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [EntityEffectUpdate](EntityEffectUpdate.md)
