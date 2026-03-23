---
title: "SlotMapper"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.SlotMapper"
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
public class SlotMapper
```

Maps string names to sequential integer slot indices. Used extensively by [BuilderSupport](BuilderSupport.md) to allocate named slots for flags, beacons, targets, positions, search rays, and parameters during NPC role building. Optionally tracks a reverse mapping from slot index to name.

## Constants

| Constant | Type | Value |
|---|---|---|
| `NO_SLOT` | `int` | `Integer.MIN_VALUE` |

## Constructors

```java
public SlotMapper()
public SlotMapper(boolean trackNames)
```

## Methods

### getSlot

```java
public int getSlot(String name)
```

Returns the slot index for the given name, creating a new slot if the name has not been seen before.

### slotCount

```java
public int slotCount()
```

Returns the total number of allocated slots.

### getSlotMappings

```java
@Nullable
public Object2IntMap<String> getSlotMappings()
```

Returns the name-to-slot map, or `null` if empty.

### getNameMap

```java
@Nullable
public Int2ObjectMap<String> getNameMap()
```

Returns the slot-to-name reverse map, or `null` if name tracking is disabled.

## Related Types

- [ReferenceSlotMapper](ReferenceSlotMapper.md) -- extends this with reference objects
- [BuilderSupport](BuilderSupport.md) -- uses multiple instances
