---
title: "DoorInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.DoorInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.SimpleBlockInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "block"
  - "door"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public class DoorInteraction extends SimpleBlockInteraction
```

Opens and closes doors. Determines whether to open inward or outward based on the player's position relative to the door's rotation. Handles double-door detection and coordinated opening, collision checking to prevent opening into blocked spaces, and sound effects via block interaction states.

## Codec Properties

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `Horizontal` | `boolean` | No (inherited) | `false` | Whether the door is horizontal (e.g., gates) or vertical (e.g., regular doors). |

## Inner Classes

- [DoorInfo](DoorInteraction.DoorInfo.md) -- data class holding block type, filler, position, and door state for a door
- [DoorState](DoorInteraction.DoorState.md) -- enum representing `CLOSED`, `OPENED_IN`, `OPENED_OUT`

## Methods

```java
@Override
protected void interactWithBlock(@Nonnull World world, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull Vector3i targetBlock, @Nonnull CooldownHandler cooldownHandler)
```

Determines current door state, computes new state based on player position, checks for collisions and double doors, activates the door, and plays sound effects.

```java
@Nullable
public static DoorInteraction.DoorInfo getDoorAtPosition(@Nonnull ChunkAccessor<WorldChunk> chunkAccessor, int x, int y, int z, @Nonnull Rotation rotationToCheck)
```

Returns door info at the given world position if a door with the matching rotation exists there.

```java
@Override
protected void simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)
```

No-op for simulation.

## See Also

- `BlockType` -- provides door state management and interaction sound indices
- `FillerBlockUtil` -- handles multi-block door bounding box updates
