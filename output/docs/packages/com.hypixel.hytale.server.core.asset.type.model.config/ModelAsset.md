---
title: "ModelAsset"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.model.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.model.config.ModelAsset"
api_surface: true
extends: null
implements:
  - "com.hypixel.hytale.assetstore.map.JsonAssetWithMap"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "model"
  - "asset"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.model.config`

```java
public class ModelAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, ModelAsset>>
```

JSON asset definition for model configuration. Defines all visual and physics properties: model/texture paths, gradient references, bounding box, eye height, crouch/sitting/sleeping offsets, camera settings, scale range, animation sets, default and random attachments, particles, trails, light, detail boxes, physics values, icon properties, and phobia configuration. The `CODEC` field provides the full deserialization codec with UI metadata annotations.

## Key Accessors

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getId()` |
| `public` | `String` | `getModel()` |
| `public` | `String` | `getTexture()` |
| `public` | `String` | `getGradientSet()` |
| `public` | `String` | `getGradientId()` |
| `public` | `float` | `getEyeHeight()` |
| `public` | `float` | `getCrouchOffset()` |
| `public` | `float` | `getSittingOffset()` |
| `public` | `float` | `getSleepingOffset()` |
| `@Nonnull public` | `Box` | `getBoundingBox()` |
| `public` | `Map<String, ModelAsset.AnimationSet>` | `getAnimationSetMap()` |
| `public` | `CameraSettings` | `getCamera()` |
| `public` | `ColorLight` | `getLight()` |
| `public` | `ModelParticle[]` | `getParticles()` |
| `public` | `ModelTrail[]` | `getTrails()` |
| `public` | `PhysicsValues` | `getPhysicsValues()` |
| `public` | `ModelAttachment[]` | `getDefaultAttachments()` |
| `public` | `ModelAttachment[]` | `getAttachments(@Nullable Map<String, String> randomAttachmentIds)` |
| `public` | `float` | `getMinScale()` |
| `public` | `float` | `getMaxScale()` |
| `public` | `float` | `generateRandomScale()` |
| `@Nullable public` | `Map<String, String>` | `generateRandomAttachmentIds()` |
| `public` | `Map<String, DetailBox[]>` | `getDetailBoxes()` |
| `public` | `Phobia` | `getPhobia()` |
| `public static` | `DefaultAssetMap<String, ModelAsset>` | `getAssetMap()` |

## Inner Types

### Animation

```java
public static class Animation
```

Single animation entry with path, speed, blending duration, looping flag, weight, footstep intervals, sound event, and passive loop count.

### AnimationSet

```java
public static class AnimationSet
```

Named collection of animations with a delay range between passive animation switches.
