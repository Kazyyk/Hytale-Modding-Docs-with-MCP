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

Also in this package: SelfOptionHolder, StateOption

Complete API:
  public static ComponentType<EntityStore,StateEvaluator> getComponentType()
  public boolean isActive()
  public void setActive(boolean active)
  public EvaluationContext getEvaluationContext()
  public void prepareOptions(StateMappingHelper stateHelper)
  public boolean shouldExecute(double interval)
  public void prepareEvaluationContext(EvaluationContext context)
  public void onStateSwitched()
  public String toString()
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<StateEvaluator> CODEC
protected StateOption[] rawOptions
protected double executeFrequency
protected double stateChangeCooldown
protected double minimumUtility
private double timeUntilNextExecute
private boolean active
private final EvaluationContext evaluationContext
