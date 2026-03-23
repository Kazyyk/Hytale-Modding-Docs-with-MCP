---
title: "BuilderSensorWithEntityFilters"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.builders.BuilderSensorWithEntityFilters"
api_surface: false
extends: "BuilderSensorBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "builders"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.builders`

```java
public abstract class BuilderSensorWithEntityFilters extends BuilderSensorBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `BuilderObjectListHelper<IEntityFilter>` | `filters` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `validate(String configName,
        @Nonnull NPCLoadTimeValidationHelper validationHelper,
        @Nonnull ExecutionContext context,
        Scope globalScope,
        @Nonnull List<String> errors)` |
| `@Nonnull public` | `IEntityFilter[]` | `getFilters(@Nonnull BuilderSupport support, @Nullable ISensorEntityPrioritiser prioritiser, ComponentContext context)` |
| `@Nonnull protected` | `BuilderValidationHelper` | `createFilterValidationHelper(ComponentContext context)` |
