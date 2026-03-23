# BuilderSensorSwitch

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility.builders | Extends: BuilderSensorBase

public class BuilderSensorSwitch extends BuilderSensorBase

Builds a sensor that selects between child sensors based on a switch condition.

Also in this package: BuilderActionNothing, BuilderActionRandom, BuilderActionResetInstructions, BuilderActionSequence, BuilderActionSetFlag, BuilderActionTimeout, BuilderBodyMotionNothing, BuilderBodyMotionSequence, BuilderHeadMotionNothing, BuilderHeadMotionSequence, BuilderMotionSequence, BuilderSensorAdjustPosition, BuilderSensorAnd, BuilderSensorAny, BuilderSensorEval, BuilderSensorFlag, BuilderSensorMany, BuilderSensorNot, BuilderSensorOr, BuilderSensorRandom (and 3 more)

Complete API:
  public SensorSwitch build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public void registerTags(Set<String> tags)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public boolean getSwitch(BuilderSupport builderSupport)

Fields:
protected final BooleanHolder switchHolder
