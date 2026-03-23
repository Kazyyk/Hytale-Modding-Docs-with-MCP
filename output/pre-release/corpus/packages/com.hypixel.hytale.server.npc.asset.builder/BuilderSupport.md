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

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper (and 29 more)

Complete API:
  public BuilderManager getBuilderManager()
  public NPCEntity getEntity()
  public Holder<EntityStore> getHolder()
  public ExecutionContext getExecutionContext()
  public Builder<?> getParentSpawnable()
  public void setScope(Scope scope)
  public void setGlobalScope(Scope scope)
  public Scope getGlobalScope()
  public void setRequireLeashPosition()
  public int getFlagSlot(String name)
  public Timer getTimerByName(String name)
  public int getBeaconMessageSlot(String name)
  public int getTargetSlot(String name)
  public Alarm getAlarm(String name)
  public Object2IntMap<String> getTargetSlotMappings()
  public Int2ObjectMap<String> getTargetSlotToNameMap()
  public int getPositionSlot(String name)
  public int getParameterSlot(String name)
  public int getSearchRaySlot(String name)
  public Vector3d[] allocatePositionSlots()
  public boolean requiresLeashPosition()
  public StateEvaluator getStateEvaluator()
  public void setStateEvaluator(StateEvaluator stateEvaluator)
  public boolean[] allocateFlags()
  public Tickable[] allocateTimers()
  public Vector3d[] allocateSearchRayPositionSlots()
  public StdScope getSensorScope()
  public void setToNewComponent()
  public void addComponentLocalStateMachine(int defaultState)
  public int getComponentIndex()
  public void popComponent()
  public boolean hasComponentLocalStateMachines()
  public Int2IntMap getComponentLocalStateMachines()
  public void setLocalStateMachineAutoReset()
  public BitSet getLocalStateMachineAutoResetStates()
  public StateMappingHelper getStateHelper()
  public Object2IntMap<String> getBeaconSlotMappings()
  public boolean hasBlockEventSupport()
  public EventSlotMapper<BlockEventType> getPlayerBlockEventSlotMapper()
  public EventSlotMapper<BlockEventType> getNPCBlockEventSlotMapper()
  public boolean hasEntityEventSupport()
  public EventSlotMapper<EntityEventType> getPlayerEntityEventSlotMapper()
  public EventSlotMapper<EntityEventType> getNPCEntityEventSlotMapper()
  public int getInstructionSlot(String name)
  public void putInstruction(int slot, Instruction instruction)
  public Instruction[] getInstructionSlotMappings()
  public void setModifiedStateMap(StateMappingHelper helper, StatePair[] map)
  public StatePair getMappedStatePair(int index)
  public void popModifiedStateMap()
  public void requireBlockTypeBlackboard(int blockSet)
  public void registerBlockSensorResetAction(int blockSet)
  public boolean requiresBlockTypeBlackboard()
  public IntList getBlockTypeBlackboardBlockSets()
  public int getBlockEventSlot(BlockEventType type, int blockSet, double maxRange, boolean player)
  public IntSet getBlockChangeSets(BlockEventType type)
  public int getEntityEventSlot(EntityEventType type, int npcGroup, double maxRange, boolean player)
  public IntSet getEventNPCGroups(EntityEventType type)
  public void requireAttitudeOverrideMemory()
  public void trackInteractions()
  public boolean isTrackInteractions()
  public boolean requiresAttitudeOverrideMemory()
  public void setCurrentInstructionContext(InstructionType context)
  public InstructionType getCurrentInstructionContext()
  public ComponentContext getCurrentComponentContext()
  public void setCurrentComponentContext(ComponentContext currentComponentContext)
  public RoleStats getRoleStats()
  public int getNextAttackIndex()
  public int getValueStoreStringSlot(String name)
  public int getValueStoreIntSlot(String name)
  public int getValueStoreDoubleSlot(String name)
  public ValueStore.Builder getValueStoreBuilder()
  public String getCurrentStateName()
  public void pushCurrentStateName(String currentStateName)
  public void popCurrentStateName()
  private static Vector3d[] allocatePositionSlots(SlotMapper mapper)

Fields:
private final BuilderManager builderManager
private final NPCEntity npcEntity
private final Holder<EntityStore> holder
private final ExecutionContext executionContext
private boolean requireLeashPosition
private final SlotMapper flagSlotMapper
private final SlotMapper beaconSlotMapper
private final SlotMapper targetSlotMapper
private final SlotMapper positionSlotMapper
private final ReferenceSlotMapper<Timer> timerSlotMapper
private final SlotMapper searchRaySlotMapper
private final SlotMapper parameterSlotMapper
private final Object2IntMap<String> instructionSlotMappings
private final Int2ObjectMap<String> instructionNameMappings
private final List<Instruction> instructions
private EventSlotMapper<BlockEventType> playerBlockEventSlotMapper
private EventSlotMapper<BlockEventType> npcBlockEventSlotMapper
private EventSlotMapper<EntityEventType> playerEntityEventSlotMapper
private EventSlotMapper<EntityEventType> npcEntityEventSlotMapper
private Scope globalScope
private int currentComponentIndex
private IntStack componentIndexStack
private int componentIndexSource
private int currentAttackIndex
private Int2IntMap componentLocalStateMachines
private BitSet localStateMachineAutoResetStates
private final StateMappingHelper stateHelper
private List<Entry<StateMappingHelper,StatePair[]>> modifiedStateMap
private IntSet blackboardBlockSets
private IntSet blockSensorResetBlockSets
private boolean requiresAttitudeOverrideMemory
private boolean trackInteractions
private InstructionType currentInstructionContext
private ComponentContext currentComponentContext
private final StdScope sensorScope
private final Builder<?> roleBuilder
private final RoleStats roleStats
private StateEvaluator stateEvaluator
private ValueStore.Builder valueStoreBuilder
private final ArrayDeque<String> stateStack
