---
title: "ObjectiveItemEntityRemovalSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.systems"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.systems.ObjectiveItemEntityRemovalSystem"
api_surface: false
extends: "HolderSystem"
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
public class ObjectiveItemEntityRemovalSystem extends HolderSystem
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `ComponentType<EntityStore,ItemComponent>` | `COMPONENT_TYPE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Query<EntityStore>` | `getQuery()` |
| `@Override public` | `void` | `onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)` |
| `@Override public` | `void` | `onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)` |
