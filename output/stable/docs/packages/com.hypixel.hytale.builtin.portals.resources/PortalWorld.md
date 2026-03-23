---
title: "PortalWorld"
kind: "class"
package: "com.hypixel.hytale.builtin.portals.resources"
fqcn: "com.hypixel.hytale.builtin.portals.resources.PortalWorld"
api_surface: false
extends: null
implements: ["Resource"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "portals"
  - "resources"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.portals.resources`

```java
public class PortalWorld implements Resource
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `String` | `portalTypeId` |
| `private` | `int` | `timeLimitSeconds` |
| `private` | `PortalRemovalCondition` | `worldRemovalCondition` |
| `private` | `PortalGameplayConfig` | `storedGameplayConfig` |
| `private` | `Set<UUID>` | `diedInWorld` |
| `private` | `Set<UUID>` | `seesUi` |
| `private` | `Transform` | `spawnPoint` |
| `private` | `Ref<EntityStore>` | `voidEventRef` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ResourceType<EntityStore,PortalWorld>` | `getResourceType()` |
| `public` | `void` | `init(PortalType portalType, int timeLimitSeconds, PortalRemovalCondition removalCondition, PortalGameplayConfig gameplayConfig)` |
| `@Nullable public` | `PortalType` | `getPortalType()` |
| `public` | `boolean` | `exists()` |
| `public` | `int` | `getTimeLimitSeconds()` |
| `public` | `double` | `getElapsedSeconds(World world)` |
| `public` | `double` | `getRemainingSeconds(World world)` |
| `public static` | `void` | `setRemainingSeconds(World world, double seconds)` |
| `public` | `Set<UUID>` | `getDiedInWorld()` |
| `public` | `Set<UUID>` | `getSeesUi()` |
| `public` | `PortalGameplayConfig` | `getGameplayConfig()` |
| `@Nullable public` | `VoidEventConfig` | `getVoidEventConfig()` |
| `@Nullable public` | `Transform` | `getSpawnPoint()` |
| `public` | `void` | `setSpawnPoint(Transform spawnPoint)` |
| `@Nullable public` | `Ref<EntityStore>` | `getVoidEventRef()` |
| `public` | `boolean` | `isVoidEventActive()` |
| `public` | `void` | `setVoidEventRef(Ref<EntityStore> voidEventRef)` |
| `@Nonnull public` | `UpdatePortal` | `createFullPacket(World world)` |
| `@Nonnull public` | `UpdatePortal` | `createUpdatePacket(World world)` |
| `@Nonnull private` | `PortalState` | `createStateForPacket(World world)` |
| `@Override public` | `Resource<EntityStore>` | `clone()` |
