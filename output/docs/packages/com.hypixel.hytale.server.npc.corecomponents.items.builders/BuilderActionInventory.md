---
title: "BuilderActionInventory"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.items.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.items.builders.BuilderActionInventory"
api_surface: false
extends: "BuilderActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "items"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.items.builders`

```java
public class BuilderActionInventory extends BuilderActionBase
```

NPC behavior action builder for ActionInventory functionality.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected final` | `EnumHolder<ActionInventory.Operation>` | `operation` | `new EnumHolder<>()` |
| `protected final` | `AssetHolder` | `item` | `new AssetHolder()` |
| `protected final` | `IntHolder` | `count` | `new IntHolder()` |
| `protected final` | `BooleanHolder` | `useTarget` | `new BooleanHolder()` |
| `protected final` | `IntHolder` | `slot` | `new IntHolder()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Action` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull @Override public` | `Builder<Action>` | `readConfig(@Nonnull JsonElement data)` |
| `@Override public` | `boolean` | `validate(String configName, @Nonnull NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)` |
| `public` | `ActionInventory.Operation` | `getOperation(@Nonnull BuilderSupport builderSupport)` |
| `public` | `String` | `getItem(@Nonnull BuilderSupport builderSupport)` |
| `public` | `int` | `getCount(@Nonnull BuilderSupport builderSupport)` |
| `public` | `boolean` | `getUseTarget(@Nonnull BuilderSupport support)` |
| `public` | `int` | `getSlot(@Nonnull BuilderSupport support)` |
