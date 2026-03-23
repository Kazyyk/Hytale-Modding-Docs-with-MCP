---
title: "EventSupport"
kind: "class"
package: "com.hypixel.hytale.server.npc.components.messaging"
fqcn: "com.hypixel.hytale.server.npc.components.messaging.EventSupport"
api_surface: false
extends: "Enum<EventType>, NotificationType extends EventNotification> extends MessageSupport"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "components"
  - "messaging"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.components.messaging`

```java
public abstract class EventSupport<EventType extends Enum<EventType>, NotificationType extends EventNotification> extends MessageSupport
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected static final` | `double` | `EVENT_AGE` |
| `protected` | `EventMessage[]` | `messageSlots` |
| `protected` | `Map<EventType, Int2IntMap>` | `messageIndices` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `postMessage(EventType type, @Nonnull NotificationType notification, @Nonnull Ref<EntityStore> parent, @Nonnull Store<EntityStore> store)` |
| `@Nullable public` | `EventMessage` | `getMessageSlot(EventType type, @Nonnull NotificationType notification)` |
| `public` | `boolean` | `hasMatchingMessage(int messageIndex, @Nonnull Vector3d parentPosition, double range)` |
| `@Nullable public` | `Ref<EntityStore>` | `pollMessage(int messageIndex)` |
| `public` | `void` | `initialise(Map<EventType, Int2IntMap> setIndices, @Nonnull Int2DoubleMap messageRanges, int count)` |
| `public` | `void` | `cloneTo(@Nonnull EventSupport<EventType, NotificationType> other)` |
| `@Override public` | `NPCMessage[]` | `getMessageSlots()` |
