# StateOption

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.stateevaluator | Extends: Option

public class StateOption extends Option

Concrete implementation extending `Option`.

## Fields

- state | String | String field.
- subState | String | String field.
- stateIndex | int | int field.
- subStateIndex | int | int field.

## Constructors

- StateOption() | Creates a new StateOption instance.

## Methods

- getState() | String | public method.
- getSubState() | String | public method.
- getStateIndex() | int | public method.
- getSubStateIndex() | int | public method.
- setStateIndex(int stateIndex, int subStateIndex) | void | public method.
- toString() | String | public method.

Also in this package: SelfOptionHolder, StateEvaluator

Complete API:
  public String getState()
  public String getSubState()
  public int getStateIndex()
  public int getSubStateIndex()
  public void setStateIndex(int stateIndex, int subStateIndex)
  public String toString()

Fields:
public static final BuilderCodec<StateOption> CODEC
protected String state
protected String subState
protected int stateIndex
protected int subStateIndex
