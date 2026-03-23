# EntityStatMap

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats | Implements: Component<EntityStore>

public class EntityStatMap implements Component<EntityStore>

ECS component that stores all entity stat values for a single entity. Manages an indexed array of EntityStatValue instances, supports modifier application and removal, and tracks network-synchronization state for both self and other viewers. Stat changes are recorded as `EntityStatUpdate` entries that are consumed by the entity tracker system for client replication.

## Static Fields

- VERSION | int | Codec version, currently `5`.
- CODEC | BuilderCodec<EntityStatMap> | Serialization codec for persistence.

## Methods

- getComponentType() | ComponentType<EntityStore, EntityStatMap> | Returns the registered component type via `EntityStatsModule`.
- size() | int | Returns the number of stat value slots.
- get(int index) | EntityStatValue | Returns the stat value at the given index, or `null` if out of bounds.
- get(String entityStat) | EntityStatValue | **Deprecated.** Looks up a stat by name via the asset map.
- update() | void | Synchronizes all stat values against the current `EntityStatType` asset map, expanding the array and resolving unknown stats.
- getModifier(int index, String key) | Modifier | Returns the modifier with the given key on the stat at `index`.
- putModifier(int index, String key, Modifier modifier) | Modifier | Adds or replaces a modifier, returning the previous one. Records a `PutModifier` network update.
- putModifier(Predictable, int, String, Modifier) | Modifier | Predictable variant of `putModifier`.
- removeModifier(int index, String key) | Modifier | Removes a modifier by key. Records a `RemoveModifier` network update.
- removeModifier(Predictable, int, String) | Modifier | Predictable variant of `removeModifier`.
- setStatValue(int index, float newValue) | float | Sets a stat to the given value (clamped to min/max), returning the clamped result.
- addStatValue(int index, float amount) | float | Adds to a stat value, returning the clamped result.
- subtractStatValue(int index, float amount) | float | Subtracts from a stat value (delegates to `addStatValue` with negation).
- minimizeStatValue(int index) | float | Sets the stat to its minimum value.
- maximizeStatValue(int index) | float | Sets the stat to its maximum value.
- resetStatValue(int index) | float | Resets the stat per its `EntityStatResetBehavior` (initial value or max).
- processStatChanges(Predictable, Int2FloatMap, ValueType, ChangeStatBehaviour) | void | Batch-processes stat changes with optional percent-of-range calculation.
- consumeSelfUpdates() | Int2ObjectMap<EntityStatUpdate[]> | Consumes and returns pending self-viewer updates.
- consumeOtherUpdates() | Int2ObjectMap<EntityStatUpdate[]> | Consumes and returns pending other-viewer updates.
- clearUpdates() | void | Clears all pending update lists.
- createInitUpdate(boolean all) | Int2ObjectMap<EntityStatUpdate[]> | Creates a full initialization update for newly visible entities.
- clone() | EntityStatMap | Deep-clones this stat map including all values, modifiers, and pending updates.
- toPacket(Int2ObjectMap<StaticModifier[]>) | Int2ObjectMap<Modifier[]> | Static helper converting server-side modifier arrays to protocol format.

## Inner Types

- EntityStatMap.Predictable

## Related Types

- EntityStatValue -- individual stat entries stored in this map
- EntityStatsModule -- module that registers this component
- EntityStatsSystems -- ECS systems operating on this component
- `Modifier` -- base modifier type applied to stat values

Also in this package: Changes, ClearChanges, EntityStatValue, EntityStatsModule, EntityStatsSystems, EntityTrackerRemove, EntityTrackerUpdate, PlayerRegenerateStatsSystem, Predictable, Recalculate, Regenerate, RegeneratingValue, Setup, StatModifyingSystem

Complete API:
  public static ComponentType<EntityStore,EntityStatMap> getComponentType()
  public int size()
  public EntityStatValue get(int index)
  public EntityStatValue get(String entityStat)
  public void update()
  public Modifier getModifier(int index, String key)
  public Modifier putModifier(int index, String key, Modifier modifier)
  public Modifier putModifier(EntityStatMap.Predictable predictable, int index, String key, Modifier modifier)
  public Modifier removeModifier(int index, String key)
  public Modifier removeModifier(EntityStatMap.Predictable predictable, int index, String key)
  public float setStatValue(int index, float newValue)
  public float setStatValue(EntityStatMap.Predictable predictable, int index, float newValue)
  public float addStatValue(int index, float amount)
  public float addStatValue(EntityStatMap.Predictable predictable, int index, float amount)
  public float subtractStatValue(int index, float amount)
  public float subtractStatValue(EntityStatMap.Predictable predictable, int index, float amount)
  public float minimizeStatValue(int index)
  public float minimizeStatValue(EntityStatMap.Predictable predictable, int index)
  public float maximizeStatValue(int index)
  public float maximizeStatValue(EntityStatMap.Predictable predictable, int index)
  public float resetStatValue(int index)
  public float resetStatValue(EntityStatMap.Predictable predictable, int index)
  public Int2ObjectMap<List<EntityStatUpdate>> getSelfUpdates()
  public Int2ObjectMap<FloatList> getSelfStatValues()
  public Int2ObjectMap<EntityStatUpdate[]> consumeSelfUpdates()
  public void clearUpdates()
  public Int2ObjectMap<EntityStatUpdate[]> consumeOtherUpdates()
  private Int2ObjectOpenHashMap<EntityStatUpdate[]> updatesToProtocol(Int2ObjectMap<List<EntityStatUpdate>> localUpdates)
  public Int2ObjectMap<EntityStatUpdate[]> createInitUpdate(boolean all)
  public boolean consumeSelfNetworkOutdated()
  public boolean consumeNetworkOutdated()
  private void addInitChange(int index, EntityStatValue value)
  private void addChange(EntityStatMap.Predictable predictable, int index, EntityStatOp op, float previousValue, float value)
  private void addChange(EntityStatMap.Predictable predictable, int index, EntityStatOp op, float previousValue, float value, Map<String,Modifier> modifierMap)
  private void addChange(EntityStatMap.Predictable predictable, int index, EntityStatOp op, float previousValue, String key, Modifier modifier)
  private boolean tryMergeUpdate(List<EntityStatUpdate> updates, EntityStatOp op, float value, Map<String,Modifier> modifierMap, boolean isPredictable)
  public void processStatChanges(EntityStatMap.Predictable predictable, Int2FloatMap entityStats, ValueType valueType, ChangeStatBehaviour changeStatBehaviour)
  public String toString()
  public EntityStatMap clone()
  private static EntityStatUpdate makeInitChange(EntityStatValue value)
  public static Int2ObjectMap<com.hypixel.hytale.protocol.Modifier[]> toPacket(Int2ObjectMap<StaticModifier[]> modifiers)

Fields:
public static final int VERSION
public static final BuilderCodec<EntityStatMap> CODEC
private Map<String,EntityStatValue> unknown
private EntityStatValue[] values
float[] tempRegenerationValues
public final Int2ObjectMap<List<EntityStatUpdate>> selfUpdates
public final Int2ObjectMap<FloatList> selfStatValues
public final Int2ObjectMap<List<EntityStatUpdate>> otherUpdates
protected boolean isSelfNetworkOutdated
protected boolean isNetworkOutdated
