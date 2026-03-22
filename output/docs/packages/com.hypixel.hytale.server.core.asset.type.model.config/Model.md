---
title: "Model"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.model.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.model.config.Model"
api_surface: true
extends: null
implements:
  - "com.hypixel.hytale.server.core.io.NetworkSerializable"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "model"
  - "entity"
  - "runtime"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.model.config`

```java
public class Model implements NetworkSerializable<com.hypixel.hytale.protocol.Model>
```

Resolved runtime model constructed from a [ModelAsset](ModelAsset.md) at a specific scale. Owns all visual properties: bounding boxes (standing, crouching, sitting, sleeping), eye height with offsets, animation set map, camera settings, light, particles, trails, physics values, detail boxes, attachments, gradient IDs, phobia configuration, and the model/texture paths. Provides static factory methods for creating scaled, unit-scale, random-scale, and static models. Caches the network packet via a `SoftReference`.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `String` | `UNKNOWN_TEXTURE` | `"textures/Unknown.png"` |

## Key Accessors

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getModelAssetId()` |
| `public` | `float` | `getScale()` |
| `@Nullable public` | `Box` | `getBoundingBox()` |
| `@Nullable public` | `Box` | `getBoundingBox(@Nullable MovementStates movementStates)` |
| `@Nullable public` | `Box` | `getCrouchBoundingBox()` |
| `@Nullable public` | `Box` | `getSittingBoundingBox()` |
| `@Nullable public` | `Box` | `getSleepingBoundingBox()` |
| `public` | `String` | `getModel()` |
| `public` | `String` | `getTexture()` |
| `public` | `String` | `getGradientSet()` |
| `public` | `String` | `getGradientId()` |
| `public` | `float` | `getEyeHeight()` |
| `public` | `float` | `getEyeHeight(@Nullable Ref<EntityStore> ref, @Nullable ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `float` | `getCrouchOffset()` |
| `public` | `float` | `getSittingOffset()` |
| `public` | `float` | `getSleepingOffset()` |
| `public` | `Map<String, ModelAsset.AnimationSet>` | `getAnimationSetMap()` |
| `public` | `CameraSettings` | `getCamera()` |
| `public` | `ColorLight` | `getLight()` |
| `public` | `ModelParticle[]` | `getParticles()` |
| `public` | `ModelTrail[]` | `getTrails()` |
| `public` | `PhysicsValues` | `getPhysicsValues()` |
| `public` | `Map<String, DetailBox[]>` | `getDetailBoxes()` |
| `public` | `ModelAttachment[]` | `getAttachments()` |
| `public` | `Phobia` | `getPhobia()` |
| `@Nonnull public` | `Model.ModelReference` | `toReference()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.Model` | `toPacket()` |

## Static Factory Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `Model` | `createRandomScaleModel(@Nonnull ModelAsset modelAsset)` |
| `@Nonnull public static` | `Model` | `createUnitScaleModel(@Nonnull ModelAsset modelAsset)` |
| `@Nonnull public static` | `Model` | `createUnitScaleModel(@Nonnull ModelAsset modelAsset, @Nullable Box boundingBox)` |
| `@Nonnull public static` | `Model` | `createScaledModel(@Nonnull ModelAsset modelAsset, float scale)` |
| `@Nonnull public static` | `Model` | `createStaticScaledModel(@Nonnull ModelAsset modelAsset, float scale)` |
| `@Nonnull public static` | `Model` | `createScaledModel(@Nonnull ModelAsset modelAsset, float scale, @Nullable Map<String, String> randomAttachmentIds, @Nullable Box overrideBoundingBox, boolean staticModel)` |

## Inner Types

### ModelReference

```java
public static class ModelReference
```

Serializable reference to a model asset by ID, scale, random attachment choices, and static flag. Can resolve back to a full `Model` via `toModel()`.
