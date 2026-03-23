---
title: "EntityStatMap"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.EntityStatMap"
api_surface: false
extends: ~
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:17:02Z"
tags:
  - "entity"
  - "stats"
  - "component"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats`

```java
public class EntityStatMap implements Component<EntityStore>
```

Manages the full set of entity stat values for a single entity. Provides operations for getting, setting, adding, subtracting, minimizing, maximizing, and resetting stat values by index. Supports stat modifiers via keyed `Modifier` instances and tracks network synchronization state for both self and other entity updates.

Stat changes are tracked as `EntityStatUpdate` lists per stat index, with separate channels for self-updates (sent to the owning player) and other-updates (sent to nearby players). Supports predictable stat operations for client-side prediction.

## Constants

| Field | Type | Value | Description |
|---|---|---|---|
| `VERSION` | `int` | `5` | Codec version for serialization. |

## Static Methods

| Method | Signature |
|---|---|
| `getComponentType` | `static ComponentType<EntityStore, EntityStatMap> getComponentType()` |
| `toPacket` | `static Int2ObjectMap<Modifier[]> toPacket(@Nullable Int2ObjectMap<StaticModifier[]> modifiers)` |

## Methods

| Method | Signature |
|---|---|
| `getStatModifiersManager` | `@Nonnull StatModifiersManager getStatModifiersManager()` |
| `size` | `int size()` |
| `get` | `@Nullable EntityStatValue get(int index)` |
| `get` | `@Deprecated @Nullable EntityStatValue get(String entityStat)` |
| `update` | `void update()` |
| `getModifier` | `@Nullable Modifier getModifier(int index, String key)` |
| `putModifier` | `@Nullable Modifier putModifier(int index, String key, Modifier modifier)` |
| `putModifier` | `@Nullable Modifier putModifier(Predictable predictable, int index, String key, Modifier modifier)` |
| `removeModifier` | `@Nullable Modifier removeModifier(int index, String key)` |
| `removeModifier` | `@Nullable Modifier removeModifier(Predictable predictable, int index, String key)` |
| `setStatValue` | `float setStatValue(int index, float newValue)` |
| `setStatValue` | `float setStatValue(Predictable predictable, int index, float newValue)` |
| `addStatValue` | `float addStatValue(int index, float amount)` |
| `addStatValue` | `float addStatValue(Predictable predictable, int index, float amount)` |
| `subtractStatValue` | `float subtractStatValue(int index, float amount)` |
| `subtractStatValue` | `float subtractStatValue(Predictable predictable, int index, float amount)` |
| `minimizeStatValue` | `float minimizeStatValue(int index)` |
| `minimizeStatValue` | `float minimizeStatValue(Predictable predictable, int index)` |
| `maximizeStatValue` | `float maximizeStatValue(int index)` |
| `maximizeStatValue` | `float maximizeStatValue(Predictable predictable, int index)` |
| `resetStatValue` | `float resetStatValue(int index)` |
| `resetStatValue` | `float resetStatValue(Predictable predictable, int index)` |
| `getSelfUpdates` | `@Nonnull Int2ObjectMap<List<EntityStatUpdate>> getSelfUpdates()` |
| `getSelfStatValues` | `@Nonnull Int2ObjectMap<FloatList> getSelfStatValues()` |
| `consumeSelfUpdates` | `@Nonnull Int2ObjectMap<EntityStatUpdate[]> consumeSelfUpdates()` |
| `clearUpdates` | `void clearUpdates()` |
| `consumeOtherUpdates` | `@Nonnull Int2ObjectMap<EntityStatUpdate[]> consumeOtherUpdates()` |
| `createInitUpdate` | `@Nonnull Int2ObjectMap<EntityStatUpdate[]> createInitUpdate(boolean all)` |
| `consumeSelfNetworkOutdated` | `boolean consumeSelfNetworkOutdated()` |
| `consumeNetworkOutdated` | `boolean consumeNetworkOutdated()` |
| `processStatChanges` | `void processStatChanges(Predictable predictable, @Nonnull Int2FloatMap entityStats, ValueType valueType, @Nonnull ChangeStatBehaviour changeStatBehaviour)` |
| `clone` | `@Nonnull EntityStatMap clone()` |

## Inner Types

- `EntityStatMap.Predictable` -- enum controlling prediction behavior (`NONE`, `SELF`, `ALL`)