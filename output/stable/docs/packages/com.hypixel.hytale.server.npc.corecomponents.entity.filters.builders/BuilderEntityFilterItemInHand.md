---
title: "BuilderEntityFilterItemInHand"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders.BuilderEntityFilterItemInHand"
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
public class BuilderEntityFilterItemInHand extends BuilderEntityFilterBase
```

NPC entity filter builder: Check if entity is holding an item.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `EntityFilterItemInHand` | `build(@Nonnull BuilderSupport builderSupport)` |
| `` | `return new` | `EntityFilterItemInHand(this, builderSupport)` |
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Override public` | `Builder<IEntityFilter>` | `readConfig(@Nonnull JsonElement data)` |
| `@Nullable public` | `String[]` | `getItems(@Nonnull BuilderSupport support)` |
| `` | `public EntityFilterItemInHand.WieldingHand` | `getHand(@Nonnull BuilderSupport support)` |
