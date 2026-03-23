---
title: "MountPlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.MountPlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public class MountPlugin extends JavaPlugin
```

The main plugin class for the mount system. Registers all mount-related ECS components, systems, commands, interactions, and packet handlers. Maintains a static singleton instance used by components to resolve their `ComponentType` references.

## Singleton Access

```java
public static MountPlugin getInstance()
```

Returns the singleton `MountPlugin` instance. Set during `setup()`.

## Constructor

```java
public MountPlugin(@Nonnull JavaPluginInit init)
```

Delegates to `JavaPlugin(init)`.

## Component Type Accessors

| Method | Returns |
|---|---|
| `getBlockMountComponentType()` | `ComponentType<ChunkStore, BlockMountComponent>` |
| `getMountComponentType()` | `ComponentType<EntityStore, NPCMountComponent>` |
| `getMountedComponentType()` | `ComponentType<EntityStore, MountedComponent>` |
| `getMountedByComponentType()` | `ComponentType<EntityStore, MountedByComponent>` |
| `getMinecartComponentType()` | `ComponentType<EntityStore, MinecartComponent>` |

## Setup

During `setup()`, the plugin performs the following registrations in order:

1. **ChunkStore component:** [BlockMountComponent](BlockMountComponent.md) on the chunk store registry.
2. **NPC core component:** Registers `"Mount"` via `NPCPlugin.get().registerCoreComponentType()` with [BuilderActionMount](BuilderActionMount.md).
3. **EntityStore components:**
   - [NPCMountComponent](NPCMountComponent.md) with codec key `"Mount"`.
   - [MountedComponent](MountedComponent.md) (no default constructor -- throws `UnsupportedOperationException`).
   - [MountedByComponent](MountedByComponent.md).
   - [MinecartComponent](MinecartComponent.md) with codec key `"Minecart"`.
4. **EntityStore systems:** All systems from [MountSystems](MountSystems.md) and [NPCMountSystems](NPCMountSystems.md).
5. **ChunkStore system:** [MountSystems.RemoveBlockSeat](MountSystems.RemoveBlockSeat.md).
6. **Packet handler:** [MountGamePacketHandler](MountGamePacketHandler.md) via `ServerManager`.
7. **Command:** [MountCommand](MountCommand.md) (`/mount`).
8. **Interactions:** `"SpawnMinecart"`, `"Mount"`, and `"Seating"` registered on `Interaction.CODEC`.

## Static Utility Methods

### checkDismountNpc

```java
public static void checkDismountNpc(@Nonnull ComponentAccessor<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull Player playerComponent)
```

Checks if the player has a non-zero mount entity ID and, if so, initiates NPC dismount by resetting the mount's role and the player's movement settings.

### resetOriginalPlayerMovementSettings

```java
public static void resetOriginalPlayerMovementSettings(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> store)
```

Sends a `DismountNPC` packet to the player client and resets the player's `MovementManager` to default settings. Called when dismounting from an NPC mount.

## Related Types

- [MountSystems](MountSystems.md) -- entity mount ECS systems
- [NPCMountSystems](NPCMountSystems.md) -- NPC-specific mount ECS systems
- [MountCommand](MountCommand.md) -- `/mount` command collection
- [MountGamePacketHandler](MountGamePacketHandler.md) -- dismount packet handler
