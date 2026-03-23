# BuilderMotionSequence

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility.builders

public class BuilderMotionSequence

Shared builder for motion sequence entries used by both body and head motion sequence builders.

Known subclasses: BuilderBodyMotionSequence, BuilderHeadMotionSequence

Also in this package: BuilderActionNothing, BuilderActionRandom, BuilderActionResetInstructions, BuilderActionSequence, BuilderActionSetFlag, BuilderActionTimeout, BuilderBodyMotionNothing, BuilderBodyMotionSequence, BuilderHeadMotionNothing, BuilderHeadMotionSequence, BuilderSensorAdjustPosition, BuilderSensorAnd, BuilderSensorAny, BuilderSensorEval, BuilderSensorFlag, BuilderSensorMany, BuilderSensorNot, BuilderSensorOr, BuilderSensorRandom, BuilderSensorSwitch (and 3 more)

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderMotionSequence<T> readConfig(JsonElement data)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public boolean isLooped()
  public boolean isRestartOnActivate()

Fields:
protected BuilderObjectListHelper<T> steps
protected boolean looped
protected boolean restartOnActivate
