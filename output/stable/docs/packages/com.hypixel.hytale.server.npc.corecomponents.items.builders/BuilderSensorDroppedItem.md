---
title: "BuilderSensorDroppedItem"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.items.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.items.builders.BuilderSensorDroppedItem"
api_surface: false
extends: "BuilderSensorBase"
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
public class BuilderSensorDroppedItem extends BuilderSensorBase
```

NPC behavior sensor builder for SensorDroppedItem functionality.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected final` | `DoubleHolder` | `range` | `new DoubleHolder()` |
| `protected final` | `FloatHolder` | `viewSector` | `new FloatHolder()` |
| `protected final` | `BooleanHolder` | `hasLineOfSight` | `new BooleanHolder()` |
| `protected final` | `AssetArrayHolder` | `items` | `new AssetArrayHolder()` |
| `protected final` | `EnumSetHolder<ItemAttitudeGroup.Sentiment>` | `attitudes` | `new EnumSetHolder<>()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `Sensor` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `Builder<Sensor>` | `readConfig(@Nonnull JsonElement data)` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `public` | `double` | `getRange(@Nonnull BuilderSupport support)` |
| `public` | `float` | `getViewSectorRadians(@Nonnull BuilderSupport builderSupport)` |
| `public` | `boolean` | `getHasLineOfSight(@Nonnull BuilderSupport support)` |
| `@Nullable public` | `String[]` | `getItems(@Nonnull BuilderSupport support)` |
| `@Nonnull public` | `EnumSet<Attitude>` | `getAttitudes(@Nonnull BuilderSupport support)` |
