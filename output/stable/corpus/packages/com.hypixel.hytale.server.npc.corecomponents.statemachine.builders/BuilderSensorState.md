# BuilderSensorState

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.statemachine.builders | Extends: BuilderSensorBase

public class BuilderSensorState extends BuilderSensorBase

NPC behavior tree builder for a sensor node. Configures detection or query logic.

## Fields

- state | String | String field.
- subState | String | String field.
- stateIndex | int | int field.
- subStateIndex | int | int field.
- defaultSubState | boolean | boolean field.
- ignoreMissingSetState | boolean | boolean field.
- componentLocal | boolean | boolean field.

## Methods

- build(@Nonnull BuilderSupport builderSupport) | SensorState | public method.
- getShortDescription() | String | public method.
- getLongDescription() | String | public method.
- getBuilderDescriptorState() | BuilderDescriptorState | public method.
- readConfig(@Nonnull JsonElement data) | Builder<Sensor> | public method.
- getState() | int | public method.
- setIndexes(int main, int sub) | void | public method.
- isDefaultSubState() | boolean | public method.
- getSubStateIndex() | int | public method.
- isComponentLocal() | boolean | public method.

Also in this package: BuilderActionParentState, BuilderActionState, BuilderActionToggleStateEvaluator, BuilderSensorIsBusy

Complete API:
  public SensorState build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public int getState()
  public void setIndexes(int main, int sub)
  public boolean isDefaultSubState()
  public int getSubStateIndex()
  public boolean isComponentLocal()

Fields:
protected String state
protected String subState
protected int stateIndex
protected int subStateIndex
protected boolean defaultSubState
protected boolean ignoreMissingSetState
protected boolean componentLocal
