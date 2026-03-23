# BuilderActionIgnoreForAvoidance

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderActionBase

public class BuilderActionIgnoreForAvoidance extends BuilderActionBase

NPC action builder: Set the target slot of an entity that should be ignored during avoidance.

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Nonnull public Action build(@Nonnull BuilderSupport builderSupport)
- return new ActionIgnoreForAvoidance(this, builderSupport)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- public int getTargetSlot(@Nonnull BuilderSupport support)
