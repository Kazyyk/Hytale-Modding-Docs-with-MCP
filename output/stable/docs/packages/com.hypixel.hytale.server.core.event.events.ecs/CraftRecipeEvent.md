---
title: "CraftRecipeEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.event.events.ecs"
fqcn: "com.hypixel.hytale.server.core.event.events.ecs.CraftRecipeEvent"
api_surface: true
extends: "CancellableEcsEvent"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "event"
  - "events"
---

**Package:** `com.hypixel.hytale.server.core.event.events.ecs`

```java
public abstract class CraftRecipeEvent extends CancellableEcsEvent
```

Abstract base class extending `CancellableEcsEvent` that provides shared logic for CraftRecipeEvent subclasses.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `CraftingRecipe` | `craftedRecipe` |
| `private final` | `int` | `quantity` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `CraftRecipeEvent(@Nonnull CraftingRecipe craftedRecipe, int quantity)` |
| `@Nonnull public` | `CraftingRecipe` | `getCraftedRecipe()` |
| `public` | `int` | `getQuantity()` |
