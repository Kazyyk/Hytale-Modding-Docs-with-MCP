---
title: "BuilderEntityFilterMovementState"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders.BuilderEntityFilterMovementState"
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
public class BuilderEntityFilterMovementState extends BuilderEntityFilterBase
```

NPC entity filter builder: Check if the entity is in the given movement state.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `MovementState` | `movementState` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `EntityFilterMovementState` | `build(BuilderSupport builderSupport)` |
| `` | `return new` | `EntityFilterMovementState(this)` |
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Override public` | `Builder<IEntityFilter>` | `readConfig(@Nonnull JsonElement data)` |
| `` | `public MovementState` | `getMovementState()` |
