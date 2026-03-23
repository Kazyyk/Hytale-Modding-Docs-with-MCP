# UseBlockEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.ecs | Extends: EcsEvent

public abstract class UseBlockEvent extends EcsEvent

Abstract base class extending `EcsEvent` that provides shared logic for UseBlockEvent subclasses.

## Fields

- @Nonnull private final InteractionType interactionType
- @Nonnull private final InteractionContext context
- @Nonnull private final Vector3i targetBlock
- @Nonnull private final BlockType blockType

## Methods

- public UseBlockEvent(@Nonnull InteractionType interactionType, @Nonnull InteractionContext context, @Nonnull Vector3i targetBlock, @Nonnull BlockType blockType)
- @Nonnull public InteractionType getInteractionType()
- @Nonnull public InteractionContext getContext()
- @Nonnull public Vector3i getTargetBlock()
- @Nonnull public BlockType getBlockType()
