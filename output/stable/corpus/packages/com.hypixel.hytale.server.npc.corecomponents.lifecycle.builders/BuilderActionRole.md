# BuilderActionRole

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders | Extends: BuilderActionBase

public class BuilderActionRole extends BuilderActionBase

NPC behavior action builder for ActionRole functionality.

## Fields

- protected final DeferEvaluateAssetHolder role
- protected final BooleanHolder changeAppearance
- protected final StringHolder state

## Methods

- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull public Action build(@Nonnull BuilderSupport builderSupport)
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull @Override public Builder<Action> readConfig(@Nonnull JsonElement data)
- public String getRole(@Nonnull BuilderSupport support)
- public boolean getChangeAppearance(@Nonnull BuilderSupport support)
- public String getState(@Nonnull BuilderSupport support)
