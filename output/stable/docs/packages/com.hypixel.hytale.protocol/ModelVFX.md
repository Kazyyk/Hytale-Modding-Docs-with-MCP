---
title: "ModelVFX"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ModelVFX"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "model"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class ModelVFX
```

Protocol data structure in the Model/Rendering group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes | |
| [SwitchTo](SwitchTo.md) | `switchTo` | No | Default: `SwitchTo.Disappear`. |
| [EffectDirection](EffectDirection.md) | `effectDirection` | No | Default: `EffectDirection.None`. |
| `float` | `animationDuration` | No | |
| [Vector2f](Vector2f.md) | `animationRange` | Yes | |
| [LoopOption](LoopOption.md) | `loopOption` | No | Default: `LoopOption.PlayOnce`. |
| [CurveType](CurveType.md) | `curveType` | No | Default: `CurveType.Linear`. |
| [Color](Color.md) | `highlightColor` | Yes | |
| `float` | `highlightThickness` | No | |
| `boolean` | `useBloomOnHighlight` | No | |
| `boolean` | `useProgessiveHighlight` | No | |
| [Vector2f](Vector2f.md) | `noiseScale` | Yes | |
| [Vector2f](Vector2f.md) | `noiseScrollSpeed` | Yes | |
| [Color](Color.md) | `postColor` | Yes | |
| `float` | `postColorOpacity` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 49 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 49 |
| `MAX_SIZE` | 16,384,054 |

Binary layout: 1 null-bit byte + 49 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ModelVFX deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ModelVFX` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ModelVFX` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ModelVFX` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Color](Color.md)
- [CurveType](CurveType.md)
- [EffectDirection](EffectDirection.md)
- [LoopOption](LoopOption.md)
- [SwitchTo](SwitchTo.md)
- [Vector2f](Vector2f.md)
