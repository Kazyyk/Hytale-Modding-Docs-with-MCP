---
title: "BuilderActionDropItem"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.items.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.items.builders.BuilderActionDropItem"
api_surface: false
extends: "BuilderActionWithDelay"
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
public class BuilderActionDropItem extends BuilderActionWithDelay
```

NPC behavior action builder for ActionDropItem functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `double[]` | `DEFAULT_THROW_DISTANCE` | `new double[]{1.0, 1.0}` |
| `public static final` | `double[]` | `DEFAULT_DROP_SECTOR` | `new double[]{0.0, 0.0}` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected final` | `AssetHolder` | `item` | `new AssetHolder()` |
| `protected final` | `AssetHolder` | `dropList` | `new AssetHolder()` |
| `protected` | `float` | `throwSpeed` |  |
| `protected` | `double[]` | `distance` |  |
| `protected` | `double[]` | `dropSector` |  |
| `protected` | `boolean` | `highPitch` |  |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `Action` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull public` | `BuilderActionDropItem` | `readConfig(@Nonnull JsonElement data)` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Override public` | `boolean` | `validate(String configName, @Nonnull NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)` |
| `public` | `String` | `getItem(@Nonnull BuilderSupport support)` |
| `public` | `String` | `getDropList(@Nonnull BuilderSupport support)` |
| `public` | `float` | `getThrowSpeed()` |
| `public` | `double[]` | `getDropSectorRadians()` |
| `public` | `double[]` | `getDistance()` |
| `public` | `boolean` | `isHighPitch()` |
