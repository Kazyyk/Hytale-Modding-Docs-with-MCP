---
title: "ItemModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.item"
fqcn: "com.hypixel.hytale.server.core.modules.item.ItemModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "item"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.item`

```java
public class ItemModule extends JavaPlugin
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `PluginManifest` | `MANIFEST` |
| `private static` | `ItemModule` | `instance` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ItemModule(@Nonnull JavaPluginInit init)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ItemModule` | `get()` |
| `@Override protected` | `void` | `setup()` |
| `@Nonnull public` | `List<String>` | `getFlatItemCategoryList()` |
| `private` | `void` | `flattenCategories(String parent, @Nonnull ItemCategory[] itemCategories, @Nonnull List<String> categoryIds)` |
| `@Nonnull public` | `List<ItemStack>` | `getRandomItemDrops(@Nullable String dropListId)` |
| `public static` | `boolean` | `exists(String key)` |
