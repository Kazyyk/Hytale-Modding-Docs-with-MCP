---
title: "DamageDataSetupSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.damage"
fqcn: "com.hypixel.hytale.server.core.entity.damage.DamageDataSetupSystem"
api_surface: false
extends: "HolderSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "entity"
  - "damage"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.entity.damage`

```java
public class DamageDataSetupSystem extends HolderSystem
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ComponentType<EntityStore,DamageDataComponent>` | `damageDataComponentType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)` |
| `@Override public` | `void` | `onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)` |
| `@Nonnull @Override public` | `Query<EntityStore>` | `getQuery()` |
