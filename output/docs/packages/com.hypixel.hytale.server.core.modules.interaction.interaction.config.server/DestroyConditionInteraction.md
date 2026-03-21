---
title: "DestroyConditionInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.DestroyConditionInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.SimpleBlockInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "block"
  - "deprecated"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
@Deprecated
public class DestroyConditionInteraction extends SimpleBlockInteraction
```

**Deprecated.** Checks if the target block is destroyable. If the block state implements `BreakValidatedBlockState` and `canDestroy` returns `false`, the interaction fails. Otherwise it succeeds. Waits for server data.

## Codec Properties

Inherits all codec properties from `SimpleBlockInteraction`. No additional properties.

## Methods

```java
@Nonnull
@Override
public WaitForDataFrom getWaitForDataFrom()
```

Returns `WaitForDataFrom.Server`.

```java
@Override
protected void interactWithBlock(@Nonnull World world, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull Vector3i pos, @Nonnull CooldownHandler cooldownHandler)
```

Retrieves the block state at the target position. If the state is a `BreakValidatedBlockState` that disallows destruction, sets state to `Failed`. Otherwise sets state to `Finished`.

```java
@Override
protected void simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)
```

No-op for simulation.

## See Also

- `BreakValidatedBlockState` -- block state interface that validates destruction permission
