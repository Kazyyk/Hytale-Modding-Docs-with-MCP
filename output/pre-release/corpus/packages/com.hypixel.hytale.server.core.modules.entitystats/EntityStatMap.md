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
