---
title: "BiomeInterpolation"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.biome"
fqcn: "com.hypixel.hytale.server.worldgen.biome.BiomeInterpolation"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "worldgen"
  - "biome"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.biome`

```java
public class BiomeInterpolation
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `Int2IntMap` | `EMPTY_MAP` |
| `public static final` | `BiomeInterpolation` | `DEFAULT` |
| `protected final` | `int` | `radius` |
| `protected final` | `Int2IntMap` | `biomeRadii2` |

## Constructors

| Modifier | Signature |
|---|---|
| `protected` | `BiomeInterpolation(int radius, Int2IntMap biomeRadii2)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getRadius()` |
| `public` | `int` | `getBiomeRadius2(int biome)` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `@Nonnull public static` | `BiomeInterpolation` | `create(int radius, @Nonnull Int2IntMap biomeRadii2)` |

## Inner Types

- `BiomeInterpolation.EmptyInt2IntMap`
