---
title: "InteractionView"
kind: "class"
package: "com.hypixel.hytale.server.npc.blackboard.view.interaction"
fqcn: "com.hypixel.hytale.server.npc.blackboard.view.interaction.InteractionView"
api_surface: false
extends: "PrioritisedProviderView"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "blackboard"
  - "view"
  - "interaction"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.blackboard.view.interaction`

```java
public class InteractionView extends PrioritisedProviderView
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `World` | `world` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `isOutdated(Ref<EntityStore> ref, Store<EntityStore> store)` |
| `public` | `InteractionView` | `getUpdatedView(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)` |
| `@Override public` | `void` | `initialiseEntity(Ref<EntityStore> ref, NPCEntity npcComponent)` |
| `@Override public` | `void` | `cleanup()` |
| `@Override public` | `void` | `onWorldRemoved()` |
| `@Nonnull public` | `ReservationStatus` | `getReservationStatus(Ref<EntityStore> npcRef, Ref<EntityStore> playerRef, ComponentAccessor<EntityStore> componentAccessor)` |
