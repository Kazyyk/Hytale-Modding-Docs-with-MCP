---
title: "FailedSpawnSystem"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.FailedSpawnSystem"
api_surface: false
extends: "RefSystem<EntityStore>"
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-21T02:17:06Z"
tags:
  - "npc"
  - "ecs-system"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public class FailedSpawnSystem extends RefSystem<EntityStore>
```

Immediately removes entities that have a `FailedSpawnComponent`. This component is added by [RoleBuilderSystem](RoleBuilderSystem.md) when role construction fails (missing model asset, non-spawnable role, etc.).

## Query

Matches entities with the `FailedSpawnComponent`.

## Lifecycle

```java
@Override
public void onEntityAdded(
    @Nonnull Ref<EntityStore> ref,
    @Nonnull AddReason reason,
    @Nonnull Store<EntityStore> store,
    @Nonnull CommandBuffer<EntityStore> commandBuffer
)
```

Immediately issues `commandBuffer.removeEntity(ref, RemoveReason.REMOVE)`.

```java
@Override
public void onEntityRemove(
    @Nonnull Ref<EntityStore> ref,
    @Nonnull RemoveReason reason,
    @Nonnull Store<EntityStore> store,
    @Nonnull CommandBuffer<EntityStore> commandBuffer
)
```

No-op.

## Related Types

- [RoleBuilderSystem](RoleBuilderSystem.md) -- adds `FailedSpawnComponent` on construction failure
