---
title: "Weather"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Weather"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "world"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class Weather
```

Protocol data structure in the World/Environment group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes | |
| `int``[]` | `tagIndexes` | Yes | |
| `String` | `stars` | Yes | |
| `Map<``Integer``, ``String``>` | `moons` | Yes | |
| [Cloud](Cloud.md)`[]` | `clouds` | Yes | |
| `Map<``Float``, ``Float``>` | `sunlightDampingMultiplier` | Yes | |
| `Map<``Float``, `[Color](Color.md)`>` | `sunlightColors` | Yes | |
| `Map<``Float``, `[ColorAlpha](ColorAlpha.md)`>` | `skyTopColors` | Yes | |
| `Map<``Float``, `[ColorAlpha](ColorAlpha.md)`>` | `skyBottomColors` | Yes | |
| `Map<``Float``, `[ColorAlpha](ColorAlpha.md)`>` | `skySunsetColors` | Yes | |
| `Map<``Float``, `[Color](Color.md)`>` | `sunColors` | Yes | |
| `Map<``Float``, ``Float``>` | `sunScales` | Yes | |
| `Map<``Float``, `[ColorAlpha](ColorAlpha.md)`>` | `sunGlowColors` | Yes | |
| `Map<``Float``, `[ColorAlpha](ColorAlpha.md)`>` | `moonColors` | Yes | |
| `Map<``Float``, ``Float``>` | `moonScales` | Yes | |
| `Map<``Float``, `[ColorAlpha](ColorAlpha.md)`>` | `moonGlowColors` | Yes | |
| `Map<``Float``, `[Color](Color.md)`>` | `fogColors` | Yes | |
| `Map<``Float``, ``Float``>` | `fogHeightFalloffs` | Yes | |
| `Map<``Float``, ``Float``>` | `fogDensities` | Yes | |
| `String` | `screenEffect` | Yes | |
| `Map<``Float``, `[ColorAlpha](ColorAlpha.md)`>` | `screenEffectColors` | Yes | |
| `Map<``Float``, `[Color](Color.md)`>` | `colorFilters` | Yes | |
| `Map<``Float``, `[Color](Color.md)`>` | `waterTints` | Yes | |
| [WeatherParticle](WeatherParticle.md) | `particle` | Yes | |
| [NearFar](NearFar.md) | `fog` | Yes | |
| [FogOptions](FogOptions.md) | `fogOptions` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 4 |
| `FIXED_BLOCK_SIZE` | 30 |
| `VARIABLE_FIELD_COUNT` | 24 |
| `VARIABLE_BLOCK_START` | 126 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 4 null-bit bytes + 30 bytes of fixed fields + 24 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static Weather deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `Weather` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `Weather` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `Weather` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Cloud](Cloud.md)
- [Color](Color.md)
- [ColorAlpha](ColorAlpha.md)
- [FogOptions](FogOptions.md)
- [NearFar](NearFar.md)
- [WeatherParticle](WeatherParticle.md)
