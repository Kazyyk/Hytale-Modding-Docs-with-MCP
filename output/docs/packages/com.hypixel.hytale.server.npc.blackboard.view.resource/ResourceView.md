---
title: "ResourceView"
kind: "class"
package: "com.hypixel.hytale.server.npc.blackboard.view.resource"
fqcn: "com.hypixel.hytale.server.npc.blackboard.view.resource.ResourceView"
api_surface: false
extends: "BlockRegionView"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "blackboard"
  - "view"
  - "resource"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.blackboard.view.resource`

```java
public class ResourceView extends BlockRegionView
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `long` | `index` |
| `private final` | `IntSet[]` | `reservationsBySection` |
| `private final` | `Map<Ref<EntityStore>,ResourceView.BlockReservation>` | `reservationsByEntity` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `isOutdated(Ref<EntityStore> ref, Store<EntityStore> store)` |
| `@Nonnull public` | `ResourceView` | `getUpdatedView(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)` |
| `@Override public` | `void` | `initialiseEntity(Ref<EntityStore> ref, NPCEntity npcComponent)` |
| `@Override public` | `void` | `cleanup()` |
| `@Override public` | `void` | `onWorldRemoved()` |
| `public` | `boolean` | `isBlockReserved(int x, int y, int z)` |
| `public` | `void` | `reserveBlock(NPCEntity entity, int x, int y, int z)` |
| `public` | `void` | `clearReservation(Ref<EntityStore> ref)` |
| `public` | `long` | `getIndex()` |
| `@Nonnull public` | `Map<Ref<EntityStore>,ResourceView.BlockReservation>` | `getReservationsByEntity()` |

## Inner Types

- `ResourceView.BlockReservation`
