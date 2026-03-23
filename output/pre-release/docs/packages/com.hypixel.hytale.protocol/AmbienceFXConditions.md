---
title: "AmbienceFXConditions"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.AmbienceFXConditions"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "ambience"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class AmbienceFXConditions
```

Defines the environmental conditions that must be met for an ambience effect to activate. Supports filtering by environment, weather, fluid, altitude, light levels, time of day, and surrounding block types.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `boolean` | `never` | No |  |
| `int``[]` | `environmentIndices` | Yes |  |
| `int``[]` | `weatherIndices` | Yes |  |
| `int``[]` | `fluidFXIndices` | Yes |  |
| `int` | `environmentTagPatternIndex` | No |  |
| `int` | `weatherTagPatternIndex` | No |  |
| [AmbienceFXBlockSoundSet](AmbienceFXBlockSoundSet.md)`[]` | `surroundingBlockSoundSets` | Yes |  |
| [Range](Range.md) | `altitude` | Yes |  |
| [Rangeb](Rangeb.md) | `walls` | Yes |  |
| `boolean` | `roof` | No |  |
| `int` | `roofMaterialTagPatternIndex` | No |  |
| `boolean` | `floor` | No |  |
| [Rangeb](Rangeb.md) | `sunLightLevel` | Yes |  |
| [Rangeb](Rangeb.md) | `torchLightLevel` | Yes |  |
| [Rangeb](Rangeb.md) | `globalLightLevel` | Yes |  |
| [Rangef](Rangef.md) | `dayTime` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 2 |
| `FIXED_BLOCK_SIZE` | 41 |
| `VARIABLE_FIELD_COUNT` | 4 |
| `VARIABLE_BLOCK_START` | 57 |
| `MAX_SIZE` | 102,400,077 |

Binary layout: 2 null-bit bytes + 41 bytes of fixed fields + 4 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AmbienceFXConditions deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AmbienceFXConditions` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AmbienceFXConditions` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AmbienceFXConditions` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AmbienceFX](AmbienceFX.md)
- [AmbienceFXBlockSoundSet](AmbienceFXBlockSoundSet.md)
