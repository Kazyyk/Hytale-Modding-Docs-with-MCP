---
title: "Entity"
kind: "class"
package: "com.hypixel.hytale.server.core.entity"
fqcn: "com.hypixel.hytale.server.core.entity.Entity"
api_surface: true
extends: ~
implements: 
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.entity`

```java
public abstract class Entity implements Component<EntityStore>
```

Abstract base class for all server-side entities. Implements `Component<EntityStore>` for the ECS architecture. Maintains a network ID, world reference, entity store reference, legacy UUID, legacy display name, and removal tracking. Provides static codec fields `MODEL`, `DISPLAY_NAME`, and `UUID`. The `CODEC` is an abstract builder codec (version 5) with legacy versioned support.
