---
title: "ItemSoundEvent"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ItemSoundEvent"
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
public enum ItemSoundEvent
```

Identifies sound events for inventory item manipulation.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Drag` | 0 |  |
| `Drop` | 1 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `ItemSoundEvent` constant.

```java
public static ItemSoundEvent fromValue(int value)
```

Returns the `ItemSoundEvent` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [ItemSoundSet](ItemSoundSet.md)
