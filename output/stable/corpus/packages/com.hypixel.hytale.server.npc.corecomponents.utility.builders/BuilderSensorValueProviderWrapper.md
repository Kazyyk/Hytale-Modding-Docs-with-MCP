# BuilderSensorValueProviderWrapper

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility.builders | Extends: BuilderSensorBase

public class BuilderSensorValueProviderWrapper extends BuilderSensorBase

Builds a sensor that wraps a value provider, returning true when the provided value meets a condition.

Also in this package: BuilderActionNothing, BuilderActionRandom, BuilderActionResetInstructions, BuilderActionSequence, BuilderActionSetFlag, BuilderActionTimeout, BuilderBodyMotionNothing, BuilderBodyMotionSequence, BuilderHeadMotionNothing, BuilderHeadMotionSequence, BuilderMotionSequence, BuilderSensorAdjustPosition, BuilderSensorAnd, BuilderSensorAny, BuilderSensorEval, BuilderSensorFlag, BuilderSensorMany, BuilderSensorNot, BuilderSensorOr, BuilderSensorRandom (and 3 more)

Complete API:
  public SensorValueProviderWrapper build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public void registerTags(Set<String> tags)
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderSensorValueProviderWrapper readConfig(JsonElement data)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public boolean isPassValues(BuilderSupport support)
  public Sensor getSensor(BuilderSupport support)
  public List<BuilderValueToParameterMapping.ValueToParameterMapping> getParameterMappings(BuilderSupport support)

Fields:
protected final BooleanHolder passValues
protected final BuilderObjectReferenceHelper<Sensor> sensor
protected final BuilderObjectStaticListHelper<BuilderValueToParameterMapping.ValueToParameterMapping> parameterMappings
