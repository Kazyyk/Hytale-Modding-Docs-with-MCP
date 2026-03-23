---
title: "FluidFX"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.fluidfx.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.fluidfx.config.FluidFX"
api_surface: false
extends: ~
implements: ["JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, FluidFX>>", "NetworkSerializable<com.hypixel.hytale.protocol.FluidFX>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "fluidfx"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.fluidfx.config`

```java
public class FluidFX implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, FluidFX>>, NetworkSerializable<com.hypixel.hytale.protocol.FluidFX>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `Color` | `DEFAULT_FOG_COLOR` |
| `public static final` | `int` | `EMPTY_ID` |
| `public static final` | `String` | `EMPTY` |
| `public static final` | `FluidFX` | `EMPTY_FLUID_FX` |
| `public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` |
| `private static` | `AssetStore<String, FluidFX, IndexedLookupTableAssetMap<String, FluidFX>>` | `ASSET_STORE` |
| `protected` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |
| `@Nonnull protected` | `FluidFog` | `fog` |
| `protected` | `Color` | `fogColor` |
| `protected` | `float[]` | `fogDistance` |
| `protected` | `float` | `fogDepthStart` |
| `protected` | `float` | `fogDepthFalloff` |
| `protected` | `float` | `colorsSaturation` |
| `protected` | `float[]` | `colorsFilter` |
| `protected` | `float` | `distortionAmplitude` |
| `protected` | `float` | `distortionFrequency` |
| `protected` | `FluidParticle` | `particle` |
| `protected` | `FluidFXMovementSettings` | `movementSettings` |
| `private` | `SoftReference<com.hypixel.hytale.protocol.FluidFX>` | `cachedPacket` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `FluidFX(String id,
        FluidFog fog,
        Color fogColor,
        float[] fogDistance,
        float fogDepthStart,
        float fogDepthFalloff,
        float colorsSaturation,
        float[] colorsFilter,
        float distortionAmplitude,
        float distortionFrequency,
        FluidParticle particle,
        FluidFXMovementSettings movementSettings)` |
| `public` | `FluidFX(String id)` |
| `protected` | `FluidFX()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<String, FluidFX, IndexedLookupTableAssetMap<String, FluidFX>>` | `getAssetStore()` |
| `public static` | `IndexedLookupTableAssetMap<String, FluidFX>` | `getAssetMap()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.FluidFX` | `toPacket()` |
| `public` | `String` | `getId()` |
| `public` | `FluidFog` | `getFog()` |
| `public` | `Color` | `getFogColor()` |
| `public` | `float[]` | `getFogDistance()` |
| `public` | `float` | `getColorsSaturation()` |
| `public` | `float[]` | `getColorsFilter()` |
| `public` | `float` | `getDistortionAmplitude()` |
| `public` | `float` | `getDistortionFrequency()` |
| `public` | `float` | `getFogDepthStart()` |
| `public` | `float` | `getFogDepthFalloff()` |
| `public` | `FluidParticle` | `getParticle()` |
| `public` | `FluidFXMovementSettings` | `getMovementSettings()` |
| `@Override public` | `boolean` | `equals(@Nullable Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `@Nonnull public static` | `FluidFX` | `getUnknownFor(String unknownId)` |
