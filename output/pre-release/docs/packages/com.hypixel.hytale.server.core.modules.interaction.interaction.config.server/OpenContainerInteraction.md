---
title: "OpenContainerInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.OpenContainerInteraction"
api_surface: false
extends: "SimpleBlockInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "interaction"
  - "container"
  - "block"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public class OpenContainerInteraction extends SimpleBlockInteraction
```

Opens the item container of the block being interacted with. Locates the `ItemContainerBlock` component via chunk block components and opens a `ContainerBlockWindow` for the player. Handles `OpenWindow`/`CloseWindow` block interaction states and plays associated sound events.

## Constants

| Field | Type | Value |
|---|---|---|
| `OPEN_WINDOW` | `String` | `"OpenWindow"` |
| `CLOSE_WINDOW` | `String` | `"CloseWindow"` |

## Methods

| Method | Signature |
|---|---|
| `interactWithBlock` | `protected void interactWithBlock(@Nonnull World world, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull Vector3i pos, @Nonnull CooldownHandler cooldownHandler)` |
| `simulateInteractWithBlock` | `protected void simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)` |