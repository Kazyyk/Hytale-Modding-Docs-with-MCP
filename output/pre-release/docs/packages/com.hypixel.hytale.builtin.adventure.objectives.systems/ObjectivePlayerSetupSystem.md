---
title: "ObjectivePlayerSetupSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.systems"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.systems.ObjectivePlayerSetupSystem"
api_surface: false
extends: "RefSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectives"
  - "systems"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.systems`

```java
public class ObjectivePlayerSetupSystem extends RefSystem
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ComponentType<EntityStore,ObjectiveHistoryComponent>` | `objectiveHistoryComponentType` |
| `private final` | `ComponentType<EntityStore,Player>` | `playerComponentType` |
| `private final` | `ComponentType<EntityStore,UUIDComponent>` | `uuidComponentType` |
| `private final` | `Query<EntityStore>` | `query` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Query<EntityStore>` | `getQuery()` |
| `@Override public` | `void` | `onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)` |
| `@Override public` | `void` | `onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)` |
