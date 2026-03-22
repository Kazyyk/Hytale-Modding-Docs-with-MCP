---
title: "Steering"
kind: "class"
package: "com.hypixel.hytale.server.npc.movement"
fqcn: "com.hypixel.hytale.server.npc.movement.Steering"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "movement"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.movement`

```java
public class Steering
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `Steering` | `NULL` |
| `private final` | `Vector3d` | `translation` |
| `private` | `double` | `maxDistance` |
| `private` | `Vector3d` | `maxDistanceComponentSelector` |
| `private` | `boolean` | `hasTranslation` |
| `private` | `float` | `yaw` |
| `private` | `boolean` | `hasYaw` |
| `private` | `float` | `pitch` |
| `private` | `boolean` | `hasPitch` |
| `private` | `float` | `roll` |
| `private` | `boolean` | `hasRoll` |
| `private` | `double` | `relativeTurnSpeed` |
| `private` | `boolean` | `hasRelativeTurnSpeed` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Steering` | `clear()` |
| `@Nonnull public` | `Steering` | `assign(@Nonnull Steering other)` |
| `@Override public` | `boolean` | `equals(@Nullable Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `@Nonnull public` | `Steering` | `clearTranslation()` |
| `@Nonnull public` | `Steering` | `clearRotation()` |
| `@Nonnull public` | `Vector3d` | `getTranslation()` |
| `public` | `double` | `getX()` |
| `@Nonnull public` | `Steering` | `setX(double value)` |
| `public` | `double` | `getY()` |
| `@Nonnull public` | `Steering` | `setY(double value)` |
| `public` | `double` | `getZ()` |
| `@Nonnull public` | `Steering` | `setZ(double value)` |
| `@Nonnull public` | `Steering` | `setTranslation(@Nonnull Vector3d translation)` |
| `@Nonnull public` | `Steering` | `setTranslation(double x, double y, double z)` |
| `@Nonnull public` | `Steering` | `setTranslationRelativeSpeed(double relativeSpeed)` |
| `@Nonnull public` | `Steering` | `scaleTranslation(double speedFactor)` |
| `@Nonnull public` | `Steering` | `ensureMinTranslation(double relativeSpeed)` |
| `public` | `double` | `getMaxDistance()` |
| `public` | `void` | `setMaxDistance(double maxDistance)` |
| `public` | `void` | `clearMaxDistance()` |
| `public` | `Vector3d` | `getMaxDistanceComponentSelector()` |
| `public` | `void` | `setMaxDistanceComponentSelector(Vector3d maxDistanceComponentSelector)` |
| `public` | `void` | `clearMaxDistanceComponentSelector()` |
| `public` | `float` | `getYaw()` |
| `@Nonnull public` | `Steering` | `setYaw(float angle)` |
| `public` | `void` | `clearYaw()` |
| `public` | `float` | `getPitch()` |
| `@Nonnull public` | `Steering` | `setPitch(float angle)` |
| `public` | `void` | `clearPitch()` |
| `public` | `float` | `getRoll()` |
| `@Nonnull public` | `Steering` | `setRoll(float angle)` |
| `public` | `void` | `clearRoll()` |
| `@Nonnull public` | `Steering` | `setRelativeTurnSpeed(double relativeTurnSpeed)` |
| `public` | `boolean` | `hasTranslation()` |
| `public` | `boolean` | `hasYaw()` |
| `public` | `boolean` | `hasPitch()` |
| `public` | `boolean` | `hasRoll()` |
| `public` | `double` | `getSpeed()` |
| `public` | `double` | `getRelativeTurnSpeed()` |
| `@Nonnull @Override public` | `String` | `toString()` |
