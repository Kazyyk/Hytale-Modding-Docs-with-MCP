# BuilderActionList

Type: class | Package: com.hypixel.hytale.server.npc.instructions.builders

public class BuilderActionList

Builder for constructing ordered lists of NPC actions from asset configuration data.

Also in this package: BuilderInstruction, BuilderInstructionRandomized, BuilderInstructionReference

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public ActionList build(BuilderSupport builderSupport)
  public Class<ActionList> category()
  public BuilderDescriptorState getBuilderDescriptorState()
  public boolean isEnabled(ExecutionContext context)
  public BuilderActionList readConfig(JsonElement data)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)

Fields:
protected final BuilderObjectListHelper<Action> actions
