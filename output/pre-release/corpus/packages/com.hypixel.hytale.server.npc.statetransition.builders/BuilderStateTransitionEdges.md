# BuilderStateTransitionEdges

Type: class | Package: com.hypixel.hytale.server.npc.statetransition.builders

public class BuilderStateTransitionEdges

Builder for constructing state transition edge definitions that connect NPC states.

Also in this package: BuilderStateTransition, BuilderStateTransitionController, StateTransition, StateTransitionEdges

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public BuilderStateTransitionEdges.StateTransitionEdges build(BuilderSupport builderSupport)
  public Class<BuilderStateTransitionEdges.StateTransitionEdges> category()
  public BuilderDescriptorState getBuilderDescriptorState()
  public boolean isEnabled(ExecutionContext context)
  public Builder<BuilderStateTransitionEdges.StateTransitionEdges> readConfig(JsonElement data)

Fields:
protected String[] fromStates
protected String[] toStates
protected int[] fromStateIndices
protected int[] toStateIndices
protected int priority
protected final BooleanHolder enabled
protected BuilderStateTransitionEdges.StateTransitionEdges builtStateTransitionEdges
