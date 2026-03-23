---
title: "EntityEventView"
kind: "class"
package: "com.hypixel.hytale.server.npc.blackboard.view.event.entity"
fqcn: "com.hypixel.hytale.server.npc.blackboard.view.event.entity.EntityEventView"
api_surface: false
extends: "EventView"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "blackboard"
  - "view"
  - "event"
  - "entity"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.blackboard.view.event.entity`

```java
public class EntityEventView extends EventView
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `EntityEventView` | `getUpdatedView(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)` |
| `@Override public` | `void` | `initialiseEntity(Ref<EntityStore> ref, NPCEntity npcComponent)` |
| `protected` | `void` | `onEvent(int senderTypeId, double x, double y, double z, Ref<EntityStore> initiator, Ref<EntityStore> skip, ComponentAccessor<EntityStore> componentAccessor, EntityEventType type)` |
| `private` | `void` | `onPlayerInteraction(PlayerInteractEvent event)` |
| `public` | `void` | `processAttackedEvent(Ref<EntityStore> victim, Ref<EntityStore> attacker, ComponentAccessor<EntityStore> componentAccessor, EntityEventType eventType)` |
