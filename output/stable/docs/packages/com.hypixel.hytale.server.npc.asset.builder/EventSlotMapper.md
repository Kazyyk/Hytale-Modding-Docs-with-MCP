---
title: "EventSlotMapper"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.EventSlotMapper"
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
public class EventSlotMapper<EventType extends Enum<EventType>>
```

Allocates integer slot indices for event observations during NPC role building. Each slot uniquely identifies a combination of event type and set identifier (e.g., a specific block set or NPC group). Also tracks the maximum observation range per slot.

## Type Parameters

| Parameter | Description |
|---|---|
| `EventType` | The enum type representing event categories (e.g., `BlockEventType`, `EntityEventType`). |

## Fields

| Field | Type | Description |
|---|---|---|
| `eventSets` | `Map<EventType, IntSet>` | Set IDs registered per event type. |
| `eventSlotMappings` | `Map<EventType, Int2IntMap>` | Set ID to slot index mapping per event type. |
| `eventSlotRanges` | `Int2DoubleMap` | Maximum observation range per slot. |
| `nextEventSlot` | `int` | Counter for allocating new slots. |

## Constructor

```java
public EventSlotMapper(Class<EventType> classType, EventType[] types)
```

## Methods

### getEventSets

```java
@Nonnull
public Map<EventType, IntSet> getEventSets()
```

### getEventSlotMappings

```java
@Nonnull
public Map<EventType, Int2IntMap> getEventSlotMappings()
```

### getEventSlotRanges

```java
@Nonnull
public Int2DoubleMap getEventSlotRanges()
```

### getEventSlotCount

```java
public int getEventSlotCount()
```

### getEventSlot

```java
public int getEventSlot(EventType type, int set, double maxRange)
```

Returns the slot for the given type and set, creating a new one if it does not exist. Updates the maximum range if the new range is larger.

## Related Types

- [BuilderSupport](BuilderSupport.md) -- owns block and entity event slot mappers
- [SlotMapper](SlotMapper.md) -- simpler name-to-slot mapper
