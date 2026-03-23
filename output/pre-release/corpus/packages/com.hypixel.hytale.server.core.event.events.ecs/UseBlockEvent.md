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

Known subclasses: Post, Pre

Also in this package: BreakBlockEvent, ChangeGameModeEvent, CraftRecipeEvent, DamageBlockEvent, DiscoverZoneEvent, Display, Drop, DropItemEvent, InteractivelyPickupItemEvent, PlaceBlockEvent, PlayerRequest, Post, Post, Pre, Pre, SwitchActiveSlotEvent

Complete API:
  public InteractionType getInteractionType()
  public InteractionContext getContext()
  public Vector3i getTargetBlock()
  public BlockType getBlockType()

Fields:
private final InteractionType interactionType
private final InteractionContext context
private final Vector3i targetBlock
private final BlockType blockType
