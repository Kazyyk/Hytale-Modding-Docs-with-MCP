---
title: "ItemGridSlot"
kind: "class"
package: "com.hypixel.hytale.server.core.ui"
fqcn: "com.hypixel.hytale.server.core.ui.ItemGridSlot"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "ui"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.ui`

```java
public class ItemGridSlot
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<ItemGridSlot>` | `CODEC` |
| `private` | `ItemStack` | `itemStack` |
| `private` | `Value<PatchStyle>` | `background` |
| `private` | `Value<PatchStyle>` | `overlay` |
| `private` | `Value<PatchStyle>` | `icon` |
| `private` | `boolean` | `isItemIncompatible` |
| `private` | `String` | `name` |
| `private` | `String` | `description` |
| `private` | `boolean` | `skipItemQualityBackground` |
| `private` | `boolean` | `isActivatable` |
| `private` | `boolean` | `isItemUncraftable` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ItemGridSlot()` |
| `public` | `ItemGridSlot(ItemStack itemStack)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ItemGridSlot` | `setItemStack(ItemStack itemStack)` |
| `@Nonnull public` | `ItemGridSlot` | `setBackground(Value<PatchStyle> background)` |
| `@Nonnull public` | `ItemGridSlot` | `setOverlay(Value<PatchStyle> overlay)` |
| `@Nonnull public` | `ItemGridSlot` | `setIcon(Value<PatchStyle> icon)` |
| `@Nonnull public` | `ItemGridSlot` | `setItemIncompatible(boolean itemIncompatible)` |
| `@Nonnull public` | `ItemGridSlot` | `setName(String name)` |
| `@Nonnull public` | `ItemGridSlot` | `setDescription(String description)` |
| `public` | `boolean` | `isItemUncraftable()` |
| `public` | `void` | `setItemUncraftable(boolean itemUncraftable)` |
| `public` | `boolean` | `isActivatable()` |
| `public` | `void` | `setActivatable(boolean activatable)` |
| `public` | `boolean` | `isSkipItemQualityBackground()` |
| `public` | `void` | `setSkipItemQualityBackground(boolean skipItemQualityBackground)` |
