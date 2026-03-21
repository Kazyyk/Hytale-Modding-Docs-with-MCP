---
title: "RefillContainerInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.RefillContainerInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "item"
  - "fluid"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public class RefillContainerInteraction extends SimpleInstantInteraction
```

Refills a container item currently held by the player. Performs a ray-cast from the player's eye position in the look direction (up to the configured use distance), checking for allowed fluid types along the path. When a matching fluid is found, either transforms the held item to a new state or adjusts its durability, and optionally transforms the source fluid.

## Codec Properties

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `States` | `Map<String, RefillState>` | Yes (inherited) | -- | Map of state names to refill configurations. Each entry defines allowed fluids, durability, and optional fluid transformation. |

## Inner Classes

- [RefillState](RefillContainerInteraction.RefillState.md) -- configuration for a single refill state, including allowed fluids, durability, and fluid transformation

## Methods

```java
@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
```

Validates the player and inventory, performs a block-by-block ray-cast checking for fluids, and either refills the held item's durability or transforms it to a new item type. Handles single and stacked item cases differently.

```java
protected int[] getAllowedFluidIds()
```

Lazily resolves and caches the sorted array of allowed fluid asset indices from all refill states.

```java
protected Int2ObjectMap<String> getFluidToState()
```

Lazily builds and caches a map from fluid asset index to state name.

```java
@Nonnull
@Override
public String toString()
```

## See Also

- `Fluid` -- fluid asset used for matching and transformation
- `BlockIterator` -- performs the ray-cast through blocks
