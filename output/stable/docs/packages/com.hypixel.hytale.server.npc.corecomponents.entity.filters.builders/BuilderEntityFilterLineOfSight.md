---
title: "BuilderEntityFilterLineOfSight"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders.BuilderEntityFilterLineOfSight"
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
public class BuilderEntityFilterLineOfSight extends BuilderEntityFilterBase
```

NPC entity filter builder: Matches if there is line of sight to the target.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `IEntityFilter` | `build(BuilderSupport builderSupport)` |
| `` | `return new` | `EntityFilterLineOfSight()` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Override public` | `Builder<IEntityFilter>` | `readConfig(JsonElement data)` |
