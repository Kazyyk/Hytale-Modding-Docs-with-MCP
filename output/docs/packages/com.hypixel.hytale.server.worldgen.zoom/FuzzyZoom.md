---
title: "FuzzyZoom"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.zoom"
fqcn: "com.hypixel.hytale.server.worldgen.zoom.FuzzyZoom"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "worldgen"
  - "zoom"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.zoom`

```java
public class FuzzyZoom
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ICoordinateRandomizer` | `randomizer` |
| `private final` | `ExactZoom` | `exactZoom` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `getX(int seed, double x, double y)` |
| `public` | `double` | `getY(int seed, double x, double y)` |
| `public` | `int` | `generate(double x, double y)` |
| `public` | `double` | `distance(double x, double y)` |
| `@Nonnull public` | `ExactZoom` | `getExactZoom()` |
| `public` | `boolean` | `inBounds(double x, double y)` |
| `public` | `Zone.UniqueCandidate[]` | `generateUniqueZoneCandidates(Zone.UniqueEntry[] entries, int maxPositions)` |
| `public` | `FuzzyZoom` | `generateUniqueZones(Zone.UniqueCandidate[] candidates, FastRandom random, List<Zone.Unique> zones)` |
| `@Override @Nonnull public` | `String` | `toString()` |
