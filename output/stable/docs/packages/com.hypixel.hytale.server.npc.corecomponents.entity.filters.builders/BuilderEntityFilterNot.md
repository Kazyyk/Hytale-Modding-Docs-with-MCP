---
title: "BuilderEntityFilterNot"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders.BuilderEntityFilterNot"
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
public class BuilderEntityFilterNot extends BuilderEntityFilterWithToggle
```

Extends `BuilderEntityFilterWithToggle`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public` | `IEntityFilter` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Override public` | `void` | `registerTags(@Nonnull Set<String> tags)` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Override public` | `Builder<IEntityFilter>` | `readConfig(@Nonnull JsonElement data)` |
| `@Override public` | `boolean` | `validate(String configName,
        @Nonnull NPCLoadTimeValidationHelper validationHelper,
        @Nonnull ExecutionContext context,
        Scope globalScope,
        @Nonnull List<String> errors)` |
| `@Nullable public` | `IEntityFilter` | `getFilter(@Nonnull BuilderSupport support)` |
