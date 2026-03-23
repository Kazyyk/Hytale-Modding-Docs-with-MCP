---
title: "BenchState"
kind: "class"
package: "com.hypixel.hytale.builtin.crafting.state"
fqcn: "com.hypixel.hytale.builtin.crafting.state.BenchState"
api_surface: false
extends: "BlockState"
implements:
  - "DestroyableBlockState"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "crafting"
  - "state"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.crafting.state`

```java
public class BenchState extends BlockState implements DestroyableBlockState
```

Block state that stores per-block-position data in the world.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static` | `BuilderCodec<BenchState>` | `CODEC` |
| `private` | `int` | `tierLevel` |
| `protected` | `ItemStack[]` | `upgradeItems` |
| `protected` | `Bench` | `bench` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public int` | `getTierLevel()` |
| `@Override public` | `boolean` | `initialize(@Nonnull BlockType blockType)` |
| `` | `public void` | `addUpgradeItems(@Nonnull List<ItemStack> consumed)` |
| `` | `private void` | `dropUpgradeItems()` |
| `` | `public Bench` | `getBench()` |
| `` | `public void` | `setTierLevel(int newTierLevel)` |
| `` | `public BenchUpgradeRequirement` | `getNextLevelUpgradeMaterials()` |
| `` | `protected void` | `onTierLevelChange()` |
| `@Nonnull public` | `BlockType` | `getBaseBlockType()` |
| `@Nonnull public` | `String` | `getTierStateName()` |
| `@Override public` | `void` | `onDestroy()` |
| `@Nonnull public` | `Map<UUID, BenchWindow>` | `getWindows()` |
