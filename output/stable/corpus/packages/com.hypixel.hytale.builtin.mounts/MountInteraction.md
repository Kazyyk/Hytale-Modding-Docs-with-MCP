# MountInteraction

Type: class | Package: com.hypixel.hytale.builtin.mounts.interactions | Extends: SimpleInstantInteraction

public class MountInteraction extends SimpleInstantInteraction

An entity interaction that mounts the interacting player onto a target entity. Registered on `Interaction.CODEC` with the key `"Mount"` by MountPlugin.

## Codec


public static final BuilderCodec<MountInteraction> CODEC

Extends `SimpleInstantInteraction.CODEC` with:
- `AttachmentOffset` (`Vector3f`) -- position offset from the mount point. Defaults to `(0, 0, 0)`.
- `Controller` (`MountController` enum) -- the mount controller type. Required (validated non-null).

## Behavior


@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

1. If no target entity exists, sets state to `Failed`.
2. If the player already has a MountedComponent, removes it (dismounts) and sets state to `Failed`.
3. If the target already has passengers (non-empty MountedByComponent), sets state to `Failed`.
4. Otherwise, adds a `MountedComponent` to the player targeting the entity with the configured attachment offset and controller.

## Related Types

- MountPlugin -- registers this interaction
- MountedComponent -- created by this interaction
- MountedByComponent -- checked for existing passengers
