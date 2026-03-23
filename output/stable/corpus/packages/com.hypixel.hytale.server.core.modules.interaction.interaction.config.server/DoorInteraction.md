# DoorInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.SimpleBlockInteraction

public class DoorInteraction extends SimpleBlockInteraction

Opens and closes doors. Determines whether to open inward or outward based on the player's position relative to the door's rotation. Handles double-door detection and coordinated opening, collision checking to prevent opening into blocked spaces, and sound effects via block interaction states.

## Codec Properties

- Horizontal | boolean | No (inherited) | false | Whether the door is horizontal (e.g., gates) or vertical (e.g., regular doors).

## Inner Classes

- DoorInfo -- data class holding block type, filler, position, and door state for a door
- DoorState -- enum representing `CLOSED`, `OPENED_IN`, `OPENED_OUT`

## Methods


@Override
protected void interactWithBlock(@Nonnull World world, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull Vector3i targetBlock, @Nonnull CooldownHandler cooldownHandler)

Determines current door state, computes new state based on player position, checks for collisions and double doors, activates the door, and plays sound effects.


@Nullable
public static DoorInteraction.DoorInfo getDoorAtPosition(@Nonnull ChunkAccessor<WorldChunk> chunkAccessor, int x, int y, int z, @Nonnull Rotation rotationToCheck)

Returns door info at the given world position if a door with the matching rotation exists there.


@Override
protected void simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)

No-op for simulation.

## See Also

- `BlockType` -- provides door state management and interaction sound indices
- `FillerBlockUtil` -- handles multi-block door bounding box updates
