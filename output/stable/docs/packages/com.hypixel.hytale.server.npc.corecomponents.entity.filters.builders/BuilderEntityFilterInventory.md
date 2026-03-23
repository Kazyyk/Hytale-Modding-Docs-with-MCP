---
title: "BuilderEntityFilterInventory"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders.BuilderEntityFilterInventory"
api_surface: false
extends: "BuilderEntityFilterBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "entity"
  - "filters"
  - "builders"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders`

```java
public class BuilderEntityFilterInventory extends BuilderEntityFilterBase
```

NPC entity filter builder: Test various conditions relating to entity inventory.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int[]` | `DEFAULT_FREE_SLOT_RANGE` | `new int[]{0, Integer.MAX_VALUE}` |
| `public static final` | `int[]` | `DEFAULT_ITEM_COUNT_RANGE` | `new int[]{1, Integer.MAX_VALUE}` |
| `public static final` | `String[]` | `DEFAULT_ITEM_PATTERNS` | `new String[]{"*"}` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `IEntityFilter` | `build(@Nonnull BuilderSupport builderSupport)` |
| `` | `return new` | `EntityFilterInventory(this, builderSupport)` |
| `@Override public` | `Builder<IEntityFilter>` | `readConfig(@Nonnull JsonElement data)` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nullable public` | `String[]` | `getItems(@Nonnull BuilderSupport support)` |
| `` | `public int[]` | `getCount(@Nonnull BuilderSupport support)` |
| `` | `public int[]` | `getFreeSlotsRange(@Nonnull BuilderSupport support)` |
