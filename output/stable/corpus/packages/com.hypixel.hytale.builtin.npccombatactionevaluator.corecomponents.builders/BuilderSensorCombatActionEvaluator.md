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
