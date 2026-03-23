---
title: "ModelParticle"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.model.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.model.config.ModelParticle"
api_surface: true
extends: null
implements:
  - "com.hypixel.hytale.server.core.io.NetworkSerializable"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "model"
  - "particle"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.model.config`

```java
public class ModelParticle implements NetworkSerializable<com.hypixel.hytale.protocol.ModelParticle>
```

Binds a particle system to a model node. Specifies the particle system ID, target entity part, optional node name, color override, scale, position/rotation offsets, and whether the particle is detached from the model (spawns in world space vs. follows the model).

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String` | `systemId` |
| `@Nonnull protected` | `EntityPart` | `targetEntityPart` |
| `protected` | `String` | `targetNodeName` |
| `protected` | `Color` | `color` |
| `protected` | `float` | `scale` |
| `protected` | `Vector3f` | `positionOffset` |
| `protected` | `Direction` | `rotationOffset` |
| `protected` | `boolean` | `detachedFromModel` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getSystemId()` |
| `public` | `EntityPart` | `getTargetEntityPart()` |
| `public` | `String` | `getTargetNodeName()` |
| `public` | `Color` | `getColor()` |
| `public` | `float` | `getScale()` |
| `public` | `Vector3f` | `getPositionOffset()` |
| `public` | `Direction` | `getRotationOffset()` |
| `public` | `boolean` | `isDetachedFromModel()` |
| `public` | `void` | `setSystemId(String systemId)` |
| `public` | `void` | `setTargetNodeName(String targetNodeName)` |
| `public` | `void` | `setPositionOffset(Vector3f positionOffset)` |
| `public` | `void` | `setDetachedFromModel(boolean detachedFromModel)` |
| `public` | `ModelParticle` | `scale(float scale)` |
| `public` | `ModelParticle` | `clone()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.ModelParticle` | `toPacket()` |
