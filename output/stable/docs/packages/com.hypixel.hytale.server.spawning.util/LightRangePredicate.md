---
title: "LightRangePredicate"
kind: "class"
package: "com.hypixel.hytale.server.spawning.util"
fqcn: "com.hypixel.hytale.server.spawning.util.LightRangePredicate"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "spawning"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.spawning.util`

```java
public class LightRangePredicate
```

Predicate that tests whether a world position's light levels fall within configured ranges. Supports six independent light channels: combined light, sky light, sunlight, and RGB block light. Used by the spawning system to enforce light-based spawn conditions.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `int` | `lightToPrecentage(byte light)` |
| `public` | `void` | `setLightRange(@Nonnull LightType type, double[] lightRange)` |
| `public` | `void` | `setLightRange(@Nullable double[] lightRange)` |
| `public` | `void` | `setSkyLightRange(@Nullable double[] lightRange)` |
| `public` | `void` | `setSunlightRange(@Nullable double[] lightRange)` |
| `public` | `void` | `setRedLightRange(@Nullable double[] lightRange)` |
| `public` | `void` | `setGreenLightRange(@Nullable double[] lightRange)` |
| `public` | `void` | `setBlueLightRange(@Nullable double[] lightRange)` |
| `public` | `boolean` | `test(@Nonnull World world, @Nonnull Vector3d position, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `boolean` | `test(@Nullable BlockChunk blockChunk, int x, int y, int z, double sunlightFactor)` |
| `public static` | `byte` | `calculateLightValue(@Nonnull BlockChunk blockChunk, int x, int y, int z, double sunlightFactor)` |
