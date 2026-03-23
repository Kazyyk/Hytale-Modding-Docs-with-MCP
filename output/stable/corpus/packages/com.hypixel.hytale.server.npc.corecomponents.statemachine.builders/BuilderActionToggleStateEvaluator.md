# BuilderActionToggleStateEvaluator

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.statemachine.builders | Extends: BuilderActionBase

public class BuilderActionToggleStateEvaluator extends BuilderActionBase

NPC behavior tree builder for an action node. Configures execution logic.

## Fields

- enable | boolean | boolean field.

## Methods

- build(BuilderSupport builderSupport) | ActionToggleStateEvaluator | public method.
- getShortDescription() | String | public method.
- getLongDescription() | String | public method.
- getBuilderDescriptorState() | BuilderDescriptorState | public method.
- readConfig(@Nonnull JsonElement data) | BuilderActionToggleStateEvaluator | public method.
- isEnable() | boolean | public method.

Also in this package: BuilderActionParentState, BuilderActionState, BuilderSensorIsBusy, BuilderSensorState

Complete API:
  public ActionToggleStateEvaluator build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionToggleStateEvaluator readConfig(JsonElement data)
  public boolean isEnable()

Fields:
protected boolean enable
