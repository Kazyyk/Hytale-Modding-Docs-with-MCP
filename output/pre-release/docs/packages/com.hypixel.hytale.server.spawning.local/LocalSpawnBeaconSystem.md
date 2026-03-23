---
title: "LocalSpawnBeaconSystem"
kind: "class"
package: "com.hypixel.hytale.server.spawning.local"
fqcn: "com.hypixel.hytale.server.spawning.local.LocalSpawnBeaconSystem"
api_surface: false
extends: "RefSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "spawning"
  - "local"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.local`

```java
public class LocalSpawnBeaconSystem extends RefSystem<EntityStore>
```

Reference system that triggers forced rerun of local spawn controllers when a local spawn beacon entity is removed.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `onEntityAdded(Ref<EntityStore> reference, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)` |
| `public` | `void` | `onEntityRemove(Ref<EntityStore> reference, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)` |
| `public` | `Query<EntityStore>` | `getQuery()` |
