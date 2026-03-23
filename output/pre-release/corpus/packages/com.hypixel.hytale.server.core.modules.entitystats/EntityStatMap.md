# EntityStatMap

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats | Implements: Component<EntityStore>

public class EntityStatMap implements Component<EntityStore>

Manages the full set of entity stat values for a single entity. Provides operations for getting, setting, adding, subtracting, minimizing, maximizing, and resetting stat values by index. Supports stat modifiers via keyed `Modifier` instances and tracks network synchronization state for both self and other entity updates.

Stat changes are tracked as `EntityStatUpdate` lists per stat index, with separate channels for self-updates (sent to the owning player) and other-updates (sent to nearby players). Supports predictable stat operations for client-side prediction.

## Constants

- VERSION | int | 5 | Codec version for serialization.

## Static Methods

- static ComponentType<EntityStore, EntityStatMap> getComponentType()
- static Int2ObjectMap<Modifier[]> toPacket(@Nullable Int2ObjectMap<StaticModifier[]> modifiers)

## Methods

- @Nonnull StatModifiersManager getStatModifiersManager()
- int size()
- @Nullable EntityStatValue get(int index)
- @Deprecated @Nullable EntityStatValue get(String entityStat)
- void update()
- @Nullable Modifier getModifier(int index, String key)
- @Nullable Modifier putModifier(int index, String key, Modifier modifier)
- @Nullable Modifier putModifier(Predictable predictable, int index, String key, Modifier modifier)
- @Nullable Modifier removeModifier(int index, String key)
- @Nullable Modifier removeModifier(Predictable predictable, int index, String key)
- float setStatValue(int index, float newValue)
- float setStatValue(Predictable predictable, int index, float newValue)
- float addStatValue(int index, float amount)
- float addStatValue(Predictable predictable, int index, float amount)
- float subtractStatValue(int index, float amount)
- float subtractStatValue(Predictable predictable, int index, float amount)
- float minimizeStatValue(int index)
- float minimizeStatValue(Predictable predictable, int index)
- float maximizeStatValue(int index)
- float maximizeStatValue(Predictable predictable, int index)
- float resetStatValue(int index)
- float resetStatValue(Predictable predictable, int index)
- @Nonnull Int2ObjectMap<List<EntityStatUpdate>> getSelfUpdates()
- @Nonnull Int2ObjectMap<FloatList> getSelfStatValues()
- @Nonnull Int2ObjectMap<EntityStatUpdate[]> consumeSelfUpdates()
- void clearUpdates()
- @Nonnull Int2ObjectMap<EntityStatUpdate[]> consumeOtherUpdates()
- @Nonnull Int2ObjectMap<EntityStatUpdate[]> createInitUpdate(boolean all)
- boolean consumeSelfNetworkOutdated()
- boolean consumeNetworkOutdated()
- void processStatChanges(Predictable predictable, @Nonnull Int2FloatMap entityStats, ValueType valueType, @Nonnull ChangeStatBehaviour changeStatBehaviour)
- @Nonnull EntityStatMap clone()

## Inner Types

- `EntityStatMap.Predictable` -- enum controlling prediction behavior (`NONE`, `SELF`, `ALL`)

Also in this package: Changes, ClearChanges, EntityStatValue, EntityStatsModule, EntityStatsSystems, EntityTrackerRemove, EntityTrackerUpdate, PlayerRegenerateStatsSystem, Predictable, Recalculate, Regenerate, RegeneratingValue, Setup, StatModifyingSystem

Complete API:
  public static ComponentType<EntityStore,EntityStatMap> getComponentType()
  public StatModifiersManager getStatModifiersManager()
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
private final StatModifiersManager statModifiersManager
private Map<String,EntityStatValue> unknown
private EntityStatValue[] values
float[] tempRegenerationValues
public final Int2ObjectMap<List<EntityStatUpdate>> selfUpdates
public final Int2ObjectMap<FloatList> selfStatValues
public final Int2ObjectMap<List<EntityStatUpdate>> otherUpdates
protected boolean isSelfNetworkOutdated
protected boolean isNetworkOutdated
