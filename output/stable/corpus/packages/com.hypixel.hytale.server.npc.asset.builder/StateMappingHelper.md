# StateMappingHelper

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder

public class StateMappingHelper

Manages the bidirectional mapping between state names and integer indices for the NPC state machine system. Supports a two-level hierarchy of main states and sub-states. Tracks which states are used by sensors, setters, and requirers to validate consistency. Also manages component-level local state machines and imported state mappings for component references.

## Constants

- DEFAULT_STATE | "start"
- DEFAULT_SUB_STATE | "Default"
- DEFAULT_STATE_PARAMETER | "DefaultState"
- STATE_CHANGE_RESET_PARAMETER | "ResetOnStateChange"

## Key Methods

### getAndPutSensorIndex / getAndPutSetterIndex / getAndPutStateRequirerIndex


public void getAndPutSensorIndex(String state, String subState, @Nonnull BiConsumer<Integer, Integer> setter)
public void getAndPutSetterIndex(String state, String subState, @Nonnull BiConsumer<Integer, Integer> setter)
public void getAndPutStateRequirerIndex(String state, String subState, @Nonnull BiConsumer<Integer, Integer> setter)

Register state usage by sensors, setters, or parameter requirers, and return the main and sub-state indices via the callback.

### validate


public void validate(String configName, @Nonnull List<String> errors)

Validates that every sensor state has a corresponding setter and vice versa, and that required states exist.

### getStateIndex / getSubStateIndex / getStateName / getSubStateName


public int getStateIndex(String state)
public int getSubStateIndex(int index, String subState)
public String getStateName(int index)
public String getSubStateName(int index, int subState)

### Component State Management


public void setNotComponent()
public boolean isComponent()
public boolean hasComponentStates()
public void initialiseComponentState(@Nonnull BuilderSupport support)
public void popComponentState(@Nonnull BuilderSupport support)
public void readComponentDefaultLocalState(@Nonnull JsonObject data)

### State Import for Components


public void setComponentImportStateMappings(@Nonnull JsonArray states)
public int getComponentImportStateIndex(String state)
public int importedStateCount()

### Depth Tracking


public void increaseDepth()
public void decreaseDepth()
@Nullable
public String getCurrentParentState()

### optimise


public void optimise()

Releases validation-only data structures after validation completes.

## Inner Types

### IStateMap (private interface)

Internal interface for state index mapping.

### StateMap (private class)

Full implementation tracking sensors, setters, and requirers via `BitSet`.

### SingletonStateMap (private class)

Optimized implementation for states with only one sub-state.

### StateDepth (private class)

Tracks the depth and state name for parent state resolution.

## Related Types

- BuilderSupport -- uses this for state machine setup
- BuilderModifier -- exports states via this helper
- BuilderParameters -- imports states via this helper
- StatePair -- represents a main/sub-state pair
- Builder -- `getStateMappingHelper()` returns this type

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper (and 28 more)

Complete API:
  public int[] getAllMainStates()
  public int getHighestSubStateIndex(int mainStateIndex)
  public void getAndPutSensorIndex(String state, String subState, BiConsumer<Integer,Integer> setter)
  public void getAndPutSetterIndex(String state, String subState, BiConsumer<Integer,Integer> setter)
  public void getAndPutStateRequirerIndex(String state, String subState, BiConsumer<Integer,Integer> setter)
  private void getAndPutIndex(String state, String subState, BiConsumer<Integer,Integer> setter, Function<String,Integer> mainStateFunction, BiFunction<Integer,String,Integer> subStateFunction)
  private StateMappingHelper.IStateMap initialiseDefaultSubStates(int index)
  public void validate(String configName, List<String> errors)
  public int getStateIndex(String state)
  public int getSubStateIndex(int index, String subState)
  public String getStateName(int index)
  public String getSubStateName(int index, int subState)
  public String getCurrentParentState()
  public void increaseDepth()
  public void decreaseDepth()
  public void setDefaultSubState(String subState)
  public String getDefaultSubState()
  public void setNotComponent()
  public boolean isComponent()
  public boolean hasComponentStates()
  public void initialiseComponentState(BuilderSupport support)
  public void popComponentState(BuilderSupport support)
  public void readComponentDefaultLocalState(JsonObject data)
  public boolean hasDefaultLocalState()
  public String getDefaultLocalState()
  public void setComponentImportStateMappings(JsonArray states)
  public int getComponentImportStateIndex(String state)
  public int importedStateCount()
  public void setRequiresStateEvaluator()
  public void setHasStateEvaluator()
  public void optimise()

Fields:
public static final String DEFAULT_STATE
public static final String DEFAULT_SUB_STATE
public static final String DEFAULT_STATE_PARAMETER
public static final String STATE_CHANGE_RESET_PARAMETER
private StateMappingHelper.StateMap mainStateMap
private int[] allMainStates
private Int2ObjectOpenHashMap<StateMappingHelper.IStateMap> subStateMap
private int depth
private ArrayDeque<StateMappingHelper.StateDepth> currentParentState
private boolean component
private boolean hasStateEvaluator
private boolean requiresStateEvaluator
private String defaultSubState
private String defaultComponentLocalState
private int defaultComponentLocalStateIndex
private boolean componentLocalStateAutoReset
private Object2IntOpenHashMap<String> componentImportStateMappings
private StateMappingHelper.SingletonStateMap singletonDefaultStateMap
