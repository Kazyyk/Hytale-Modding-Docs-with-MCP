# SeatingInteraction

Type: class | Package: com.hypixel.hytale.builtin.mounts.interactions | Extends: SimpleBlockInteraction

public class SeatingInteraction extends SimpleBlockInteraction

A block interaction that seats the interacting player on a block with configured seat or bed mount points. Registered on `Interaction.CODEC` with the key `"Seating"` by MountPlugin.

## Codec


@Nonnull
public static final BuilderCodec<SeatingInteraction> CODEC

Extends `SimpleBlockInteraction.CODEC` with documentation `"Arranges perfect seating accommodations"`. No additional fields.

## Behavior


@Override
protected void interactWithBlock(
    @Nonnull World world,
    @Nonnull CommandBuffer<EntityStore> commandBuffer,
    @Nonnull InteractionType type,
    @Nonnull InteractionContext context,
    @Nullable ItemStack itemInHand,
    @Nonnull Vector3i targetBlock,
    @Nonnull CooldownHandler cooldownHandler
)

For player entities:
1. Computes the raw block hit position from the interaction metadata.
2. Delegates to BlockMountAPI.mountOnBlock().
3. On `ALREADY_MOUNTED`: plays the `"SFX_Creative_Play_Add_Mask"` sound effect as 2D audio.
4. On successful `Mounted`: looks up the block's `BlockSoundSet` and plays the walk sound as 3D audio.
5. On other failures: sends a `"server.interactions.didNotMount"` message with the failure state.

### simulateInteractWithBlock

No-op.

## Related Types

- BlockMountAPI -- performs the actual mount logic
- MountPlugin -- registers this interaction
