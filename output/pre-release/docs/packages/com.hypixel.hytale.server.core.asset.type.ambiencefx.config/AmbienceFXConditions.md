---
title: "AmbienceFXConditions"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.ambiencefx.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.ambiencefx.config.AmbienceFXConditions"
api_surface: false
extends: null
implements:
  - "NetworkSerializable"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "type"
  - "ambiencefx"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.ambiencefx.config`

```java
public class AmbienceFXConditions implements NetworkSerializable<com.hypixel.hytale.protocol.AmbienceFXConditions>
```

Implements `NetworkSerializable`.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `Range` | `DEFAULT_ALTITUDE` | `new Range(0, 512)` |
| `public static final` | `Rangeb` | `DEFAULT_WALLS` | `new Rangeb((byte)0, (byte)4)` |
| `public static final` | `Rangeb` | `DEFAULT_LIGHT_LEVEL` | `new Rangeb((byte)0, (byte)15)` |
| `public static final` | `Rangef` | `DEFAULT_DAY_TIME` | `new Rangef(0.0F, 24.0F)` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `boolean` | `never` |
| `protected` | `String[]` | `environmentIds` |
| `protected` | `transient int[]` | `environmentIndices` |
| `protected` | `String[]` | `weatherIds` |
| `protected` | `transient int[]` | `weatherIndices` |
| `protected` | `String` | `environmentTagPattern` |
| `protected` | `String` | `weatherTagPattern` |
| `protected` | `String[]` | `fluidFXIds` |
| `protected` | `transient int[]` | `fluidFXIndices` |
| `protected` | `AmbienceFXBlockSoundSet[]` | `surroundingBlockSoundSets` |
| `protected` | `Range` | `altitude` |
| `protected` | `Rangeb` | `walls` |
| `protected` | `boolean` | `roof` |
| `protected` | `String` | `roofMaterialTagPattern` |
| `protected` | `boolean` | `floor` |
| `protected` | `Rangeb` | `sunLightLevel` |
| `protected` | `Rangeb` | `torchLightLevel` |
| `protected` | `Rangeb` | `globalLightLevel` |
| `protected` | `Rangef` | `dayTime` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `com.hypixel.hytale.protocol.AmbienceFXConditions` | `toPacket()` |
| `` | `public boolean` | `isNever()` |
| `` | `public String[]` | `getEnvironmentIds()` |
| `` | `public int[]` | `getEnvironmentIndices()` |
| `` | `public String[]` | `getWeatherIds()` |
| `` | `public int[]` | `getWeatherIndices()` |
| `` | `public String[]` | `getFluidFXIds()` |
| `` | `public int[]` | `getFluidFXIndices()` |
| `` | `public AmbienceFXBlockSoundSet[]` | `getSurroundingBlockSoundSets()` |
| `` | `public Range` | `getAltitude()` |
| `` | `public Rangeb` | `getWalls()` |
| `` | `public boolean` | `getRoof()` |
| `` | `public boolean` | `getFloor()` |
| `` | `public Rangeb` | `getSunLightLevel()` |
| `` | `public Rangeb` | `getTorchLightLevel()` |
| `` | `public Rangeb` | `getGlobalLightLevel()` |
| `` | `public Rangef` | `getDayTime()` |
| `` | `public boolean` | `isRoof()` |
| `` | `public boolean` | `isFloor()` |
| `` | `protected void` | `processConfig()` |
| `@Override public` | `String` | `toString()` |
