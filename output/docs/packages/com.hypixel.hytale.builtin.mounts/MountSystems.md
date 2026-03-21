---
title: "MountSystems"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.MountSystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public class MountSystems
```

Container class for entity-mount ECS systems. All systems are declared as static inner classes and registered by [MountPlugin.setup()](MountPlugin.md). Also contains a private static helper method `handleMountedRemoval` used by multiple systems to clean up mount relationships.

## Private Helper

### handleMountedRemoval

```java
private static void handleMountedRemoval(
    @Nonnull Ref<EntityStore> ref, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull MountedComponent component
)
```

Cleans up both sides of a mount relationship:
- If mounted to an entity, removes the passenger from the target's [MountedByComponent](MountedByComponent.md).
- If mounted to a block, removes the seated entity from the [BlockMountComponent](BlockMountComponent.md) and removes the component if no entities remain.

## Inner Classes

- [TrackerUpdate](MountSystems.TrackerUpdate.md) -- queues network updates for mounted entities
- [TrackerRemove](MountSystems.TrackerRemove.md) -- sends remove updates on dismount
- [TrackedMounted](MountSystems.TrackedMounted.md) -- maintains `MountedByComponent` passenger lists
- [PlayerMount](MountSystems.PlayerMount.md) -- sets mount IDs on player input
- [HandleMountInput](MountSystems.HandleMountInput.md) -- processes player movement while mounted
- [MountedEntityDeath](MountSystems.MountedEntityDeath.md) -- dismounts on death
- [TeleportMountedEntity](MountSystems.TeleportMountedEntity.md) -- dismounts on teleport
- [RemoveMounted](MountSystems.RemoveMounted.md) -- cleans up when mounted entity is removed
- [RemoveMountedBy](MountSystems.RemoveMountedBy.md) -- dismounts passengers when mount is removed
- [RemoveMountedHolder](MountSystems.RemoveMountedHolder.md) -- strips component from holder
- [RemoveBlockSeat](MountSystems.RemoveBlockSeat.md) -- dismounts on block seat removal
- [EnsureMinecartComponents](MountSystems.EnsureMinecartComponents.md) -- ensures minecart support components
- [OnMinecartHit](MountSystems.OnMinecartHit.md) -- handles minecart damage

## Related Types

- [MountPlugin](MountPlugin.md) -- registers all systems
- [NPCMountSystems](NPCMountSystems.md) -- NPC-specific mount systems
