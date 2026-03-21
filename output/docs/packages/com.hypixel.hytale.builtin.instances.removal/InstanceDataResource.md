---
title: "InstanceDataResource"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.removal"
fqcn: "com.hypixel.hytale.builtin.instances.removal.InstanceDataResource"
api_surface: false
extends: ~
implements: 
  - "Resource<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "instances"
---

**Package:** `com.hypixel.hytale.builtin.instances.removal`

```java
public class InstanceDataResource implements Resource<ChunkStore>
```

Implementation of `Resource<ChunkStore>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `isRemoving` | `boolean` | boolean field. |
| `timeoutTimer` | `Instant` | Instant field. |
| `idleTimeoutTimer` | `Instant` | Instant field. |
| `hadPlayer` | `boolean` | boolean field. |
| `worldTimeoutTimer` | `Instant` | Instant field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getResourceType()` | `ResourceType<ChunkStore, InstanceDataResource>` | static public method. |
| `isRemoving()` | `boolean` | public method. |
| `setRemoving(boolean removing)` | `void` | public method. |
| `getTimeoutTimer()` | `Instant` | public method. |
| `setTimeoutTimer(Instant timeoutTimer)` | `void` | public method. |
| `getIdleTimeoutTimer()` | `Instant` | public method. |
| `setIdleTimeoutTimer(Instant idleTimeoutTimer)` | `void` | public method. |
| `hadPlayer()` | `boolean` | public method. |
| `setHadPlayer(boolean hadPlayer)` | `void` | public method. |
| `getWorldTimeoutTimer()` | `Instant` | public method. |
| `setWorldTimeoutTimer(@Nullable Instant worldTimeoutTimer)` | `void` | public method. |
| `clone()` | `InstanceDataResource` | public method. |
