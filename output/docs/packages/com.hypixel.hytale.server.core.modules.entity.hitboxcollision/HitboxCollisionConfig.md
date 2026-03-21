---
title: "HitboxCollisionConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.hitboxcollision"
fqcn: "com.hypixel.hytale.server.core.modules.entity.hitboxcollision.HitboxCollisionConfig"
api_surface: false
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "entity"
---
**Package:** `com.hypixel.hytale.server.core.modules.entity.hitboxcollision`

```java
public class HitboxCollisionConfig implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, HitboxCollisionConfig>>, NetworkSerializable<com.hypixel.hytale.protocol.HitboxCollisionConfig>
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `NO_HITBOX` | `-1` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static` | `AssetStore<String, HitboxCollisionConfig, IndexedLookupTableAssetMap<String, HitboxCollisionConfig>>` | `ASSET_STORE` |
| `public static final` | `int` | `NO_HITBOX` |
| `protected` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |
| `protected` | `CollisionType` | `collisionType` |
| `protected` | `float` | `softOffsetRatio` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<String, HitboxCollisionConfig, IndexedLookupTableAssetMap<String, HitboxCollisionConfig>>` | `getAssetStore()` |
| `public static` | `IndexedLookupTableAssetMap<String, HitboxCollisionConfig>` | `getAssetMap()` |
| `public` | `` | `HitboxCollisionConfig(String id)` |
| `public` | `` | `HitboxCollisionConfig()` |
| `public` | `String` | `getId()` |
| `public` | `CollisionType` | `getCollisionType()` |
| `public` | `float` | `getSoftOffsetRatio()` |
| `public` | `com.hypixel.hytale.protocol.HitboxCollisionConfig` | `toPacket()` |
| `public` | `String` | `toString()` |
