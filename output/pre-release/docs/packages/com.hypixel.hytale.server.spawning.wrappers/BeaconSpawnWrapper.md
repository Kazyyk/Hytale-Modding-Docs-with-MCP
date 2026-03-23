---
title: "BeaconSpawnWrapper"
kind: "class"
package: "com.hypixel.hytale.server.spawning.wrappers"
fqcn: "com.hypixel.hytale.server.spawning.wrappers.BeaconSpawnWrapper"
api_surface: false
extends: "SpawnWrapper"
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
public class BeaconSpawnWrapper extends SpawnWrapper
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `IWeightedMap<RoleSpawnParameters>` | `weightedRoles` |
| `private final` | `double` | `minDistanceFromPlayerSquared` |
| `private final` | `double` | `targetDistanceFromPlayerSquared` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `getMinDistanceFromPlayerSquared()` |
| `public` | `double` | `getTargetDistanceFromPlayerSquared()` |
| `public` | `double` | `getBeaconRadius()` |
| `public` | `double` | `getSpawnRadius()` |
| `@Nullable public` | `RoleSpawnParameters` | `pickRole(Random chanceProvider)` |
