---
title: "LocalSpawnState"
kind: "class"
package: "com.hypixel.hytale.server.spawning.local"
fqcn: "com.hypixel.hytale.server.spawning.local.LocalSpawnState"
api_surface: false
extends: "Resource<EntityStore>"
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
public class LocalSpawnState implements Resource<EntityStore>
```

World-level resource tracking local spawn controller state including active controller references, pending spawns, and a force-trigger flag.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ResourceType<EntityStore, LocalSpawnState>` | `getResourceType()` |
| `public` | `List<Ref<EntityStore>>` | `getLocalControllerList()` |
| `public` | `List<LegacySpawnBeaconEntity>` | `getLocalPendingSpawns()` |
| `public` | `boolean` | `pollForceTriggerControllers()` |
| `public` | `void` | `forceTriggerControllers()` |
