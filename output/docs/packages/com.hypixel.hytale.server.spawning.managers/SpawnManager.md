---
title: "SpawnManager"
kind: "class"
package: "com.hypixel.hytale.server.spawning.managers"
fqcn: "com.hypixel.hytale.server.spawning.managers.SpawnManager"
api_surface: false
extends: null
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
public abstract class SpawnManager<T, U>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Int2ObjectMap<T>` | `spawnWrapperCache` |
| `private final` | `Object2IntMap<String>` | `wrapperNameMap` |
| `private final` | `StampedLock` | `wrapperLock` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `T` | `getSpawnWrapper(int spawnConfigIndex)` |
| `@Nullable public` | `T` | `removeSpawnWrapper(int spawnConfigurationIndex)` |
| `public` | `boolean` | `addSpawnWrapper(T spawnWrapper)` |
| `public` | `void` | `onNPCLoaded(String name, IntSet changeSet)` |
| `public` | `void` | `onNPCSpawnRemoved(String key)` |
| `protected` | `void` | `untrackNPCs(int index)` |
