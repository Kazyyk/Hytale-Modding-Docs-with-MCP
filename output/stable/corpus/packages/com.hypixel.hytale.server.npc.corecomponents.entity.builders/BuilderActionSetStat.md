# BuilderActionSetStat

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderActionBase

public class BuilderActionSetStat extends BuilderActionBase

NPC action builder: Sets (or adds to) an entity stat on the NPC..

## Methods

- @Nonnull public ActionSetStat build(@Nonnull BuilderSupport builderSupport)
- return new ActionSetStat(this, builderSupport)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- public int getStat(@Nonnull BuilderSupport support)
- public float getValue(@Nonnull BuilderSupport support)
- public boolean isAdd(@Nonnull BuilderSupport support)
