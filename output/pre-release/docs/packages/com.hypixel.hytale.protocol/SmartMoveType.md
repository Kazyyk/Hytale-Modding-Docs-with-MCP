---
title: "SmartMoveType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.SmartMoveType"
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
public enum SmartMoveType
```

Enum with 3 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `EquipOrMergeStack` | 0 | Equip the item or merge into an existing stack. |
| `PutInHotbarOrWindow` | 1 | Place in the hotbar or open window. |
| `PutInHotbarOrBackpack` | 2 | Place in the hotbar or backpack. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `SmartMoveType` constant.

```java
public static SmartMoveType fromValue(int value)
```

Returns the `SmartMoveType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
