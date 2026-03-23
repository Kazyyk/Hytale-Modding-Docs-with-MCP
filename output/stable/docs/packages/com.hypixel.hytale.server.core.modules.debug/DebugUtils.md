---
title: "DebugUtils"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.debug"
fqcn: "com.hypixel.hytale.server.core.modules.debug.DebugUtils"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "debug"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.debug`

```java
public class DebugUtils
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `Vector3f` | `COLOR_BLACK` |
| `public static final` | `Vector3f` | `COLOR_WHITE` |
| `public static final` | `Vector3f` | `COLOR_RED` |
| `public static final` | `Vector3f` | `COLOR_LIME` |
| `public static final` | `Vector3f` | `COLOR_BLUE` |
| `public static final` | `Vector3f` | `COLOR_YELLOW` |
| `public static final` | `Vector3f` | `COLOR_CYAN` |
| `public static final` | `Vector3f` | `COLOR_MAGENTA` |
| `public static final` | `Vector3f` | `COLOR_SILVER` |
| `public static final` | `Vector3f` | `COLOR_GRAY` |
| `public static final` | `Vector3f` | `COLOR_MAROON` |
| `public static final` | `Vector3f` | `COLOR_OLIVE` |
| `public static final` | `Vector3f` | `COLOR_GREEN` |
| `public static final` | `Vector3f` | `COLOR_PURPLE` |
| `public static final` | `Vector3f` | `COLOR_TEAL` |
| `public static final` | `Vector3f` | `COLOR_NAVY` |
| `public static` | `boolean` | `DISPLAY_FORCES` |
| `public static final` | `float` | `DEFAULT_OPACITY` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `add(@Nonnull World world, @Nonnull DebugShape shape, @Nonnull Matrix4d matrix, @Nonnull Vector3f color, float time, boolean fade)` |
| `public static` | `void` | `add(@Nonnull World world, @Nonnull DebugShape shape, @Nonnull Matrix4d matrix, @Nonnull Vector3f color, float opacity, float time, boolean fade)` |
| `private static` | `void` | `add(@Nonnull World world,
        @Nonnull DebugShape shape,
        @Nonnull Matrix4d matrix,
        @Nonnull Vector3f color,
        float opacity,
        float time,
        boolean fade,
        @Nullable float[] shapeParams)` |
| `public static` | `void` | `addFrustum(@Nonnull World world, @Nonnull Matrix4d matrix, @Nonnull Matrix4d frustumProjection, @Nonnull Vector3f color, float time, boolean fade)` |
| `public static` | `void` | `clear(@Nonnull World world)` |
| `public static` | `void` | `addArrow(@Nonnull World world, @Nonnull Matrix4d baseMatrix, @Nonnull Vector3f color, double length, float time, boolean fade)` |
| `public static` | `void` | `addSphere(@Nonnull World world, @Nonnull Vector3d pos, @Nonnull Vector3f color, double scale, float time)` |
| `public static` | `void` | `addSphere(@Nonnull World world, double x, double y, double z, @Nonnull Vector3f color, double scale, float time)` |
| `public static` | `void` | `addCone(@Nonnull World world, @Nonnull Vector3d pos, @Nonnull Vector3f color, double scale, float time)` |
| `public static` | `void` | `addCube(@Nonnull World world, @Nonnull Vector3d pos, @Nonnull Vector3f color, double scale, float time)` |
| `public static` | `void` | `addCube(@Nonnull World world, double x, double y, double z, @Nonnull Vector3f color, double scale, float time)` |
| `public static` | `void` | `addCylinder(@Nonnull World world, @Nonnull Vector3d pos, @Nonnull Vector3f color, double scale, float time)` |
| `public static` | `void` | `addLine(@Nonnull World world, @Nonnull Vector3d start, @Nonnull Vector3d end, @Nonnull Vector3f color, double thickness, float time, boolean fade)` |
| `public static` | `void` | `addLine(@Nonnull World world,
        double startX,
        double startY,
        double startZ,
        double endX,
        double endY,
        double endZ,
        @Nonnull Vector3f color,
        double thickness,
        float time,
        boolean fade)` |
| `public static` | `void` | `addDisc(@Nonnull World world,
        @Nonnull Matrix4d matrix,
        double outerRadius,
        double innerRadius,
        @Nonnull Vector3f color,
        float opacity,
        int segmentCount,
        float time,
        boolean fade)` |
| `public static` | `void` | `addDisc(@Nonnull World world,
        @Nonnull Matrix4d matrix,
        double outerRadius,
        double innerRadius,
        @Nonnull Vector3f color,
        float opacity,
        float time,
        boolean fade)` |
| `public static` | `void` | `addDisc(@Nonnull World world, @Nonnull Vector3d center, double radius, @Nonnull Vector3f color, float time, boolean fade)` |
| `public static` | `void` | `addDisc(@Nonnull World world, double x, double y, double z, double radius, @Nonnull Vector3f color, float time, boolean fade)` |
| `public static` | `void` | `addDisc(@Nonnull World world, double x, double y, double z, double radius, @Nonnull Vector3f color, float opacity, float time, boolean fade)` |
| `public static` | `void` | `addDisc(@Nonnull World world,
        double x,
        double y,
        double z,
        double outerRadius,
        double innerRadius,
        @Nonnull Vector3f color,
        float opacity,
        float time,
        boolean fade)` |
| `public static` | `void` | `addDisc(@Nonnull World world,
        double x,
        double y,
        double z,
        double outerRadius,
        double innerRadius,
        @Nonnull Vector3f color,
        float opacity,
        int segmentCount,
        float time,
        boolean fade)` |
| `public static` | `void` | `addSector(@Nonnull World world, double x, double y, double z, double heading, double radius, double angle, @Nonnull Vector3f color, float time, boolean fade)` |
| `public static` | `void` | `addSector(@Nonnull World world,
        double x,
        double y,
        double z,
        double heading,
        double radius,
        double angle,
        @Nonnull Vector3f color,
        float opacity,
        float time,
        boolean fade)` |
| `public static` | `void` | `addSector(@Nonnull World world,
        double x,
        double y,
        double z,
        double heading,
        double outerRadius,
        double angle,
        double innerRadius,
        @Nonnull Vector3f color,
        float opacity,
        float time,
        boolean fade)` |
| `public static` | `void` | `addSector(@Nonnull World world,
        double x,
        double y,
        double z,
        double heading,
        double outerRadius,
        double angle,
        double innerRadius,
        @Nonnull Vector3f color,
        float opacity,
        int segmentCount,
        float time,
        boolean fade)` |
| `public static` | `void` | `addArrow(@Nonnull World world, @Nonnull Vector3d position, @Nonnull Vector3d direction, @Nonnull Vector3f color, float time, boolean fade)` |
| `public static` | `void` | `addForce(@Nonnull World world, @Nonnull Vector3d position, @Nonnull Vector3d force, @Nullable VelocityConfig velocityConfig)` |
| `@Nonnull private static` | `Matrix4d` | `makeMatrix(@Nonnull Vector3d pos, double scale)` |
