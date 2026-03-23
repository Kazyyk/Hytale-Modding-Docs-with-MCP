---
title: "SortType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.SortType"
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
public enum SortType
```

Enum with 3 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Name` | 0 | Sort alphabetically by name. |
| `Type` | 1 | Sort by item type. |
| `Rarity` | 2 | Sort by item rarity. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `SortType` constant.

```java
public static SortType fromValue(int value)
```

Returns the `SortType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
