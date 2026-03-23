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
