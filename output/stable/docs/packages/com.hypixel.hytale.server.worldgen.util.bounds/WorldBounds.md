---
title: "WorldBounds"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util.bounds"
fqcn: "com.hypixel.hytale.server.worldgen.util.bounds.WorldBounds"
api_surface: false
extends: "ChunkBounds"
implements: ["IWorldBounds"]
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
public class WorldBounds extends ChunkBounds implements IWorldBounds
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `int` | `minY` |
| `protected` | `int` | `maxY` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `int` | `getLowBoundY()` |
| `@Override public` | `int` | `getHighBoundY()` |
| `public` | `void` | `expandNegative(double x, double y, double z)` |
| `public` | `void` | `expandPositive(double x, double y, double z)` |
| `@Override public` | `void` | `include(IChunkBounds bounds)` |
