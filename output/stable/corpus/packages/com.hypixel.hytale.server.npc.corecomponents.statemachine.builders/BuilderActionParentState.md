# BuilderActionParentState

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.statemachine.builders | Extends: BuilderActionBase

public class BuilderActionParentState extends BuilderActionBase

NPC behavior tree builder for an action node. Configures execution logic.

## Fields

- state | String | String field.

## Methods

- build(@Nonnull BuilderSupport builderSupport) | ActionParentState | public method.
- getShortDescription() | String | public method.
- getLongDescription() | String | public method.
- getBuilderDescriptorState() | BuilderDescriptorState | public method.
- readConfig(@Nonnull JsonElement data) | BuilderActionParentState | public method.
- getStatePair(@Nonnull BuilderSupport support) | StatePair | public method.

Also in this package: BuilderActionState, BuilderActionToggleStateEvaluator, BuilderSensorIsBusy, BuilderSensorState

Complete API:
  public ActionParentState build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionParentState readConfig(JsonElement data)
  public StatePair getStatePair(BuilderSupport support)

Fields:
protected String state
