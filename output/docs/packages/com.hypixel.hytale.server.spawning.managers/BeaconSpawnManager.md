---
title: "BeaconSpawnManager"
kind: "class"
package: "com.hypixel.hytale.server.spawning.managers"
fqcn: "com.hypixel.hytale.server.spawning.managers.BeaconSpawnManager"
api_surface: false
extends: "SpawnManager"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "spawning"
  - "managers"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.managers`

```java
public class BeaconSpawnManager extends SpawnManager
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Int2ObjectConcurrentHashMap<List<BeaconSpawnWrapper>>` | `wrappersByEnvironment` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public` | `BeaconSpawnWrapper` | `removeSpawnWrapper(int spawnConfigurationIndex)` |
| `public` | `boolean` | `addSpawnWrapper(BeaconSpawnWrapper spawnWrapper)` |
| `public` | `List<BeaconSpawnWrapper>` | `getBeaconSpawns(int environment)` |
