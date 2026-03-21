---
title: "BuilderEntityFilterHeightDifference"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders.BuilderEntityFilterHeightDifference"
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
public class BuilderEntityFilterHeightDifference extends BuilderEntityFilterBase
```

NPC entity filter builder: Matches entities within the given height range.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `double[]` | `DEFAULT_HEIGHT_DIFFERENCE_RANGE` | `new double[]{-Double.MAX_VALUE, Double.MAX_VALUE}` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `IEntityFilter` | `build(@Nonnull BuilderSupport builderSupport)` |
| `` | `return new` | `EntityFilterHeightDifference(this, builderSupport)` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Override public` | `Builder<IEntityFilter>` | `readConfig(@Nonnull JsonElement data)` |
| `` | `public double[]` | `getHeightDifference(@Nonnull BuilderSupport support)` |
| `` | `public boolean` | `isUseEyePosition(@Nonnull BuilderSupport support)` |
