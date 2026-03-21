---
title: "NewSpawnStartTickingSystem"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.NewSpawnStartTickingSystem"
api_surface: false
extends: "TickingSystem<EntityStore>"
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-21T02:17:06Z"
tags:
  - "npc"
  - "ecs-system"
  - "lifecycle"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public class NewSpawnStartTickingSystem extends TickingSystem<EntityStore>
```

Removes the `NonTicking` component from newly spawned NPC entities, enabling them to participate in the tick pipeline. Newly spawned NPCs are initially marked as non-ticking to prevent them from being processed before full initialization completes.

## Execution Order

| Dependency | Direction |
|---|---|
| `StepCleanupSystem` | AFTER |

## Static Method

```java
public static void queueNewSpawn(@Nonnull Ref<EntityStore> reference, @Nonnull Store<EntityStore> store)
```

Adds the `NonTicking` component to the entity and enqueues it in the `QueueResource` for processing in the next tick.

## Tick Logic

```java
@Override
public void tick(float dt, int systemIndex, @Nonnull Store<EntityStore> store)
```

Iterates through the queue resource. For each valid reference, removes the `NonTicking` component. Clears the queue after processing.

## Inner Types

### NewSpawnStartTickingSystem.QueueResource

```java
public static class QueueResource implements Resource<EntityStore>
```

ECS resource that holds a queue of references to newly spawned entities awaiting activation. Backed by `ObjectArrayList<Ref<EntityStore>>`.

```java
@Nonnull
public static ResourceType<EntityStore, NewSpawnStartTickingSystem.QueueResource> getResourceType()
```

Returns the resource type from `NPCPlugin`.

## Related Types

- [RoleBuilderSystem](RoleBuilderSystem.md) -- calls `queueNewSpawn` during role construction
- [StepCleanupSystem](StepCleanupSystem.md) -- runs before this system
