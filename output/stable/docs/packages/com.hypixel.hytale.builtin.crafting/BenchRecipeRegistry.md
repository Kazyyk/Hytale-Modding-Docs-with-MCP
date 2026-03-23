---
title: "BenchRecipeRegistry"
kind: "class"
package: "com.hypixel.hytale.builtin.crafting"
fqcn: "com.hypixel.hytale.builtin.crafting.BenchRecipeRegistry"
api_surface: false
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "builtin"
  - "crafting"
---
**Package:** `com.hypixel.hytale.builtin.crafting`

```java
public class BenchRecipeRegistry
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `String` | `benchId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `BenchRecipeRegistry(String benchId)` |
| `public` | `Iterable<String>` | `getIncomingRecipesForItem(@Nonnull String itemId)` |
| `public` | `void` | `removeRecipe(@Nonnull String id)` |
| `public` | `void` | `addRecipe(@Nonnull BenchRequirement benchRequirement, @Nonnull CraftingRecipe recipe)` |
| `public` | `CraftingRecipe[]` | `getAllRecipes()` |
| `public` | `Set<String>` | `getRecipesForCategory(@Nonnull String benchCategoryId)` |
| `public` | `void` | `recompute()` |
| `private` | `void` | `extractMaterialFromRecipes(@Nonnull Set<String> recipes)` |
| `public` | `boolean` | `isValidCraftingMaterial(@Nonnull ItemStack itemStack)` |
| `public` | `boolean` | `equals(@Nullable Object o)` |
| `public` | `int` | `hashCode()` |
| `public` | `String` | `toString()` |
