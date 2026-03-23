---
title: "BuilderEntityFilterMany"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders.BuilderEntityFilterMany"
api_surface: false
extends: "BuilderEntityFilterWithToggle"
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
public abstract class BuilderEntityFilterMany extends BuilderEntityFilterWithToggle
```

Abstract base class in the `builders` package.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull protected` | `BuilderObjectListHelper<IEntityFilter>` | `objectListHelper` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `registerTags(@Nonnull Set<String> tags)` |
| `@Override public` | `Builder<IEntityFilter>` | `readConfig(@Nonnull JsonElement data)` |
| `@Override public` | `boolean` | `validate(String configName,
        @Nonnull NPCLoadTimeValidationHelper validationHelper,
        @Nonnull ExecutionContext context,
        Scope globalScope,
        @Nonnull List<String> errors)` |
