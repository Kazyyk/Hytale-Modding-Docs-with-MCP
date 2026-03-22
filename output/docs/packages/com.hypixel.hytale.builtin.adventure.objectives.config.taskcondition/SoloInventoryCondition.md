---
title: "SoloInventoryCondition"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.taskcondition"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.taskcondition.SoloInventoryCondition"
api_surface: false
extends: "TaskConditionAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectives"
  - "config"
  - "taskcondition"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.config.taskcondition`

```java
public class SoloInventoryCondition extends TaskConditionAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<SoloInventoryCondition>` | `CODEC` |
| `protected` | `BlockTagOrItemIdField` | `blockTypeOrTagTask` |
| `protected` | `int` | `quantity` |
| `protected` | `boolean` | `consumeOnCompletion` |
| `protected` | `boolean` | `holdInHand` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `BlockTagOrItemIdField` | `getBlockTypeOrTagTask()` |
| `public` | `int` | `getQuantity()` |
| `public` | `boolean` | `isConsumeOnCompletion()` |
| `public` | `boolean` | `isHoldInHand()` |
| `@Override public` | `boolean` | `isConditionFulfilled(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Set<UUID> objectivePlayers)` |
| `@Override public` | `void` | `consumeCondition(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Set<UUID> objectivePlayers)` |
| `@Override public` | `boolean` | `equals(Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `@Nonnull @Override public` | `String` | `toString()` |
