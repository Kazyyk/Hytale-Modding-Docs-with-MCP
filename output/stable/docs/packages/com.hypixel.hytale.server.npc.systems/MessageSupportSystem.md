---
title: "MessageSupportSystem"
kind: "abstract class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.MessageSupportSystem"
api_surface: false
extends: "SteppableTickingSystem"
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-21T02:17:06Z"
tags:
  - "npc"
  - "ecs-system"
  - "messaging"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public abstract class MessageSupportSystem<T extends MessageSupport> extends SteppableTickingSystem
```

Abstract base for systems that tick NPC message support components. Iterates over each `NPCMessage` slot in the `MessageSupport` component, advancing the age of activated non-infinite messages and deactivating them when they expire.

## Constructor

```java
public MessageSupportSystem(
    @Nonnull ComponentType<EntityStore, T> messageSupportComponentType,
    @Nonnull Set<Dependency<EntityStore>> dependencies
)
```

## Tick Logic

```java
@Override
public void steppedTick(
    float dt,
    int index,
    @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
    @Nonnull Store<EntityStore> store,
    @Nonnull CommandBuffer<EntityStore> commandBuffer
)
```

For each message slot: if activated and not infinite, ticks the age. If the age exceeds the message lifetime, deactivates the slot.

## Parallelism

Returns `EntityTickingSystem.maybeUseParallel(archetypeChunkSize, taskCount)`.

## Inner Systems

Five concrete subclasses handle different message support component types:

### MessageSupportSystem.BeaconSystem

```java
public static class BeaconSystem extends MessageSupportSystem<BeaconSupport>
```

Ticks beacon message slots for inter-NPC beacon communication.

### MessageSupportSystem.NPCBlockEventSystem

```java
public static class NPCBlockEventSystem extends MessageSupportSystem<NPCBlockEventSupport>
```

Ticks block event messages from NPC sources.

### MessageSupportSystem.NPCEntityEventSystem

```java
public static class NPCEntityEventSystem extends MessageSupportSystem<NPCEntityEventSupport>
```

Ticks entity event messages from NPC sources.

### MessageSupportSystem.PlayerBlockEventSystem

```java
public static class PlayerBlockEventSystem extends MessageSupportSystem<PlayerBlockEventSupport>
```

Ticks block event messages from player sources.

### MessageSupportSystem.PlayerEntityEventSystem

```java
public static class PlayerEntityEventSystem extends MessageSupportSystem<PlayerEntityEventSupport>
```

Ticks entity event messages from player sources.

## Related Types

- [RoleBuilderSystem](RoleBuilderSystem.md) -- adds the message support components during role construction
- [BlackboardSystems](BlackboardSystems.md) -- blackboard views that generate the events these systems tick
