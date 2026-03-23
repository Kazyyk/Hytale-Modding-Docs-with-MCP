---
title: "BuilderActionRemove"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders.BuilderActionRemove"
api_surface: false
extends: "BuilderActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "lifecycle"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders`

```java
public class BuilderActionRemove extends BuilderActionBase
```

NPC behavior action builder for ActionRemove functionality.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected final` | `BooleanHolder` | `useTarget` | `new BooleanHolder()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Action` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull @Override public` | `Builder<Action>` | `readConfig(@Nonnull JsonElement data)` |
| `public` | `boolean` | `getUseTarget(@Nonnull BuilderSupport support)` |
