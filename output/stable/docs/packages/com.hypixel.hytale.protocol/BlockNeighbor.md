---
title: "BlockNeighbor"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BlockNeighbor"
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
public enum BlockNeighbor
```

Identifies a neighboring block position relative to a center block. Covers all 26 positions in a 3x3x3 cube excluding center.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Up` | 0 |  |
| `Down` | 1 |  |
| `North` | 2 |  |
| `East` | 3 |  |
| `South` | 4 |  |
| `West` | 5 |  |
| `UpNorth` | 6 |  |
| `UpSouth` | 7 |  |
| `UpEast` | 8 |  |
| `UpWest` | 9 |  |
| `DownNorth` | 10 |  |
| `DownSouth` | 11 |  |
| `DownEast` | 12 |  |
| `DownWest` | 13 |  |
| `NorthEast` | 14 |  |
| `SouthEast` | 15 |  |
| `SouthWest` | 16 |  |
| `NorthWest` | 17 |  |
| `UpNorthEast` | 18 |  |
| `UpSouthEast` | 19 |  |
| `UpSouthWest` | 20 |  |
| `UpNorthWest` | 21 |  |
| `DownNorthEast` | 22 |  |
| `DownSouthEast` | 23 |  |
| `DownSouthWest` | 24 |  |
| `DownNorthWest` | 25 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `BlockNeighbor` constant.

```java
public static BlockNeighbor fromValue(int value)
```

Returns the `BlockNeighbor` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`25`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [BlockType](BlockType.md)
