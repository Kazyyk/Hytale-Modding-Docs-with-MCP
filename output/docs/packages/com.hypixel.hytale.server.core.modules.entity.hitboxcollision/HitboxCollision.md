---
title: "HitboxCollision"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.hitboxcollision"
fqcn: "com.hypixel.hytale.server.core.modules.entity.hitboxcollision.HitboxCollision"
api_surface: false
extends: null
implements:
  - "Component"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "entity"
---
**Package:** `com.hypixel.hytale.server.core.modules.entity.hitboxcollision`

```java
public class HitboxCollision implements Component<EntityStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `int` | `hitboxCollisionConfigIndex` |
| `private` | `boolean` | `isNetworkOutdated` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, HitboxCollision>` | `getComponentType()` |
| `public` | `` | `HitboxCollision(@Nonnull HitboxCollisionConfig hitboxCollisionConfig)` |
| `protected` | `` | `HitboxCollision()` |
| `public` | `int` | `getHitboxCollisionConfigIndex()` |
| `public` | `void` | `setHitboxCollisionConfigIndex(int hitboxCollisionConfigIndex)` |
| `public` | `boolean` | `consumeNetworkOutdated()` |
| `public` | `Component<EntityStore>` | `clone()` |
