# BuilderActionSetMarkedTarget

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderActionBase

public class BuilderActionSetMarkedTarget extends BuilderActionBase

NPC action builder: Explicitly sets a marked target in a given slot..

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Nonnull public Action build(@Nonnull BuilderSupport builderSupport)
- return new ActionSetMarkedTarget(this, builderSupport)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- public int getTargetSlot(@Nonnull BuilderSupport support)
