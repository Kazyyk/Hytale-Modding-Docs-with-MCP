---
title: "BuilderActionRole"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders.BuilderActionRole"
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
public class BuilderActionRole extends BuilderActionBase
```

NPC behavior action builder for ActionRole functionality.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected final` | `DeferEvaluateAssetHolder` | `role` | `new DeferEvaluateAssetHolder()` |
| `protected final` | `BooleanHolder` | `changeAppearance` | `new BooleanHolder()` |
| `protected final` | `StringHolder` | `state` | `new StringHolder()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `Action` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull @Override public` | `Builder<Action>` | `readConfig(@Nonnull JsonElement data)` |
| `public` | `String` | `getRole(@Nonnull BuilderSupport support)` |
| `public` | `boolean` | `getChangeAppearance(@Nonnull BuilderSupport support)` |
| `public` | `String` | `getState(@Nonnull BuilderSupport support)` |
