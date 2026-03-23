# BuilderActionTimeout

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility.builders | Extends: BuilderActionBase

public class BuilderActionTimeout extends BuilderActionBase

Builds an `ActionTimeout` that wraps a child action with a configurable time limit.

Also in this package: BuilderActionNothing, BuilderActionRandom, BuilderActionResetInstructions, BuilderActionSequence, BuilderActionSetFlag, BuilderBodyMotionNothing, BuilderBodyMotionSequence, BuilderHeadMotionNothing, BuilderHeadMotionSequence, BuilderMotionSequence, BuilderSensorAdjustPosition, BuilderSensorAnd, BuilderSensorAny, BuilderSensorEval, BuilderSensorFlag, BuilderSensorMany, BuilderSensorNot, BuilderSensorOr, BuilderSensorRandom, BuilderSensorSwitch (and 3 more)

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public ActionTimeout build(BuilderSupport builderSupport)
  public BuilderActionTimeout readConfig(JsonElement data)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public boolean isDelayAfter()
  public Action getAction(BuilderSupport builderSupport)

Fields:
protected boolean delayAfter
protected final BuilderObjectReferenceHelper<Action> action
