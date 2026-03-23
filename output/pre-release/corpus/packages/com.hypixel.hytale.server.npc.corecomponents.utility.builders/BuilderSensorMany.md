# BuilderSensorMany

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility.builders | Extends: BuilderSensorBase

public class BuilderSensorMany extends BuilderSensorBase

Builds a composite sensor operating on multiple child sensors with configurable aggregation.

Known subclasses: BuilderSensorAnd, BuilderSensorOr

Also in this package: BuilderActionNothing, BuilderActionRandom, BuilderActionResetInstructions, BuilderActionSequence, BuilderActionSetFlag, BuilderActionTimeout, BuilderBodyMotionNothing, BuilderBodyMotionSequence, BuilderHeadMotionNothing, BuilderHeadMotionSequence, BuilderMotionSequence, BuilderSensorAdjustPosition, BuilderSensorAnd, BuilderSensorAny, BuilderSensorEval, BuilderSensorFlag, BuilderSensorNot, BuilderSensorOr, BuilderSensorRandom, BuilderSensorSwitch (and 3 more)

Complete API:
  public void registerTags(Set<String> tags)
  public Builder<Sensor> readConfig(JsonElement data)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public int getAutoUnlockedTargetSlot(BuilderSupport support)

Fields:
protected BuilderObjectListHelper<Sensor> objectListHelper
protected final StringHolder unlockTargetSlot
