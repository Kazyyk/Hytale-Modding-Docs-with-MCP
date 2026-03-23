---
title: "BuilderWeightedAction"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.builders.BuilderWeightedAction"
api_surface: false
extends: "BuilderBase<WeightedAction>"
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
public class BuilderWeightedAction extends BuilderBase<WeightedAction>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `BuilderObjectReferenceHelper<Action>` | `action` |
| `private final` | `DoubleHolder` | `weight` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `WeightedAction` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `Class<WeightedAction>` | `category()` |
| `@Override public` | `boolean` | `isEnabled(ExecutionContext context)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull @Override public` | `Builder<WeightedAction>` | `readConfig(@Nonnull JsonElement data)` |
| `@Override public` | `boolean` | `validate(String configName, NPCLoadTimeValidationHelper validationHelper, @Nonnull ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)` |
| `@Nullable public` | `Action` | `getAction(@Nonnull BuilderSupport support)` |
| `public` | `double` | `getWeight(@Nonnull BuilderSupport support)` |
