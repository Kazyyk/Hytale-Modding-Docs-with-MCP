# BuilderActionResetInstructions

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility.builders | Extends: BuilderActionBase

public class BuilderActionResetInstructions extends BuilderActionBase

Builds an `ActionResetInstructions` that resets the NPC's instruction set.

Also in this package: BuilderActionNothing, BuilderActionRandom, BuilderActionSequence, BuilderActionSetFlag, BuilderActionTimeout, BuilderBodyMotionNothing, BuilderBodyMotionSequence, BuilderHeadMotionNothing, BuilderHeadMotionSequence, BuilderMotionSequence, BuilderSensorAdjustPosition, BuilderSensorAnd, BuilderSensorAny, BuilderSensorEval, BuilderSensorFlag, BuilderSensorMany, BuilderSensorNot, BuilderSensorOr, BuilderSensorRandom, BuilderSensorSwitch (and 3 more)

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Action build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionResetInstructions readConfig(JsonElement data)
  public int[] getInstructions(BuilderSupport support)

Fields:
protected final StringArrayHolder instructions
