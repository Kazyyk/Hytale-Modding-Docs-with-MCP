---
title: "BuilderEntityFilterStat"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders.BuilderEntityFilterStat"
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
public class BuilderEntityFilterStat extends BuilderEntityFilterBase
```

NPC entity filter builder: Match stat values of the entity.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `IEntityFilter` | `build(@Nonnull BuilderSupport builderSupport)` |
| `` | `return new` | `EntityFilterStat(this, builderSupport)` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Override public` | `Builder<IEntityFilter>` | `readConfig(@Nonnull JsonElement data)` |
| `` | `public int` | `getStat(@Nonnull BuilderSupport support)` |
| `` | `public EntityFilterStat.EntityStatTarget` | `getStatTarget(@Nonnull BuilderSupport support)` |
| `` | `public int` | `getRelativeTo(@Nonnull BuilderSupport support)` |
| `` | `public EntityFilterStat.EntityStatTarget` | `getRelativeToTarget(@Nonnull BuilderSupport support)` |
| `` | `public double[]` | `getValueRange(@Nonnull BuilderSupport support)` |
