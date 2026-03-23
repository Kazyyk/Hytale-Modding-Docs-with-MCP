---
title: "NPCBeaconSpawnJob"
kind: "class"
package: "com.hypixel.hytale.server.spawning.jobs"
fqcn: "com.hypixel.hytale.server.spawning.jobs.NPCBeaconSpawnJob"
api_surface: false
extends: "SpawnJob"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "spawning"
  - "jobs"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.jobs`

```java
public class NPCBeaconSpawnJob extends SpawnJob
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `int` | `roleIndex` |
| `private` | `Ref<EntityStore>` | `player` |
| `private` | `int` | `spawnsThisRound` |
| `private` | `int` | `flockSize` |
| `private` | `FlockAsset` | `flockAsset` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getRoleIndex()` |
| `@Nullable public` | `Ref<EntityStore>` | `getPlayer()` |
| `public` | `int` | `getSpawnsThisRound()` |
| `public` | `int` | `getFlockSize()` |
| `@Nullable public` | `FlockAsset` | `getFlockAsset()` |
| `@Override public` | `boolean` | `shouldTerminate()` |
| `@Override public` | `boolean` | `budgetAvailable()` |
| `@Override public` | `void` | `reset()` |
| `@Nullable @Override public` | `ISpawnableWithModel` | `getSpawnable()` |
| `@Nullable @Override public` | `String` | `getSpawnableName()` |
| `public` | `void` | `beginProbing(PlayerRef targetPlayer, int spawnsThisRound, int roleIndex, FlockAsset flockDefinition)` |
