---
title: "BuilderEntityFilterCombat"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders.BuilderEntityFilterCombat"
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
public class BuilderEntityFilterCombat extends BuilderEntityFilterBase
```

NPC entity filter builder: Check the target's combat state.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `double` | `MAX_ELAPSED_TIME` | `Float.MAX_VALUE` |
| `public static final` | `double[]` | `DEFAULT_TIME_ELAPSED_RANGE` | `new double[]{0.0, Float.MAX_VALUE}` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `EntityFilterCombat` | `build(@Nonnull BuilderSupport builderSupport)` |
| `` | `return new` | `EntityFilterCombat(this, builderSupport)` |
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Override public` | `Builder<IEntityFilter>` | `readConfig(@Nonnull JsonElement data)` |
| `` | `public String` | `getSequence(@Nonnull BuilderSupport builderSupport)` |
| `` | `public EntityFilterCombat.Mode` | `getCombatMode(@Nonnull BuilderSupport builderSupport)` |
| `` | `public double[]` | `getTimeElapsedRange(@Nonnull BuilderSupport builderSupport)` |
