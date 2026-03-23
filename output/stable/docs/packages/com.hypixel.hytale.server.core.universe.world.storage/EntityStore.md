---
title: "EntityStore"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.EntityStore"
api_surface: true
implements:
  - "WorldProvider"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "world"
  - "entities"
  - "storage"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage`

```java
public class EntityStore implements WorldProvider
```

Central manager for entity-level ECS storage. Owns the `Store<EntityStore>`, UUID-to-reference and network-ID-to-reference lookups. Contains `UUIDSystem` and `NetworkIdSystem` inner classes for maintaining those indices.
