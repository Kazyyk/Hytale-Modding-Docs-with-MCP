# BuilderSensorNot

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility.builders | Extends: BuilderSensorBase

public class BuilderSensorNot extends BuilderSensorBase

Builds a sensor that inverts the result of a child sensor (logical NOT).

Also in this package: BuilderActionNothing, BuilderActionRandom, BuilderActionResetInstructions, BuilderActionSequence, BuilderActionSetFlag, BuilderActionTimeout, BuilderBodyMotionNothing, BuilderBodyMotionSequence, BuilderHeadMotionNothing, BuilderHeadMotionSequence, BuilderMotionSequence, BuilderSensorAdjustPosition, BuilderSensorAnd, BuilderSensorAny, BuilderSensorEval, BuilderSensorFlag, BuilderSensorMany, BuilderSensorOr, BuilderSensorRandom, BuilderSensorSwitch (and 3 more)

Complete API:
  public SensorNot build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public void registerTags(Set<String> tags)
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderSensorNot readConfig(JsonElement data)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public Sensor getSensor(BuilderSupport support)
  public int getUsedTargetSlot(BuilderSupport support)
  public int getAutoUnlockTargetSlot(BuilderSupport support)

Fields:
protected final BuilderObjectReferenceHelper<Sensor> sensor
protected final StringHolder targetSlot
protected final StringHolder autoUnlockTargetSlot
