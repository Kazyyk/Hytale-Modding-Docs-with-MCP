# BuilderActionLog

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.debug.builders | Extends: BuilderActionBase

public class BuilderActionLog extends BuilderActionBase

NPC behavior tree builder for an action node. Configures execution logic.

## Methods

- build(@Nonnull BuilderSupport builderSupport) | ActionLog | public method.
- getShortDescription() | String | public method.
- getLongDescription() | String | public method.
- getBuilderDescriptorState() | BuilderDescriptorState | public method.
- readConfig(@Nonnull JsonElement data) | BuilderActionLog | public method.
- getText(@Nonnull BuilderSupport support) | String | public method.

Also in this package: BuilderActionTest, BuilderBodyMotionTestProbe

Complete API:
  public ActionLog build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionLog readConfig(JsonElement data)
  public String getText(BuilderSupport support)

Fields:
protected final StringHolder text
