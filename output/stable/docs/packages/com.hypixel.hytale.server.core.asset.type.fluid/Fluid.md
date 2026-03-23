---
title: "Fluid"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.fluid"
fqcn: "com.hypixel.hytale.server.core.asset.type.fluid.Fluid"
api_surface: true
extends: null
implements:
  - "com.hypixel.hytale.assetstore.map.JsonAssetWithMap"
  - "com.hypixel.hytale.server.core.io.NetworkSerializable"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "core"
  - "asset"
  - "fluid"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.fluid`

```java
public class Fluid implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, Fluid>>, NetworkSerializable<com.hypixel.hytale.protocol.Fluid>
```

JSON-loaded fluid asset type. Defines all visual and behavioral properties of a fluid: max level (0-15), textures, shader effects, draw type, opacity, alpha blending, FluidFX reference, particles, ticker (simulation behavior), light emission, entity damage, block sound/particle sets, particle color, and interaction map. Supports asset inheritance and clone-based variant creation.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `EMPTY_ID` | `0` |
| `public static final` | `String` | `EMPTY_KEY` | `"Empty"` |
| `public static final` | `Fluid` | `EMPTY` | Singleton empty fluid. |
| `public static final` | `int` | `UNKNOWN_ID` | `1` |
| `public static final` | `Fluid` | `UNKNOWN` | Singleton unknown fluid placeholder. |
| `public static final` | `String` | `UNKNOWN_TEXTURE` | `"BlockTextures/Unknown.png"` |

## Asset Properties (JSON-configurable)

| Type | Name | Default | Description |
|---|---|---|---|
| `int` | `maxFluidLevel` | `8` | Maximum fluid level (0-15). |
| `BlockTypeTextures[]` | `textures` | -- | Per-face texture definitions. |
| `ShaderType[]` | `effect` | -- | Shader effects applied to the fluid. |
| `FluidDrawType` | `drawType` | `Liquid` | Rendering draw type. |
| `Opacity` | `opacity` | `Solid` | Opacity classification. |
| `boolean` | `requiresAlphaBlending` | `true` | Whether alpha blending is needed. |
| `String` | `fluidFXId` | `"Empty"` | Reference to a `FluidFX` asset. |
| `ModelParticle[]` | `particles` | -- | Particles spawned on fluid surfaces. |
| [FluidTicker](FluidTicker.md) | `ticker` | `DefaultFluidTicker.INSTANCE` | Simulation tick behavior. |
| `int` | `damageToEntities` | `0` | Damage dealt to entities in this fluid. |
| `ColorLight` | `light` | -- | Light emission color. |
| `Color` | `particleColor` | -- | Particle tint color. |
| `String` | `blockSoundSetId` | `"EMPTY"` | Block sound set reference. |
| `String` | `blockParticleSetId` | -- | Block particle set reference. |
| `Map<InteractionType, String>` | `interactions` | empty | Interaction type to root interaction mappings. |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<...>` | `getAssetStore()` |
| `public static` | `IndexedLookupTableAssetMap<String, Fluid>` | `getAssetMap()` |
| `public` | `String` | `getId()` |
| `public` | `boolean` | `isUnknown()` |
| `public` | `int` | `getMaxFluidLevel()` |
| `public` | `boolean` | `hasEffect(ShaderType shader)` |
| `public` | [FluidTicker](FluidTicker.md) | `getTicker()` |
| `public` | `int` | `getDamageToEntities()` |
| `public` | `String` | `getFluidFXId()` |
| `public` | `int` | `getFluidFXIndex()` |
| `public` | `ColorLight` | `getLight()` |
| `public` | `Color` | `getParticleColor()` |
| `public` | `boolean` | `isTrigger()` |
| `public` | `Map<InteractionType, String>` | `getInteractions()` |
| `@Nonnull public` | `Fluid` | `clone(String newKey)` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.Fluid` | `toPacket()` |
| `public static` | `int` | `getFluidIdOrUnknown(String key, String message, Object... params)` |

## Inner Types

### ConversionResult (deprecated static class)

```java
@Deprecated(forRemoval = true)
public static class ConversionResult
```

Legacy conversion result holding a block type string, fluid ID, and fluid level. Used by the deprecated `convertBlockToFluid` and `convertLegacyName` methods.

## Related Types

- [FluidTicker](FluidTicker.md) -- tick behavior for fluid simulation
- [FluidTypePacketGenerator](FluidTypePacketGenerator.md) -- network packet generation
