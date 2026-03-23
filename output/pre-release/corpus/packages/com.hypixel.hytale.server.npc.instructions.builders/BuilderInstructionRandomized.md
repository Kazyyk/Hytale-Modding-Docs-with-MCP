# BuilderInstructionRandomized

Type: class | Package: com.hypixel.hytale.server.npc.instructions.builders

public class BuilderInstructionRandomized

Builder for constructing randomized NPC instruction definitions that select from weighted options.

Also in this package: BuilderActionList, BuilderInstruction, BuilderInstructionReference

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public InstructionRandomized build(BuilderSupport builderSupport)
  public Builder<Instruction> readConfig(JsonElement data)
  public BuilderDescriptorState getBuilderDescriptorState()
  public boolean getResetOnStateChange(BuilderSupport support)
  public double[] getExecuteFor(BuilderSupport support)

Fields:
public static final double[] DEFAULT_EXECUTION_RANGE
protected final BooleanHolder resetOnStateChange
protected final NumberArrayHolder executeFor
