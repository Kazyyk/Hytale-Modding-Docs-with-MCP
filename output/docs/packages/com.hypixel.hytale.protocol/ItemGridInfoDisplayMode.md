---
title: "ItemGridInfoDisplayMode"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ItemGridInfoDisplayMode"
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
public enum ItemGridInfoDisplayMode
```

Determines how item information is displayed in inventory grids.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Tooltip` | 0 |  |
| `Adjacent` | 1 |  |
| `None` | 2 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `ItemGridInfoDisplayMode` constant.

```java
public static ItemGridInfoDisplayMode fromValue(int value)
```

Returns the `ItemGridInfoDisplayMode` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [ItemCategory](ItemCategory.md)
