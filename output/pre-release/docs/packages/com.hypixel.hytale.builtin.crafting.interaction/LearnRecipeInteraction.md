---
title: "LearnRecipeInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.crafting.interaction"
fqcn: "com.hypixel.hytale.builtin.crafting.interaction.LearnRecipeInteraction"
api_surface: false
extends: "SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "crafting"
  - "interaction"
---

**Package:** `com.hypixel.hytale.builtin.crafting.interaction`

```java
public class LearnRecipeInteraction extends SimpleInstantInteraction
```

Block or entity interaction handler for LearnRecipe behavior.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull public static final` | `KeyedCodec<String>` | `ITEM_ID` | `new KeyedCodec<>("ItemId", Codec.STRING)` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nullable protected` | `String` | `itemId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `WaitForDataFrom` | `getWaitForDataFrom()` |
| `@Override protected` | `void` | `firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)` |
| `@Nonnull @Override public` | `String` | `toString()` |
