# BuilderActionNotify

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderActionBase

public class BuilderActionNotify extends BuilderActionBase

NPC action builder: Directly notifies a target NPC with a beacon message.

## Fields

- protected double expirationTime
- protected String usedTargetSlot

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public void registerTags(@Nonnull Set<String> tags)
- @Nonnull public Action build(@Nonnull BuilderSupport builderSupport)
- return new ActionNotify(this, builderSupport)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- public String getMessage(@Nonnull BuilderSupport support)
- public double getExpirationTime()
- public int getUsedTargetSlot(@Nonnull BuilderSupport support)
