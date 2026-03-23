# BuilderEntityFilterMovementState

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterMovementState extends BuilderEntityFilterBase

NPC entity filter builder: Check if the entity is in the given movement state.

## Fields

- protected MovementState movementState

## Methods

- @Nonnull public EntityFilterMovementState build(BuilderSupport builderSupport)
- return new EntityFilterMovementState(this)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- public MovementState getMovementState()
