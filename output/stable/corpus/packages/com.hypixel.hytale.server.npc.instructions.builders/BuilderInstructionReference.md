# BuilderInstructionReference

Type: class | Package: com.hypixel.hytale.server.npc.instructions.builders

public class BuilderInstructionReference

Builder for constructing NPC instruction references that point to instructions defined elsewhere.

Also in this package: BuilderActionList, BuilderInstruction, BuilderInstructionRandomized

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Instruction build(BuilderSupport builderSupport)
  public boolean excludeFromRegularBuilding()
  protected boolean requiresName()
  public String getName()
  public Builder<Instruction> readConfig(JsonElement data)
  public IntSet getInternalDependencies()

Fields:
protected IntSet internalDependencies
