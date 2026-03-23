---
title: "BuilderActionApplyEntityEffect"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.combat.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.combat.builders.BuilderActionApplyEntityEffect"
api_surface: false
extends: "BuilderActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "combat"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.combat.builders`

```java
public class BuilderActionApplyEntityEffect extends BuilderActionBase
```

NPC behavior action builder for ActionApplyEntityEffect functionality.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected final` | `AssetHolder` | `entityEffect` | `new AssetHolder()` |
| `protected final` | `BooleanHolder` | `useTarget` | `new BooleanHolder()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ActionApplyEntityEffect` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull public` | `BuilderActionApplyEntityEffect` | `readConfig(@Nonnull JsonElement data)` |
| `public` | `int` | `getEntityEffect(@Nonnull BuilderSupport support)` |
| `public` | `boolean` | `isUseTarget(@Nonnull BuilderSupport support)` |
