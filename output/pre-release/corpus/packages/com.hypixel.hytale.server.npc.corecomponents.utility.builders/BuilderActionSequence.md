# BuilderActionSequence

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility.builders | Extends: BuilderActionBase

public class BuilderActionSequence extends BuilderActionBase

Builds an `ActionSequence` that executes a list of child actions in order.

Also in this package: BuilderActionNothing, BuilderActionRandom, BuilderActionResetInstructions, BuilderActionSetFlag, BuilderActionTimeout, BuilderBodyMotionNothing, BuilderBodyMotionSequence, BuilderHeadMotionNothing, BuilderHeadMotionSequence, BuilderMotionSequence, BuilderSensorAdjustPosition, BuilderSensorAnd, BuilderSensorAny, BuilderSensorEval, BuilderSensorFlag, BuilderSensorMany, BuilderSensorNot, BuilderSensorOr, BuilderSensorRandom, BuilderSensorSwitch (and 3 more)

Complete API:
  public ActionSequence build(BuilderSupport builderSupport)
  public BuilderActionSequence readConfig(JsonElement data)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public ActionList getActionList(BuilderSupport builderSupport)

Fields:
protected final BuilderObjectReferenceHelper<ActionList> actions
protected boolean blocking
protected boolean atomic
