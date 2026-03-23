---
title: "ProjectileConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.projectile.config"
fqcn: "com.hypixel.hytale.server.core.modules.projectile.config.ProjectileConfig"
api_surface: false
extends: null
implements:
  - "JsonAssetWithMap<String, DefaultAssetMap<String, ProjectileConfig>>"
  - "NetworkSerializable<com.hypixel.hytale.protocol.ProjectileConfig>"
  - "BallisticData"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "projectile"
  - "config"
  - "asset"
---

**Package:** `com.hypixel.hytale.server.core.modules.projectile.config`

```java
public class ProjectileConfig implements JsonAssetWithMap<String, DefaultAssetMap<String, ProjectileConfig>>, NetworkSerializable<com.hypixel.hytale.protocol.ProjectileConfig>, BallisticData
```

Asset-backed configuration for projectile types. Defines physics behavior, model, launch force, spawn offsets and rotation, interaction bindings per `InteractionType`, and sound events for launch and flight. Implements `BallisticData` by delegating to spawn offset and physics config.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String, ProjectileConfig>` | `CODEC` |
| `public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` |
| `protected` | `String` | `id` |
| `protected` | `PhysicsConfig` | `physicsConfig` |
| `protected` | `String` | `model` |
| `protected` | `double` | `launchForce` |
| `protected` | `Vector3f` | `spawnOffset` |
| `protected` | `Direction` | `spawnRotationOffset` |
| `protected` | `Map<InteractionType, String>` | `interactions` |
| `protected` | `String` | `launchLocalSoundEventId` |
| `protected` | `String` | `launchWorldSoundEventId` |
| `protected` | `String` | `projectileSoundEventId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<String, ProjectileConfig, DefaultAssetMap<String, ProjectileConfig>>` | `getAssetStore()` |
| `public static` | `DefaultAssetMap<String, ProjectileConfig>` | `getAssetMap()` |
| `public` | `String` | `getId()` |
| `public` | `PhysicsConfig` | `getPhysicsConfig()` |
| `public` | `Model` | `getModel()` |
| `public` | `double` | `getLaunchForce()` |
| `public` | `double` | `getMuzzleVelocity()` |
| `public` | `double` | `getGravity()` |
| `public` | `double` | `getVerticalCenterShot()` |
| `public` | `double` | `getHorizontalCenterShot()` |
| `public` | `double` | `getDepthShot()` |
| `public` | `boolean` | `isPitchAdjustShot()` |
| `public` | `Map<InteractionType, String>` | `getInteractions()` |
| `public` | `int` | `getLaunchWorldSoundEventIndex()` |
| `public` | `int` | `getProjectileSoundEventIndex()` |
| `public` | `Vector3f` | `getSpawnOffset()` |
| `public` | `Direction` | `getSpawnRotationOffset()` |
| `public` | `Vector3d` | `getCalculatedOffset(float pitch, float yaw)` |
| `public` | `com.hypixel.hytale.protocol.ProjectileConfig` | `toPacket()` |
