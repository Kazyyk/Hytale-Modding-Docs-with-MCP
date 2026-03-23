---
title: "KillTrackerSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcobjectives.systems"
fqcn: "com.hypixel.hytale.builtin.adventure.npcobjectives.systems.KillTrackerSystem"
api_surface: false
extends: "OnDeathSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "npcobjectives"
  - "systems"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.npcobjectives.systems`

```java
public class KillTrackerSystem extends OnDeathSystem
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ComponentType<EntityStore,NPCEntity>` | `npcEntityComponentType` |
| `private final` | `ResourceType<EntityStore,KillTrackerResource>` | `killTrackerResourceType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Query<EntityStore>` | `getQuery()` |
| `public` | `void` | `onComponentAdded(Ref<EntityStore> ref, DeathComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)` |
