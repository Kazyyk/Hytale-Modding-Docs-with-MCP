---
title: "BuilderEntityFilterSpotsMe"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders.BuilderEntityFilterSpotsMe"
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
public class BuilderEntityFilterSpotsMe extends BuilderEntityFilterBase
```

NPC entity filter builder: Checks if the entity can view the NPC in a given view sector or cone and without obstruction..

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `float` | `viewAngle` |
| `protected` | `boolean` | `testLineOfSight` |
| `protected` | `ViewTest` | `viewTest` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `EntityFilterSpotsMe` | `build(BuilderSupport builderSupport)` |
| `` | `return new` | `EntityFilterSpotsMe(this)` |
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Override public` | `Builder<IEntityFilter>` | `readConfig(@Nonnull JsonElement data)` |
| `` | `public float` | `getViewAngle()` |
| `` | `public boolean` | `testLineOfSight()` |
| `` | `public ViewTest` | `getViewTest()` |
