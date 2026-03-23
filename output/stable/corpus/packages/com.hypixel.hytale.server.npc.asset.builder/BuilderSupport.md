# BuilderSupport

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder

public class BuilderSupport

The runtime context passed to builders during the `build()` phase. Provides access to the BuilderManager, the NPC entity being configured, the entity store holder, the expression execution context, and a comprehensive set of slot mappers for flags, beacons, targets, positions, timers, search rays, parameters, instructions, block events, and entity events.

This is the central coordination point during NPC role construction, connecting the builder system to the entity store, state machine, instruction tree, and event systems.

## Constructor


public BuilderSupport(BuilderManager builderManager, @Nonnull NPCEntity npcEntity, Holder<EntityStore> holder, ExecutionContext executionContext, @Nonnull Builder<?> roleBuilder, RoleStats roleStats)

## Key Fields and Accessors

- getBuilderManager() | BuilderManager | The builder manager.
- getEntity() | NPCEntity | The NPC entity being built.
- getHolder() | Holder<EntityStore> | The entity store holder.
- getExecutionContext() | ExecutionContext | Expression execution context.
- getParentSpawnable() | Builder`<?> | The role builder.
- getRoleStats() | RoleStats | Role statistics.
- getSensorScope() | StdScope | Expression scope for sensor evaluation.

## Slot Mappers

BuilderSupport maintains several SlotMapper and ReferenceSlotMapper instances for allocating named slots:

- Flags | getFlagSlot(String) | Boolean flag slots.
- Beacons | getBeaconMessageSlot(String) | Beacon message slots.
- Targets | getTargetSlot(String) | Target entity slots (with name tracking).
- Positions | getPositionSlot(String) | Vector3d position slots.
- Timers | getTimerByName(String) | Named timer references.
- Search Rays | getSearchRaySlot(String) | Search ray position slots.
- Parameters | getParameterSlot(String) | Parameter slots.

## Instruction Management


public int getInstructionSlot(@Nullable String name)
public void putInstruction(int slot, Instruction instruction)
@Nonnull
public Instruction[] getInstructionSlotMappings()

Manages the instruction tree slot assignments. Instructions are allocated lazily and stored by slot index.

## Event Slot Mappers


public int getBlockEventSlot(BlockEventType type, int blockSet, double maxRange, boolean player)
public int getEntityEventSlot(EntityEventType type, int npcGroup, double maxRange, boolean player)

Allocate event observation slots for block and entity events via EventSlotMapper instances.

## State Management


public void setModifiedStateMap(@Nonnull StateMappingHelper helper, @Nonnull StatePair[] map)
@Nonnull
public StatePair getMappedStatePair(int index)
public void popModifiedStateMap()

Manages the state mapping overlay stack for component state exports.

## Component Index Management


public void setToNewComponent()
public int getComponentIndex()
public void popComponent()
public void addComponentLocalStateMachine(int defaultState)

Manages the component index stack for nested component building.

## Value Store


public int getValueStoreStringSlot(String name)
public int getValueStoreIntSlot(String name)
public int getValueStoreDoubleSlot(String name)
public ValueStore.Builder getValueStoreBuilder()

Allocates named slots in the NPC's runtime value store.

## Related Types

- BuilderManager -- the manager accessed via `getBuilderManager()`
- Builder -- receives this during `build()`
- SlotMapper -- name-to-slot mapping
- EventSlotMapper -- event slot allocation
- StateMappingHelper -- state machine management
- StatePair -- state pair mapping
