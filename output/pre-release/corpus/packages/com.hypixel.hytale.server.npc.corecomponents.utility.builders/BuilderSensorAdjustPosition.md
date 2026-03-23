# BuilderSensorAdjustPosition

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility.builders | Extends: BuilderSensorBase

public class BuilderSensorAdjustPosition extends BuilderSensorBase

Builds a sensor that adjusts the NPC's target position based on configurable offset parameters.

Also in this package: BuilderActionNothing, BuilderActionRandom, BuilderActionResetInstructions, BuilderActionSequence, BuilderActionSetFlag, BuilderActionTimeout, BuilderBodyMotionNothing, BuilderBodyMotionSequence, BuilderHeadMotionNothing, BuilderHeadMotionSequence, BuilderMotionSequence, BuilderSensorAnd, BuilderSensorAny, BuilderSensorEval, BuilderSensorFlag, BuilderSensorMany, BuilderSensorNot, BuilderSensorOr, BuilderSensorRandom, BuilderSensorSwitch (and 3 more)

Complete API:
  public SensorAdjustPosition build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public void registerTags(Set<String> tags)
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderSensorAdjustPosition readConfig(JsonElement data)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public Sensor getSensor(BuilderSupport support)
  public Vector3d getOffset(BuilderSupport support)

Fields:
protected final BuilderObjectReferenceHelper<Sensor> sensor
protected final NumberArrayHolder offset
