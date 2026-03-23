---
title: "BlockPreviewVisibility"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BlockPreviewVisibility"
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
public enum BlockPreviewVisibility
```

Controls whether the block placement preview ghost is shown.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `AlwaysVisible` | 0 |  |
| `AlwaysHidden` | 1 |  |
| `Default` | 2 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `BlockPreviewVisibility` constant.

```java
public static BlockPreviewVisibility fromValue(int value)
```

Returns the `BlockPreviewVisibility` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [BlockPlacementSettings](BlockPlacementSettings.md)
