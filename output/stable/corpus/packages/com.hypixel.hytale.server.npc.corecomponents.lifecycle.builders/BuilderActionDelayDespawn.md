# BuilderActionDelayDespawn

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders | Extends: BuilderActionBase

public class BuilderActionDelayDespawn extends BuilderActionBase

NPC behavior action builder for ActionDelayDespawn functionality.

## Fields

- protected float time
- protected boolean shorten

## Methods

- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull public ActionDelayDespawn build(BuilderSupport builderSupport)
- @Nonnull public BuilderActionDelayDespawn readConfig(@Nonnull JsonElement data)
- public float getTime()
- public boolean getShorten()
