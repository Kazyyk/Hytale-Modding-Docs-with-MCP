---
title: "TreasureChestState"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.blockstates"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.blockstates.TreasureChestState"
api_surface: false
extends: "ItemContainerState"
implements: ["BreakValidatedBlockState"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectives"
  - "blockstates"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.blockstates`

```java
public class TreasureChestState extends ItemContainerState implements BreakValidatedBlockState
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<TreasureChestState>` | `CODEC` |
| `protected` | `UUID` | `objectiveUUID` |
| `protected` | `UUID` | `chestUUID` |
| `protected` | `boolean` | `opened` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `canOpen(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)` |
| `@Override public` | `boolean` | `canDestroy(Ref<EntityStore> playerRef, ComponentAccessor<EntityStore> componentAccessor)` |
| `@Override public` | `void` | `onOpen(Ref<EntityStore> ref, World world, Store<EntityStore> store)` |
| `public` | `void` | `setOpened(boolean opened)` |
| `public` | `void` | `setObjectiveData(UUID objectiveUUID, UUID chestUUID, List<ItemStack> itemStacks)` |
