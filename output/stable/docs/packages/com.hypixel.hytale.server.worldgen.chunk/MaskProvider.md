---
title: "MaskProvider"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.chunk"
fqcn: "com.hypixel.hytale.server.worldgen.chunk.MaskProvider"
api_surface: false
extends: "null"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "chunk"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.chunk`

```java
public class MaskProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `FuzzyZoom` | `fuzzyZoom` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `MaskProvider(FuzzyZoom fuzzyZoom)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public double` | `getX(int seed, double x, double y)` |
| `` | `public double` | `getY(int seed, double x, double y)` |
| `` | `public int` | `get(int seed, double x, double y)` |
| `` | `public double` | `distance(double x, double y)` |
| `` | `public boolean` | `inBounds(double x, double y)` |
| `` | `public FuzzyZoom` | `getFuzzyZoom()` |
| `` | `public Zone.UniqueCandidate[]` | `generateUniqueZoneCandidates(Zone.UniqueEntry[] entries, int maxPositions)` |
| `` | `public MaskProvider` | `generateUniqueZones(int seed, Zone.UniqueCandidate[] candidates, FastRandom random, List<Zone.Unique> zones)` |
| `public` | `String` | `toString()` |
