---
title: "BuilderSupport"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderSupport"
api_surface: false
extends: ~
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public class BuilderSupport
```

The runtime context passed to builders during the `build()` phase. Provides access to the [BuilderManager](BuilderManager.md), the NPC entity being configured, the entity store holder, the expression execution context, and a comprehensive set of slot mappers for flags, beacons, targets, positions, timers, search rays, parameters, instructions, block events, and entity events.

This is the central coordination point during NPC role construction, connecting the builder system to the entity store, state machine, instruction tree, and event systems.

## Constructor

```java
public BuilderSupport(BuilderManager builderManager, @Nonnull NPCEntity npcEntity, Holder<EntityStore> holder, ExecutionContext executionContext, @Nonnull Builder<?> roleBuilder, RoleStats roleStats)
```

## Key Fields and Accessors

| Method | Returns | Description |
|---|---|---|
| `getBuilderManager()` | [BuilderManager](BuilderManager.md) | The builder manager. |
| `getEntity()` | `NPCEntity` | The NPC entity being built. |
| `getHolder()` | `Holder<EntityStore>` | The entity store holder. |
| `getExecutionContext()` | `ExecutionContext` | Expression execution context. |
| `getParentSpawnable()` | [Builder](Builder.md)`<?>` | The role builder. |
| `getRoleStats()` | `RoleStats` | Role statistics. |
| `getSensorScope()` | `StdScope` | Expression scope for sensor evaluation. |

## Slot Mappers

BuilderSupport maintains several [SlotMapper](SlotMapper.md) and [ReferenceSlotMapper](ReferenceSlotMapper.md) instances for allocating named slots:

| Slot Family | Method | Description |
|---|---|---|
| Flags | `getFlagSlot(String)` | Boolean flag slots. |
| Beacons | `getBeaconMessageSlot(String)` | Beacon message slots. |
| Targets | `getTargetSlot(String)` | Target entity slots (with name tracking). |
| Positions | `getPositionSlot(String)` | Vector3d position slots. |
| Timers | `getTimerByName(String)` | Named timer references. |
| Search Rays | `getSearchRaySlot(String)` | Search ray position slots. |
| Parameters | `getParameterSlot(String)` | Parameter slots. |

## Instruction Management

```java
public int getInstructionSlot(@Nullable String name)
public void putInstruction(int slot, Instruction instruction)
@Nonnull
public Instruction[] getInstructionSlotMappings()
```

Manages the instruction tree slot assignments. Instructions are allocated lazily and stored by slot index.

## Event Slot Mappers

```java
public int getBlockEventSlot(BlockEventType type, int blockSet, double maxRange, boolean player)
public int getEntityEventSlot(EntityEventType type, int npcGroup, double maxRange, boolean player)
```

Allocate event observation slots for block and entity events via [EventSlotMapper](EventSlotMapper.md) instances.

## State Management

```java
public void setModifiedStateMap(@Nonnull StateMappingHelper helper, @Nonnull StatePair[] map)
@Nonnull
public StatePair getMappedStatePair(int index)
public void popModifiedStateMap()
```

Manages the state mapping overlay stack for component state exports.

## Component Index Management

```java
public void setToNewComponent()
public int getComponentIndex()
public void popComponent()
public void addComponentLocalStateMachine(int defaultState)
```

Manages the component index stack for nested component building.

## Value Store

```java
public int getValueStoreStringSlot(String name)
public int getValueStoreIntSlot(String name)
public int getValueStoreDoubleSlot(String name)
public ValueStore.Builder getValueStoreBuilder()
```

Allocates named slots in the NPC's runtime value store.

## Related Types

- [BuilderManager](BuilderManager.md) -- the manager accessed via `getBuilderManager()`
- [Builder](Builder.md) -- receives this during `build()`
- [SlotMapper](SlotMapper.md) -- name-to-slot mapping
- [EventSlotMapper](EventSlotMapper.md) -- event slot allocation
- [StateMappingHelper](StateMappingHelper.md) -- state machine management
- [StatePair](StatePair.md) -- state pair mapping
