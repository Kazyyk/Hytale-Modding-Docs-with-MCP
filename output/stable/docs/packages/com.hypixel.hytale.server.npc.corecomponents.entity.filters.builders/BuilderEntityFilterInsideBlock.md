---
title: "BuilderEntityFilterInsideBlock"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders.BuilderEntityFilterInsideBlock"
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
public class BuilderEntityFilterInsideBlock extends BuilderEntityFilterBase
```

NPC entity filter builder: Matches if the entity is inside any of the blocks in the BlockSet.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `IEntityFilter` | `build(@Nonnull BuilderSupport builderSupport)` |
| `` | `return new` | `EntityFilterInsideBlock(this, builderSupport)` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Override public` | `Builder<IEntityFilter>` | `readConfig(@Nonnull JsonElement data)` |
| `` | `public int` | `getBlockSet(@Nonnull BuilderSupport support)` |
| `` | `throw new` | `IllegalArgumentException("Unknown key! " + key)` |
