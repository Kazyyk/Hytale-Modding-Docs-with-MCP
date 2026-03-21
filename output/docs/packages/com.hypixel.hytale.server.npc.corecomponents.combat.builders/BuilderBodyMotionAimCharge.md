---
title: "BuilderBodyMotionAimCharge"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.combat.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.combat.builders.BuilderBodyMotionAimCharge"
api_surface: false
extends: "BuilderBodyMotionBase"
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
public class BuilderBodyMotionAimCharge extends BuilderBodyMotionBase
```

NPC behavior motion builder for BodyMotionAimCharge functionality.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected final` | `DoubleHolder` | `relativeTurnSpeed` | `new DoubleHolder()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `BodyMotion` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull public` | `BuilderBodyMotionAimCharge` | `readConfig(@Nonnull JsonElement data)` |
| `public` | `double` | `getRelativeTurnSpeed(@Nonnull BuilderSupport support)` |
