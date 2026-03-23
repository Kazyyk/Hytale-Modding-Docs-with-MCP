---
title: "BuilderEntityFilterAltitude"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders.BuilderEntityFilterAltitude"
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
public class BuilderEntityFilterAltitude extends BuilderEntityFilterBase
```

NPC entity filter builder: Matches targets if they're within the defined range above the ground.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `IEntityFilter` | `build(@Nonnull BuilderSupport builderSupport)` |
| `` | `return new` | `EntityFilterAltitude(this, builderSupport)` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Override public` | `Builder<IEntityFilter>` | `readConfig(@Nonnull JsonElement data)` |
| `` | `public double[]` | `getAltitudeRange(@Nonnull BuilderSupport support)` |
