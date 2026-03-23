---
title: "WorldMarkersResource"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.worldmap.markers.worldstore"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldmap.markers.worldstore.WorldMarkersResource"
api_surface: true
extends: null
implements: ["Resource", "UserMapMarkersStore"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "worldmap"
  - "markers"
  - "worldstore"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.worldmap.markers.worldstore`

```java
public class WorldMarkersResource implements Resource, UserMapMarkersStore
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<WorldMarkersResource>` | `CODEC` |
| `private` | `Map<String,UserMapMarker>` | `mapMarkersById` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ResourceType<ChunkStore,WorldMarkersResource>` | `getResourceType()` |
| `@NonNullDecl @Override public` | `Collection<? extends UserMapMarker>` | `getUserMapMarkers()` |
| `@NonNullDecl @Override public` | `Collection<? extends UserMapMarker>` | `getUserMapMarkers(UUID createdByUuid)` |
| `@Override public` | `void` | `setUserMapMarkers(Collection<? extends UserMapMarker> markers)` |
| `@NullableDecl @Override public` | `UserMapMarker` | `getUserMapMarker(String markerId)` |
| `@NullableDecl @Override public` | `Resource<ChunkStore>` | `clone()` |
