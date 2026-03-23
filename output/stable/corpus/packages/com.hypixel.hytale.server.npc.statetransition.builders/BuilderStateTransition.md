# BuilderStateTransition

Type: class | Package: com.hypixel.hytale.server.npc.statetransition.builders

public class BuilderStateTransition

Builder for constructing NPC state transition definitions from asset configuration data.

Also in this package: BuilderStateTransitionController, BuilderStateTransitionEdges, StateTransition, StateTransitionEdges

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public BuilderStateTransition.StateTransition build(BuilderSupport builderSupport)
  public Class<BuilderStateTransition.StateTransition> category()
  public BuilderDescriptorState getBuilderDescriptorState()
  public boolean isEnabled(ExecutionContext context)
  public Builder<BuilderStateTransition.StateTransition> readConfig(JsonElement data)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public List<BuilderStateTransitionEdges.StateTransitionEdges> getStateTransitionEdges(BuilderSupport support)
  public ActionList getActionList(BuilderSupport builderSupport)

Fields:
protected final BuilderObjectStaticListHelper<BuilderStateTransitionEdges.StateTransitionEdges> stateTransitionEdges
protected final BuilderObjectReferenceHelper<ActionList> actions
protected final BooleanHolder enabled
