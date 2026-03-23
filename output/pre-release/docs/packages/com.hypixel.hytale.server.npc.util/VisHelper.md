---
title: "VisHelper"
kind: "class"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.VisHelper"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:30:09Z"
tags:
  - "server"
  - "npc"
  - "util"
  - "debug"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.util`

```java
public class VisHelper
```

Utility class providing static methods for rendering debug vectors and spheres in the world via `DebugUtils`. Used by NPC systems for visualizing steering, avoidance, and separation directions.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `Vector3f` | `DEBUG_COLOR_STEERING_POST` | `DebugUtils.COLOR_GREEN` |
| `public static final` | `Vector3f` | `DEBUG_COLOR_STEERING_PRE` | `DebugUtils.COLOR_RED` |
| `public static final` | `Vector3f` | `DEBUG_COLOR_AVOIDANCE` | `DebugUtils.COLOR_WHITE` |
| `public static final` | `Vector3f` | `DEBUG_COLOR_SEPARATION` | `DebugUtils.COLOR_BLUE` |
| `public static final` | `double` | `DEBUG_MIN_VECTOR_DRAW_LENGTH_SQUARED` | `0.01` |
| `public static final` | `double` | `DEBUG_VECTORS_SCALE` | `4.0` |
| `public static final` | `float` | `DEBUG_VECTORS_TIME` | `0.05F` |
| `public static final` | `float` | `DEBUG_TRANSPARENT` | `0.24000001F` |
| `public static final` | `double` | `DEBUG_SPHERE_SCALE` | `1.0` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `renderDebugVector(@Nonnull Vector3d position, @Nonnull Vector3d direction, @Nonnull Vector3f color, @Nonnull World world)` |
| `public static` | `void` | `renderDebugVector(@Nonnull Vector3d position, @Nonnull Vector3d direction, @Nonnull Vector3f color, float opacity, @Nonnull World world)` |
| `public static` | `void` | `renderDebugVectorTo(@Nonnull Vector3d position, @Nonnull Vector3d direction, @Nonnull Vector3f color, @Nonnull World world)` |
| `public static` | `void` | `renderDebugVectorTo(@Nonnull Vector3d position, @Nonnull Vector3d direction, @Nonnull Vector3f color, float opacity, @Nonnull World world)` |
| `public static` | `void` | `renderDebugSphere(@Nonnull Vector3d position, @Nonnull Vector3f color, @Nonnull World world)` |
| `public static` | `void` | `renderDebugSphere(@Nonnull Vector3d position, @Nonnull Vector3f color, float opacity, @Nonnull World world)` |
| `public static` | `void` | `renderDebugSphere(@Nonnull Vector3d position, double radius, @Nonnull Vector3f color, @Nonnull World world)` |
| `public static` | `void` | `renderDebugSphere(@Nonnull Vector3d position, double radius, @Nonnull Vector3f color, float opacity, @Nonnull World world)` |
