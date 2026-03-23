---
title: "BeaconSpatialSystem"
kind: "class"
package: "com.hypixel.hytale.server.spawning.systems"
fqcn: "com.hypixel.hytale.server.spawning.systems.BeaconSpatialSystem"
api_surface: false
extends: "SpatialSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "spawning"
  - "systems"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.systems`

```java
public class BeaconSpatialSystem extends SpatialSystem
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Query<EntityStore>` | `QUERY` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Query<EntityStore>` | `getQuery()` |
| `@Override public` | `void` | `tick(float dt, int systemIndex, Store<EntityStore> store)` |
| `@Nonnull @Override public` | `Vector3d` | `getPosition(ArchetypeChunk<EntityStore> archetypeChunk, int index)` |
