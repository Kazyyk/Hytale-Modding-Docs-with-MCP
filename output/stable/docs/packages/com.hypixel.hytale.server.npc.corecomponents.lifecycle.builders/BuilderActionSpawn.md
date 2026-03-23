---
title: "BuilderActionSpawn"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders.BuilderActionSpawn"
api_surface: false
extends: "BuilderActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "lifecycle"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders`

```java
public class BuilderActionSpawn extends BuilderActionBase
```

NPC behavior action builder for ActionSpawn functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `double[]` | `DEFAULT_DISTANCE_RANGE` | `new double[]{1.0, 1.0}` |
| `public static final` | `int[]` | `DEFAULT_COUNT_RANGE` | `new int[]{5, 5}` |
| `public static final` | `double[]` | `DEFAULT_DELAY_RANGE` | `new double[]{0.25, 0.25}` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected final` | `FloatHolder` | `spawnDirection` | `new FloatHolder()` |
| `protected final` | `FloatHolder` | `spawnAngle` | `new FloatHolder()` |
| `protected final` | `BooleanHolder` | `fanOut` | `new BooleanHolder()` |
| `protected final` | `NumberArrayHolder` | `distanceRange` | `new NumberArrayHolder()` |
| `protected final` | `NumberArrayHolder` | `countRange` | `new NumberArrayHolder()` |
| `protected final` | `NumberArrayHolder` | `delayRange` | `new NumberArrayHolder()` |
| `protected final` | `StringHolder` | `kind` | `new StringHolder()` |
| `protected final` | `AssetHolder` | `flock` | `new AssetHolder()` |
| `protected final` | `BooleanHolder` | `launchAtTarget` | `new BooleanHolder()` |
| `protected final` | `BooleanHolder` | `pitchHigh` | `new BooleanHolder()` |
| `protected final` | `DoubleHolder` | `spread` | `new DoubleHolder()` |
| `protected final` | `BooleanHolder` | `joinFlock` | `new BooleanHolder()` |
| `protected final` | `StringHolder` | `spawnState` | `new StringHolder()` |
| `protected final` | `StringHolder` | `spawnSubState` | `new StringHolder()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ActionSpawn` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull public` | `BuilderActionSpawn` | `readConfig(@Nonnull JsonElement data)` |
| `public` | `float` | `getSpawnDirection(@Nonnull BuilderSupport support)` |
| `public` | `float` | `getSpawnAngle(@Nonnull BuilderSupport support)` |
| `public` | `boolean` | `isFanOut(@Nonnull BuilderSupport support)` |
| `public` | `double[]` | `getDistanceRange(@Nonnull BuilderSupport support)` |
| `public` | `String` | `getKind(@Nonnull BuilderSupport support)` |
| `public` | `String` | `getFlock(@Nonnull BuilderSupport support)` |
| `public` | `int[]` | `getCountRange(@Nonnull BuilderSupport support)` |
| `public` | `double[]` | `getDelayRange(@Nonnull BuilderSupport support)` |
| `public` | `boolean` | `isLaunchAtTarget(@Nonnull BuilderSupport support)` |
| `public` | `boolean` | `isPitchHigh(@Nonnull BuilderSupport support)` |
| `public` | `double` | `getSpread(@Nonnull BuilderSupport support)` |
| `public` | `boolean` | `isJoinFlock(@Nonnull BuilderSupport support)` |
| `public` | `String` | `getSpawnState(@Nonnull BuilderSupport support)` |
| `public` | `String` | `getSpawnSubState(@Nonnull BuilderSupport support)` |
