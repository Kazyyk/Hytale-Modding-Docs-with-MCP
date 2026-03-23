# BuilderSensorCombatActionEvaluator

Type: class | Package: com.hypixel.hytale.builtin.npccombatactionevaluator.corecomponents.builders | Extends: BuilderSensorBase

public class BuilderSensorCombatActionEvaluator extends BuilderSensorBase

NPC behavior tree builder for a sensor node. Configures detection or query logic.

## Fields

- minRangeStoreSlot | ToIntFunction<BuilderSupport> | ToIntFunction<BuilderSupport> field.
- maxRangeStoreSlot | ToIntFunction<BuilderSupport> | ToIntFunction<BuilderSupport> field.
- positioningAngleStoreSlot | ToIntFunction<BuilderSupport> | ToIntFunction<BuilderSupport> field.

## Methods

- build(@Nonnull BuilderSupport builderSupport) | Sensor | public method.
- getShortDescription() | String | public method.
- getLongDescription() | String | public method.
- getBuilderDescriptorState() | BuilderDescriptorState | public method.
- readConfig(@Nonnull JsonElement data) | BuilderSensorCombatActionEvaluator | public method.
- isTargetInRange(@Nonnull BuilderSupport support) | boolean | public method.
- getMinRangeStoreSlot(BuilderSupport support) | int | public method.
- getMaxRangeStoreSlot(BuilderSupport support) | int | public method.
- getPositioningAngleStoreSlot(BuilderSupport support) | int | public method.
- getAllowableDeviation(@Nonnull BuilderSupport support) | double | public method.
- getTargetSlot(@Nonnull BuilderSupport support) | int | public method.

Also in this package: BuilderActionAddToTargetMemory, BuilderActionCombatAbility, BuilderCombatTargetCollector, BuilderSensorHasHostileTargetMemory

Complete API:
  public Sensor build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderSensorCombatActionEvaluator readConfig(JsonElement data)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public boolean isTargetInRange(BuilderSupport support)
  public int getMinRangeStoreSlot(BuilderSupport support)
  public int getMaxRangeStoreSlot(BuilderSupport support)
  public int getPositioningAngleStoreSlot(BuilderSupport support)
  public double getAllowableDeviation(BuilderSupport support)
  public int getTargetSlot(BuilderSupport support)

Fields:
protected final BooleanHolder targetInRange
protected final DoubleHolder allowableDeviation
protected ToIntFunction<BuilderSupport> minRangeStoreSlot
protected ToIntFunction<BuilderSupport> maxRangeStoreSlot
protected ToIntFunction<BuilderSupport> positioningAngleStoreSlot
