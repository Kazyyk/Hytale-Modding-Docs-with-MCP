---
title: "EventView"
kind: "class"
package: "com.hypixel.hytale.server.npc.blackboard.view.event"
fqcn: "com.hypixel.hytale.server.npc.blackboard.view.event.EventView"
api_surface: false
extends: "IBlackboardView<ViewType>, EventType extends Enum<EventType>, NotificationType extends EventNotification>"
implements: 
  - "IBlackboardView<ViewType>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
  - "blackboard"
---

**Package:** `com.hypixel.hytale.server.npc.blackboard.view.event`

```java
public abstract class EventView<ViewType extends IBlackboardView<ViewType>, EventType extends Enum<EventType>, NotificationType extends EventNotification> implements IBlackboardView<ViewType>
```

Class in the event subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `entityMapsByEventType` | `Map<EventType, EventTypeRegistration<EventType, NotificationType>>` | final Map<EventType, EventTypeRegistration<EventType, NotificationType>> field. |
| `world` | `World` | final World field. |
| `eventTypes` | `EventType[]` | final EventType[] field. |
| `eventRegistry` | `EventRegistry` | EventRegistry field. |
| `entityStoreRegistry` | `ComponentRegistryProxy<EntityStore>` | ComponentRegistryProxy<EntityStore> field. |
| `shutdown` | `boolean` | boolean field. |
| `reusableEventNotification` | `NotificationType` | final NotificationType field. |

## Constructors

| Constructor | Description |
|---|---|
| `EventView(Class<EventType> type, EventType[] eventTypes, NotificationType reusableEventNotification, @Nonnull World world)` | Creates a new EventView instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `isOutdated(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)` | `boolean` | public method. |
| `onWorldRemoved()` | `void` | public method. |
| `cleanup()` | `void` | public method. |
| `getSetCount()` | `int` | public method. |
| `forEach(@Nonnull IntObjectConsumer<EventType> setConsumer, @Nonnull Consumer<Ref<EntityStore>> npcConsumer)` | `void` | public method. |
