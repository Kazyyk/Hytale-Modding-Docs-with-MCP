---
title: "DeleteCursedItemsOnSpawnSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.portals.systems.curse"
fqcn: "com.hypixel.hytale.builtin.portals.systems.curse.DeleteCursedItemsOnSpawnSystem"
api_surface: false
extends: "RefSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "portals"
  - "systems"
  - "curse"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.portals.systems.curse`

```java
public class DeleteCursedItemsOnSpawnSystem extends RefSystem
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)` |
| `@Override public` | `void` | `onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)` |
| `@Nullable @Override public` | `Query<EntityStore>` | `getQuery()` |
