# BuilderSensorFlag

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility.builders | Extends: BuilderSensorBase

public class BuilderSensorFlag extends BuilderSensorBase

Builds a sensor that checks whether a named flag is set on the NPC blackboard.

Also in this package: BuilderActionNothing, BuilderActionRandom, BuilderActionResetInstructions, BuilderActionSequence, BuilderActionSetFlag, BuilderActionTimeout, BuilderBodyMotionNothing, BuilderBodyMotionSequence, BuilderHeadMotionNothing, BuilderHeadMotionSequence, BuilderMotionSequence, BuilderSensorAdjustPosition, BuilderSensorAnd, BuilderSensorAny, BuilderSensorEval, BuilderSensorMany, BuilderSensorNot, BuilderSensorOr, BuilderSensorRandom, BuilderSensorSwitch (and 3 more)

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Sensor build(BuilderSupport builderSupport)
  public Builder<Sensor> readConfig(JsonElement data)
  public BuilderDescriptorState getBuilderDescriptorState()
  public int getFlagSlot(BuilderSupport support)
  public boolean getValue(BuilderSupport support)

Fields:
protected final StringHolder name
protected final BooleanHolder value
