# BuilderValueToParameterMapping

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility.builders

public class BuilderValueToParameterMapping

Builder for mapping value provider outputs to NPC action parameters.

Also in this package: BuilderActionNothing, BuilderActionRandom, BuilderActionResetInstructions, BuilderActionSequence, BuilderActionSetFlag, BuilderActionTimeout, BuilderBodyMotionNothing, BuilderBodyMotionSequence, BuilderHeadMotionNothing, BuilderHeadMotionSequence, BuilderMotionSequence, BuilderSensorAdjustPosition, BuilderSensorAnd, BuilderSensorAny, BuilderSensorEval, BuilderSensorFlag, BuilderSensorMany, BuilderSensorNot, BuilderSensorOr, BuilderSensorRandom (and 3 more)

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public BuilderValueToParameterMapping.ValueToParameterMapping build(BuilderSupport builderSupport)
  public Class<BuilderValueToParameterMapping.ValueToParameterMapping> category()
  public BuilderDescriptorState getBuilderDescriptorState()
  public boolean isEnabled(ExecutionContext context)
  public Builder<BuilderValueToParameterMapping.ValueToParameterMapping> readConfig(JsonElement data)
  public ValueStore.Type getType()
  public int getFromSlot(BuilderSupport support)
  public String getToParameter()

Fields:
protected ValueStore.Type type
protected String fromValue
protected ToIntFunction<BuilderSupport> fromSlot
protected String toParameter
