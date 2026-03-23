# BuilderActionRemove

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders | Extends: BuilderActionBase

public class BuilderActionRemove extends BuilderActionBase

NPC behavior action builder for ActionRemove functionality.

## Fields

- protected final BooleanHolder useTarget

## Methods

- @Nonnull public Action build(@Nonnull BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull @Override public Builder<Action> readConfig(@Nonnull JsonElement data)
- public boolean getUseTarget(@Nonnull BuilderSupport support)
