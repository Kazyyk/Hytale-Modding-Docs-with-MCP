---
title: "EntityStatOp"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.EntityStatOp"
api_surface: true
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
public enum EntityStatOp
```

Identifies the operation to perform on an entity stat value.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Init` | 0 | Initialize the stat with a base value. |
| `Remove` | 1 | Remove the stat entirely. |
| `PutModifier` | 2 | Add or update a named modifier. |
| `RemoveModifier` | 3 | Remove a named modifier. |
| `Add` | 4 | Add to the current value. |
| `Set` | 5 | Set the value directly. |
| `Minimize` | 6 | Set to the minimum of current and given value. |
| `Maximize` | 7 | Set to the maximum of current and given value. |
| `Reset` | 8 | Reset to the stat's defined reset value. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `EntityStatOp` constant.

```java
public static EntityStatOp fromValue(int value)
```

Returns the `EntityStatOp` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`8`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [EntityStatUpdate](EntityStatUpdate.md)
