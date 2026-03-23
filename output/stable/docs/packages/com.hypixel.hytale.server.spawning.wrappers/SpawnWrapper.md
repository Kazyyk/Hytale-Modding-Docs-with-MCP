---
title: "SpawnWrapper"
kind: "class"
package: "com.hypixel.hytale.server.spawning.wrappers"
fqcn: "com.hypixel.hytale.server.spawning.wrappers.SpawnWrapper"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "spawning"
  - "wrappers"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.wrappers`

```java
public abstract class SpawnWrapper<T>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `int` | `spawnIndex` |
| `protected final` | `T` | `spawn` |
| `protected` | `Int2ObjectMap<RoleSpawnParameters>` | `roles` |
| `protected final` | `LightRangePredicate` | `lightRangePredicate` |
| `protected final` | `Set<String>` | `invalidNPCs` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `T` | `getSpawn()` |
| `public` | `Int2ObjectMap<RoleSpawnParameters>` | `getRoles()` |
| `@Nullable public` | `IntSet` | `getSpawnBlockSet(int roleIndex)` |
| `public` | `int` | `getSpawnFluidTag(int roleIndex)` |
| `public` | `int` | `getSpawnIndex()` |
| `@Nonnull public` | `LightRangePredicate` | `getLightRangePredicate()` |
| `public` | `boolean` | `hasInvalidNPC(String name)` |
| `public` | `boolean` | `spawnParametersMatch(ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `boolean` | `shouldDespawn(World world, WorldTimeResource timeManager)` |
| `public` | `boolean` | `withinLightRange(SpawningContext spawningContext)` |
| `private` | `void` | `addRoles()` |
