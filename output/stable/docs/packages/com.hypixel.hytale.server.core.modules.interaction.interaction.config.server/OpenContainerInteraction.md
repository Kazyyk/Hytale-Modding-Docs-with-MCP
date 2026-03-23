---
title: "OpenContainerInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.OpenContainerInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.SimpleBlockInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "block"
  - "container"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public class OpenContainerInteraction extends SimpleBlockInteraction
```

Opens the item container associated with the target block. Checks if the block state is an `ItemContainerState` that allows viewing and can be opened. Creates a `ContainerBlockWindow`, sets the player's page to `Page.Bench`, manages the window lifecycle (open/close events, sound effects), and tracks concurrent viewers via a UUID-keyed window map. Sets `"OpenWindow"` / `"CloseWindow"` block interaction states.

## Codec Properties

Inherits all codec properties from `SimpleBlockInteraction`. No additional properties.

## Methods

```java
@Override
protected void interactWithBlock(@Nonnull World world, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull Vector3i pos, @Nonnull CooldownHandler cooldownHandler)
```

Opens the container block's window for the player. Handles open/close sound effects, window registration, and concurrent viewer tracking.

```java
@Override
protected void simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)
```

No-op for simulation.

## See Also

- `ItemContainerState` -- block state interface providing the item container
- `ContainerBlockWindow` -- the window presented to the player
