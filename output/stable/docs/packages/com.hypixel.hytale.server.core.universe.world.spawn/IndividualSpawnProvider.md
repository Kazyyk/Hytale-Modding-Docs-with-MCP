---
title: "IndividualSpawnProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.spawn"
fqcn: "com.hypixel.hytale.server.core.universe.world.spawn.IndividualSpawnProvider"
api_surface: false
extends: null
implements: ["ISpawnProvider"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "spawn"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.spawn`

```java
public class IndividualSpawnProvider implements ISpawnProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static` | `BuilderCodec<IndividualSpawnProvider>` | `CODEC` |
| `private` | `Transform[]` | `spawnPoints` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `Transform` | `getSpawnPoint(World world, UUID uuid)` |
| `@Override public` | `Transform[]` | `getSpawnPoints()` |
| `@Nullable public` | `Transform` | `getFirstSpawnPoint()` |
| `@Override public` | `boolean` | `isWithinSpawnDistance(Vector3d position, double distance)` |
