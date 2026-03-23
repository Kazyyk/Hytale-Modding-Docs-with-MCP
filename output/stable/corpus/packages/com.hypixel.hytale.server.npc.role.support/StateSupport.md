# StateSupport

Type: class | Package: com.hypixel.hytale.server.npc.role.support

public class StateSupport

Behavior state machine for NPC roles. Manages the primary state/sub-state pair, component-local state machines, busy states, state transitions, and NPC interaction tracking. States are mapped by name to integer indices via `StateMappingHelper`. State changes can trigger transition actions through the `StateTransitionController` and can be propagated to flock members.

## Constants

- public static final int NO_STATE

## Constructors

- public StateSupport(@Nonnull BuilderRole builder, @Nonnull BuilderSupport support)

## State Query Methods

- public boolean inState(int state)
- public boolean inSubState(int subState)
- public boolean inState(int state, int subState)
- public boolean inState(String state, String subState)
- @Nonnull public String getStateName()
- @Nonnull public String getStateName(int state, int subState)
- public int getStateIndex()
- public int getSubStateIndex()
- public void appendStateName(@Nonnull StringBuilder builder)

## State Mutation Methods

- public void setState(int state, int subState, boolean clearOnce, boolean skipTransition)
- public void setState(@Nonnull Ref<EntityStore> ref, @Nonnull String state, @Nullable String subState, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public void setSubState(String subState)
- public void flockSetState(Ref<EntityStore> ref, @Nonnull String state, @Nullable String subState, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public void activate()

## Component Local State Machines

- public boolean isComponentInState(int componentIndex, int targetState)
- public void setComponentState(int componentIndex, int targetState)
- public void resetLocalStateMachines()

## Interaction Methods

- public void addContextualInteraction(@Nonnull Ref<EntityStore> playerRef, @Nonnull String context)
- public boolean hasContextualInteraction(@Nonnull Ref<EntityStore> playerReference, @Nonnull String context)
- public void addInteraction(@Nonnull Player player)
- public boolean consumeInteraction(@Nonnull Ref<EntityStore> playerReference)
- public void setInteractable(@Nonnull Ref<EntityStore> entityRef, @Nonnull Ref<EntityStore> playerReference, boolean interactable, @Nullable String hint, boolean showPrompt, @Nonnull Store<EntityStore> store)
- public boolean willInteractWith(@Nonnull Ref<EntityStore> playerReference)
- public boolean isInBusyState()

## Transition Methods

- @Nullable public StateTransitionController getStateTransitionController()
- public boolean runTransitionActions(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)
- public boolean isRunningTransitionActions()

Also in this package: CombatSupport, DebugFlagsChangeListener, DebugSupport, EntityList, EntitySupport, EntityVisData, LineOfSightBuffer, LineOfSightEntityBuffer, MarkedEntitySupport, PositionCache, RangeType, RayPredicate, RoleStats, SensorVisData, WorldSupport

Complete API:
  public StateTransitionController getStateTransitionController()
  public StateMappingHelper getStateHelper()
  public void postRoleBuilt(BuilderSupport builderSupport)
  public void update(ComponentAccessor<EntityStore> componentAccessor)
  public boolean pollNeedClearOnce()
  public boolean inState(int state)
  public boolean inSubState(int subState)
  public boolean inState(int state, int subState)
  public boolean inState(String state, String subState)
  public String getStateName()
  public String getStateName(int state, int subState)
  public int getStateIndex()
  public int getSubStateIndex()
  public void appendStateName(StringBuilder builder)
  public void setState(int state, int subState, boolean clearOnce, boolean skipTransition)
  public void setState(Ref<EntityStore> ref, String state, String subState, ComponentAccessor<EntityStore> componentAccessor)
  public void setSubState(String subState)
  public boolean isComponentInState(int componentIndex, int targetState)
  public void setComponentState(int componentIndex, int targetState)
  public void resetLocalStateMachines()
  public void flockSetState(Ref<EntityStore> ref, String state, String subState, ComponentAccessor<EntityStore> componentAccessor)
  public boolean isInBusyState()
  public void addContextualInteraction(Ref<EntityStore> playerRef, String context)
  public boolean hasContextualInteraction(Ref<EntityStore> playerReference, String context)
  public void addInteraction(Player player)
  public boolean consumeInteraction(Ref<EntityStore> playerReference)
  public void setInteractable(Ref<EntityStore> playerReference, boolean interactable)
  public void setInteractable(Ref<EntityStore> entityRef, Ref<EntityStore> playerReference, boolean interactable, String hint, boolean showPrompt, Store<EntityStore> store)
  private void sendInteractionHintToPlayer(Ref<EntityStore> entityRef, Ref<EntityStore> playerReference, String hint, Store<EntityStore> store)
  public void setInteractionIterationTarget(Ref<EntityStore> playerReference)
  public Ref<EntityStore> getInteractionIterationTarget()
  public boolean willInteractWith(Ref<EntityStore> playerReference)
  public boolean runTransitionActions(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public boolean isRunningTransitionActions()
  public void activate()

Fields:
public static final int NO_STATE
protected static final ComponentType<EntityStore,NPCEntity> NPC_COMPONENT_TYPE
protected final StateMappingHelper stateHelper
protected final int startState
protected final int startSubState
protected int state
protected int subState
protected Int2IntMap componentLocalStateMachines
protected BitSet localStateMachineAutoResetStates
protected final Int2ObjectMap<IntSet> busyStates
protected final HashSet<String> missingStates
protected boolean needClearOnce
protected Set<Ref<EntityStore>> interactablePlayers
protected Set<Ref<EntityStore>> interactedPlayers
protected Map<Ref<EntityStore>,String> contextualInteractions
protected String lastHint
protected Ref<EntityStore> interactionIterationTarget
protected final StateTransitionController stateTransitionController
