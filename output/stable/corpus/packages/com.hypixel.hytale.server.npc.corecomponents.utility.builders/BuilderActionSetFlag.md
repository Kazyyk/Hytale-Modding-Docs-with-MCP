# BuilderActionSetFlag

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility.builders | Extends: BuilderActionBase

public class BuilderActionSetFlag extends BuilderActionBase

Builds an `ActionSetFlag` that sets a named flag on the NPC blackboard.

Also in this package: BuilderActionNothing, BuilderActionRandom, BuilderActionResetInstructions, BuilderActionSequence, BuilderActionTimeout, BuilderBodyMotionNothing, BuilderBodyMotionSequence, BuilderHeadMotionNothing, BuilderHeadMotionSequence, BuilderMotionSequence, BuilderSensorAdjustPosition, BuilderSensorAnd, BuilderSensorAny, BuilderSensorEval, BuilderSensorFlag, BuilderSensorMany, BuilderSensorNot, BuilderSensorOr, BuilderSensorRandom, BuilderSensorSwitch (and 3 more)

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Action build(BuilderSupport builderSupport)
  public BuilderActionSetFlag readConfig(JsonElement data)
  public BuilderDescriptorState getBuilderDescriptorState()
  public int getFlagSlot(BuilderSupport support)
  public boolean getValue(BuilderSupport support)

Fields:
protected final StringHolder name
protected final BooleanHolder value
