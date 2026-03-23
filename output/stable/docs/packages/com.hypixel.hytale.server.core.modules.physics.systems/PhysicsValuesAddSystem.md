---
title: "PhysicsValuesAddSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.physics.systems"
fqcn: "com.hypixel.hytale.server.core.modules.physics.systems.PhysicsValuesAddSystem"
api_surface: false
extends: "HolderSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "physics"
  - "systems"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.physics.systems`

```java
public class PhysicsValuesAddSystem extends HolderSystem
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ComponentType<EntityStore,PhysicsValues>` | `physicsValuesComponentType` |
| `private final` | `Query<EntityStore>` | `query` |
| `private final` | `Set<Dependency<EntityStore>>` | `dependencies` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Set<Dependency<EntityStore>>` | `getDependencies()` |
| `@Override public` | `void` | `onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)` |
| `@Override public` | `void` | `onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)` |
| `@Nonnull @Override public` | `Query<EntityStore>` | `getQuery()` |
