---
title: "ChunkBounds"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util.bounds"
fqcn: "com.hypixel.hytale.server.worldgen.util.bounds.ChunkBounds"
api_surface: false
extends: null
implements: ["IChunkBounds"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "util"
  - "bounds"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.util.bounds`

```java
public class ChunkBounds implements IChunkBounds
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `int` | `minX` |
| `protected` | `int` | `minZ` |
| `protected` | `int` | `maxX` |
| `protected` | `int` | `maxZ` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `int` | `getLowBoundX()` |
| `@Override public` | `int` | `getLowBoundZ()` |
| `@Override public` | `int` | `getHighBoundX()` |
| `@Override public` | `int` | `getHighBoundZ()` |
| `public` | `void` | `expandNegative(int x, int z)` |
| `public` | `void` | `expandPositive(int x, int z)` |
| `public` | `void` | `expandNegative(double x, double z)` |
| `public` | `void` | `expandPositive(double x, double z)` |
| `public` | `void` | `include(int minX, int minZ, int maxX, int maxZ)` |
| `public` | `void` | `include(int x, int z)` |
| `public` | `void` | `include(IChunkBounds box)` |
| `@Nonnull @Override public` | `String` | `toString()` |
