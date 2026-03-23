---
title: "ItemArmorSlot"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ItemArmorSlot"
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
public enum ItemArmorSlot
```

Identifies equipment slots for armor pieces.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Head` | 0 | Helmet slot. |
| `Chest` | 1 | Chestplate slot. |
| `Hands` | 2 | Gauntlets/gloves slot. |
| `Legs` | 3 | Leggings slot. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `ItemArmorSlot` constant.

```java
public static ItemArmorSlot fromValue(int value)
```

Returns the `ItemArmorSlot` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [ItemArmor](ItemArmor.md)
