---
title: "UserMapMarker"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.worldmap.markers.user"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldmap.markers.user.UserMapMarker"
api_surface: true
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "map"
---
**Package:** `com.hypixel.hytale.server.core.universe.world.worldmap.markers.user`

```java
public class UserMapMarker
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `String` | `id` |
| `private` | `float` | `x` |
| `private` | `float` | `z` |
| `private` | `String` | `name` |
| `private` | `String` | `icon` |
| `private` | `Color` | `colorTint` |
| `private` | `UUID` | `createdByUuid` |
| `private` | `String` | `createdByName` |
| `private` | `MapMarker` | `cachedProto` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getId()` |
| `public` | `void` | `setId(String id)` |
| `public` | `float` | `getX()` |
| `public` | `float` | `getZ()` |
| `public` | `void` | `setPosition(float blockX, float blockZ)` |
| `public` | `String` | `getName()` |
| `public` | `void` | `setName(@Nullable String name)` |
| `public` | `String` | `getIcon()` |
| `public` | `void` | `setIcon(String icon)` |
| `public` | `Color` | `getColorTint()` |
| `public` | `void` | `setColorTint(Color colorTint)` |
| `public` | `UUID` | `getCreatedByUuid()` |
| `public` | `UserMapMarker` | `withCreatedByUuid(@Nullable UUID uuid)` |
| `public` | `String` | `getCreatedByName()` |
| `public` | `UserMapMarker` | `withCreatedByName(@Nullable String name)` |
| `public` | `MapMarker` | `toProtocolMarker()` |
| `private` | `void` | `invalidateCachedProto()` |
