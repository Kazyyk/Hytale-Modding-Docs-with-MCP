---
title: "BuilderActionPickUpItem"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.items.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.items.builders.BuilderActionPickUpItem"
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
public class BuilderActionPickUpItem extends BuilderActionWithDelay
```

NPC behavior action builder for ActionPickUpItem functionality.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected final` | `DoubleHolder` | `range` | `new DoubleHolder()` |
| `protected final` | `EnumHolder<ActionPickUpItem.StorageTarget>` | `pickupTarget` | `new EnumHolder<>()` |
| `protected` | `AssetArrayHolder` | `items` | `new AssetArrayHolder()` |
| `protected` | `boolean` | `hoover` |  |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `Action` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull public` | `BuilderActionPickUpItem` | `readConfig(@Nonnull JsonElement data)` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `public` | `String[]` | `getItems(BuilderSupport support)` |
| `public` | `boolean` | `getHoover()` |
| `public` | `double` | `getRange(@Nonnull BuilderSupport support)` |
| `public` | `ActionPickUpItem.StorageTarget` | `getStorageTarget(@Nonnull BuilderSupport support)` |
