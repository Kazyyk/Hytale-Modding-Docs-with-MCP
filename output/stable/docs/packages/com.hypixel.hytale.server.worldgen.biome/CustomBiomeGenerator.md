---
title: "CustomBiomeGenerator"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.biome"
fqcn: "com.hypixel.hytale.server.worldgen.biome.CustomBiomeGenerator"
api_surface: false
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
public class CustomBiomeGenerator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `NoiseProperty` | `noiseProperty` |
| `protected final` | `IDoubleThreshold` | `threshold` |
| `protected final` | `IIntCondition` | `biomeMask` |
| `protected final` | `int` | `priority` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `CustomBiomeGenerator(NoiseProperty noiseProperty, IDoubleThreshold threshold, IIntCondition biomeMask, int priority)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `shouldGenerateAt(int seed, double x, double z, @Nonnull ZoneGeneratorResult zoneResult, @Nonnull Biome customBiome)` |
| `public` | `boolean` | `isThreshold(double d)` |
| `public` | `boolean` | `isThreshold(double d, double factor)` |
| `public` | `boolean` | `isValidParentBiome(int index)` |
| `public` | `int` | `getPriority()` |
| `@Nonnull @Override public` | `String` | `toString()` |
