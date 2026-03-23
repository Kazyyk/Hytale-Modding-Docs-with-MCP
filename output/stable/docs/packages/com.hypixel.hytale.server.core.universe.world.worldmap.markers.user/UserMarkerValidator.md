---
title: "UserMarkerValidator"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.worldmap.markers.user"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldmap.markers.user.UserMarkerValidator"
api_surface: false
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
public final class UserMarkerValidator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `int` | `NAME_LENGTH_LIMIT` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `UserMarkerValidator.PlaceResult` | `validatePlacing(Ref<EntityStore> ref, CreateUserMarker packet)` |
| `public static` | `UserMarkerValidator.RemoveResult` | `validateRemove(Ref<EntityStore> ref, UserMapMarker marker)` |
| `private static` | `boolean` | `isPlayerTooFarFromMarker(Ref<EntityStore> ref, double markerX, double markerZ)` |
| `private static` | `double` | `getMaxRemovalDistanceSquared(Player player)` |
| `public` | `record` | `CanRemove()` |
| `public` | `record` | `CanSpawn(Player player, UserMapMarkersStore markersStore)` |
| `public` | `record` | `Fail(Message errorMsg)` |
