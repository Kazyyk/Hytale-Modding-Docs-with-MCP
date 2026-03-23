# BuilderStateTransitionController

Type: class | Package: com.hypixel.hytale.server.npc.statetransition.builders

public class BuilderStateTransitionController

Builder for constructing NPC state transition controller configurations from asset data.

Also in this package: BuilderStateTransition, BuilderStateTransitionEdges, StateTransition, StateTransitionEdges

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public StateTransitionController build(BuilderSupport builderSupport)
  public Class<StateTransitionController> category()
  public BuilderDescriptorState getBuilderDescriptorState()
  public boolean isEnabled(ExecutionContext context)
  public Builder<StateTransitionController> readConfig(JsonElement data)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public List<BuilderStateTransition.StateTransition> getStateTransitionEntries(BuilderSupport support)

Fields:
protected final BuilderObjectListHelper<BuilderStateTransition.StateTransition> stateTransitionEntries
