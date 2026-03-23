# BuilderSensorEval

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility.builders | Extends: BuilderSensorBase

public class BuilderSensorEval extends BuilderSensorBase

Builds a sensor that evaluates an expression against the NPC's blackboard context.

Also in this package: BuilderActionNothing, BuilderActionRandom, BuilderActionResetInstructions, BuilderActionSequence, BuilderActionSetFlag, BuilderActionTimeout, BuilderBodyMotionNothing, BuilderBodyMotionSequence, BuilderHeadMotionNothing, BuilderHeadMotionSequence, BuilderMotionSequence, BuilderSensorAdjustPosition, BuilderSensorAnd, BuilderSensorAny, BuilderSensorFlag, BuilderSensorMany, BuilderSensorNot, BuilderSensorOr, BuilderSensorRandom, BuilderSensorSwitch (and 3 more)

Complete API:
  public SensorEval build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public String getExpression()

Fields:
protected String expression
