# StateEvaluator

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.stateevaluator | Extends: Evaluator<StateOption> | Implements: Component<EntityStore>

public class StateEvaluator extends Evaluator<StateOption> implements Component<EntityStore>

Implementation of `Component<EntityStore>`.

## Fields

- rawOptions | StateOption[] | StateOption[] field.
- executeFrequency | double | double field.
- stateChangeCooldown | double | double field.
- minimumUtility | double | double field.
- timeUntilNextExecute | double | double field.
- active | boolean | boolean field.

## Constructors

- StateEvaluator() | Creates a new StateEvaluator instance.

## Methods

- getComponentType() | ComponentType<EntityStore, StateEvaluator> | static public method.
- isActive() | boolean | public method.
- setActive(boolean active) | void | public method.
- getEvaluationContext() | EvaluationContext | public method.
- prepareOptions(@Nonnull StateMappingHelper stateHelper) | void | public method.
- shouldExecute(double interval) | boolean | public method.
- prepareEvaluationContext(@Nonnull EvaluationContext context) | void | public method.
- onStateSwitched() | void | public method.
- toString() | String | public method.
- clone() | Component<EntityStore> | public method.
