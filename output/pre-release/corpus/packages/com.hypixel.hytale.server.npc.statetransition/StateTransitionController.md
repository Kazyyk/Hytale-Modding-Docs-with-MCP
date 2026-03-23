# StateTransitionController

Type: class | Package: com.hypixel.hytale.server.npc.statetransition

public class StateTransitionController

Manages NPC state transition actions. Maps (from-state, to-state) pairs to prioritized action lists that execute during transitions. Built from `BuilderStateTransitionController` configuration.

Also in this package: CompositeActionList, IActionListHolder, PrioritisedActionList

Complete API:
  public void registerWithSupport(Role role)
  public void motionControllerChanged(Ref<EntityStore> ref, NPCEntity npcComponent, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  public void loaded(Role role)
  public void spawned(Role role)
  public void unloaded(Role role)
  public void removed(Role role)
  public void teleported(Role role, World from, World to)
  public void clearOnce()
  public void initiateStateTransition(int fromState, int toState)
  public boolean isRunningTransitionActions()
  public boolean runTransitionActions(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public static void registerFactories(BuilderManager builderManager)
  public static int indexStateTransitionEdge(int from, int to)

Fields:
private final Int2ObjectOpenHashMap<StateTransitionController.IActionListHolder> stateTransitionActions
private StateTransitionController.IActionListHolder runningActions
