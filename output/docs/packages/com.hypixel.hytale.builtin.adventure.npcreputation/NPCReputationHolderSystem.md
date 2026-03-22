---
title: "NPCReputationHolderSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcreputation"
fqcn: "com.hypixel.hytale.builtin.adventure.npcreputation.NPCReputationHolderSystem"
api_surface: false
extends: "HolderSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "npcreputation"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.npcreputation`

```java
public class NPCReputationHolderSystem extends HolderSystem
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ComponentType<EntityStore,ReputationGroupComponent>` | `reputationGroupComponentType` |
| `private final` | `ComponentType<EntityStore,NPCEntity>` | `npcEntityComponentType` |
| `private final` | `Query<EntityStore>` | `query` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Query<EntityStore>` | `getQuery()` |
| `@Override public` | `void` | `onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)` |
| `@Override public` | `void` | `onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)` |
