# BuilderActionOverrideAttitude

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderActionBase

public class BuilderActionOverrideAttitude extends BuilderActionBase

NPC action builder: Override this NPCs attitude towards the provided target for a given duration.

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Nonnull public Action build(@Nonnull BuilderSupport builderSupport)
- return new ActionOverrideAttitude(this, builderSupport)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- public Attitude getAttitude(@Nonnull BuilderSupport support)
- public double getDuration(@Nonnull BuilderSupport support)
