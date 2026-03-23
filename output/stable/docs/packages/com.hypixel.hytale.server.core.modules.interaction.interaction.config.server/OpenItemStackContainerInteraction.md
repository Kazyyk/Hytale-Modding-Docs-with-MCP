---
title: "OpenItemStackContainerInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.OpenItemStackContainerInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "inventory"
  - "container"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public class OpenItemStackContainerInteraction extends SimpleInstantInteraction
```

Opens a container embedded within the currently held item stack. Retrieves the `ItemStackContainerConfig` from the held item, ensures a configured `ItemStackItemContainer` exists, and opens it as an `ItemStackContainerWindow` on the `Page.Bench` page. Only opens if no custom page is already active.

## Codec Properties

Inherits all codec properties from `SimpleInstantInteraction`. No additional properties.

## Methods

```java
@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
```

Gets the player component, verifies no custom page is open, retrieves the held item's container config, ensures the `ItemStackItemContainer` is initialized, and opens the window.

## See Also

- `ItemStackContainerConfig` -- configuration for item-embedded containers
- `ItemStackItemContainer` -- container implementation for items
- `ItemStackContainerWindow` -- the window shown to the player
