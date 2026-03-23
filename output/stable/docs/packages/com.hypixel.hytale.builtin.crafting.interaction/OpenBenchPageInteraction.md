---
title: "OpenBenchPageInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.crafting.interaction"
fqcn: "com.hypixel.hytale.builtin.crafting.interaction.OpenBenchPageInteraction"
api_surface: false
extends: "SimpleBlockInteraction"
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
public class OpenBenchPageInteraction extends SimpleBlockInteraction
```

Block or entity interaction handler for OpenBenchPage behavior.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull public static final` | `RootInteraction` | `SIMPLE_CRAFTING_ROOT` | `new RootInteraction(SIMPLE_CRAFTING.getId(), SIMPLE_CRAFTING.getId())` |
| `@Nonnull public static final` | `RootInteraction` | `DIAGRAM_CRAFTING_ROOT` | `new RootInteraction(DIAGRAM_CRAFTING.getId(), DIAGRAM_CRAFTING.getId())` |
| `@Nonnull public static final` | `RootInteraction` | `STRUCTURAL_CRAFTING_ROOT` | `new RootInteraction(STRUCTURAL_CRAFTING.getId(), STRUCTURAL_CRAFTING.getId())` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private` | `OpenBenchPageInteraction.PageType` | `pageType` | `OpenBenchPageInteraction.PageType.SIMPLE_CRAFTING` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `OpenBenchPageInteraction(@Nonnull String id, @Nonnull OpenBenchPageInteraction.PageType pageType)` |
| `protected` | | `OpenBenchPageInteraction()` |
| `@Override protected` | `void` | `interactWithBlock(@Nonnull World world,
        @Nonnull CommandBuffer<EntityStore> commandBuffer,
        @Nonnull InteractionType type,
        @Nonnull InteractionContext context,
        @Nullable ItemStack itemInHand,
        @Nonnull Vector3i targetBlock,
        @Nonnull CooldownHandler cooldownHandler)` |
| `@Override protected` | `void` | `simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)` |
