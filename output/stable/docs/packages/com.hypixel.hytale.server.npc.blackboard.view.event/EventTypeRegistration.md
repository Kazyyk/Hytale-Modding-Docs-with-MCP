---
title: "EventTypeRegistration"
kind: "class"
package: "com.hypixel.hytale.server.npc.blackboard.view.event"
fqcn: "com.hypixel.hytale.server.npc.blackboard.view.event.EventTypeRegistration"
api_surface: false
extends: "Enum<EventType>, NotificationType extends EventNotification>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
  - "blackboard"
---

**Package:** `com.hypixel.hytale.server.npc.blackboard.view.event`

```java
public class EventTypeRegistration<EventType extends Enum<EventType>, NotificationType extends EventNotification>
```

Concrete implementation extending `Enum<EventType>, NotificationType extends EventNotification>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `type` | `EventType` | final EventType field. |
| `setTester` | `BiIntPredicate` | final BiIntPredicate field. |
| `eventCallback` | `IEventCallback<EventType, NotificationType>` | final IEventCallback<EventType, NotificationType> field. |

## Constructors

| Constructor | Description |
|---|---|
| `EventTypeRegistration(EventType type, BiIntPredicate setTester, IEventCallback<EventType, NotificationType> eventCallback)` | Creates a new EventTypeRegistration instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `initialiseEntity(Ref<EntityStore> ref, @Nonnull IntSet changeSets)` | `void` | public method. |
| `getSetCount()` | `int` | public method. |
| `forEach(@Nonnull IntObjectConsumer<EventType> setConsumer, @Nonnull Consumer<Ref<EntityStore>> npcConsumer)` | `void` | public method. |
| `cleanup()` | `void` | public method. |
