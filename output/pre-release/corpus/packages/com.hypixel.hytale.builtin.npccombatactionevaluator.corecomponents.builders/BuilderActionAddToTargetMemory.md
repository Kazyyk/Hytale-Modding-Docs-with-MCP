# BuilderActionAddToTargetMemory

Type: class | Package: com.hypixel.hytale.builtin.npccombatactionevaluator.corecomponents.builders | Extends: BuilderActionBase

public class BuilderActionAddToTargetMemory extends BuilderActionBase

NPC behavior tree builder for an action node. Configures execution logic.

## Methods

- getShortDescription() | String | public method.
- getLongDescription() | String | public method.
- build(BuilderSupport builderSupport) | Action | public method.
- getBuilderDescriptorState() | BuilderDescriptorState | public method.
- readConfig(JsonElement data) | Builder<Action> | public method.

Also in this package: BuilderActionCombatAbility, BuilderCombatTargetCollector, BuilderSensorCombatActionEvaluator, BuilderSensorHasHostileTargetMemory

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Action build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Action> readConfig(JsonElement data)
