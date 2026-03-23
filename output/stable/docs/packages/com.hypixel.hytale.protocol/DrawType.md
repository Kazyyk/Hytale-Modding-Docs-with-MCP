---
title: "DrawType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.DrawType"
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
public enum DrawType
```

Determines how a block or entity is visually rendered.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Empty` | 0 | Not rendered (invisible/air block). |
| `GizmoCube` | 1 | Editor-only gizmo cube for debugging. |
| `Cube` | 2 | Standard cube block with per-face textures. |
| `Model` | 3 | Custom 3D model (non-cube shapes). |
| `CubeWithModel` | 4 | Cube collision with additional model overlay. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `DrawType` constant.

```java
public static DrawType fromValue(int value)
```

Returns the `DrawType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`4`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [BlockType](BlockType.md)
