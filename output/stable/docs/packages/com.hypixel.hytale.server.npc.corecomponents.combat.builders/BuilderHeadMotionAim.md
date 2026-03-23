---
title: "BuilderHeadMotionAim"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.combat.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.combat.builders.BuilderHeadMotionAim"
api_surface: false
extends: "BuilderHeadMotionBase"
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
public class BuilderHeadMotionAim extends BuilderHeadMotionBase
```

NPC behavior motion builder for HeadMotionAim functionality.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected final` | `DoubleHolder` | `spread` | `new DoubleHolder()` |
| `protected final` | `BooleanHolder` | `deflection` | `new BooleanHolder()` |
| `protected final` | `DoubleHolder` | `hitProbability` | `new DoubleHolder()` |
| `protected final` | `DoubleHolder` | `relativeTurnSpeed` | `new DoubleHolder()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `HeadMotionAim` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull public` | `BuilderHeadMotionAim` | `readConfig(@Nonnull JsonElement data)` |
| `public` | `double` | `getSpread(BuilderSupport support)` |
| `public` | `boolean` | `isDeflection(BuilderSupport support)` |
| `public` | `double` | `getHitProbability(BuilderSupport support)` |
| `public` | `double` | `getRelativeTurnSpeed(@Nonnull BuilderSupport support)` |
