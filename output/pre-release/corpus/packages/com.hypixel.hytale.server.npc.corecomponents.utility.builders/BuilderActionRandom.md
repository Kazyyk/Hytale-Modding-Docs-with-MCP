# BuilderActionRandom

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility.builders | Extends: BuilderActionBase

public class BuilderActionRandom extends BuilderActionBase

Builds an `ActionRandom` that selects randomly from a weighted list of child actions.

Also in this package: BuilderActionNothing, BuilderActionResetInstructions, BuilderActionSequence, BuilderActionSetFlag, BuilderActionTimeout, BuilderBodyMotionNothing, BuilderBodyMotionSequence, BuilderHeadMotionNothing, BuilderHeadMotionSequence, BuilderMotionSequence, BuilderSensorAdjustPosition, BuilderSensorAnd, BuilderSensorAny, BuilderSensorEval, BuilderSensorFlag, BuilderSensorMany, BuilderSensorNot, BuilderSensorOr, BuilderSensorRandom, BuilderSensorSwitch (and 3 more)

Complete API:
  public ActionRandom build(BuilderSupport builderSupport)
  public BuilderActionRandom readConfig(JsonElement data)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public List<WeightedAction> getActions(BuilderSupport builderSupport)

Fields:
protected final BuilderObjectListHelper<WeightedAction> actions
