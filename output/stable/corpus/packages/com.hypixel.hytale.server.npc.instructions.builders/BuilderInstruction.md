# BuilderInstruction

Type: class | Package: com.hypixel.hytale.server.npc.instructions.builders

public class BuilderInstruction

Builder for constructing NPC instruction definitions from asset configuration data.

Known subclasses: BuilderInstructionRandomized, BuilderInstructionReference

Also in this package: BuilderActionList, BuilderInstructionRandomized, BuilderInstructionReference

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Instruction> readConfig(JsonElement data)
  public Instruction build(BuilderSupport builderSupport)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public Class<Instruction> category()
  public final boolean isEnabled(ExecutionContext context)
  public void setCurrentStateName(String name)
  public boolean hasActions()
  public boolean hasBodyMotion()
  public boolean hasHeadMotion()
  public boolean hasNestedInstructions()
  public Sensor getSensor(BuilderSupport builderSupport)
  public BodyMotion getBodyMotion(BuilderSupport builderSupport)
  public HeadMotion getHeadMotion(BuilderSupport support)
  public ActionList getActionList(BuilderSupport builderSupport)
  public Instruction[] getSteps(BuilderSupport support)
  public String getName()
  public String getTag()
  public boolean isContinueAfter()
  public double getChance(BuilderSupport support)
  public boolean isTreeMode()
  public boolean isInvertTreeModeResult(BuilderSupport support)
  protected boolean requiresName()

Fields:
public static final String[] ANTECEDENT
public static final String[] SUBSEQUENT
protected final BuilderObjectReferenceHelper<Sensor> sensorBuilderObjectReferenceHelper
protected final BuilderObjectReferenceHelper<BodyMotion> bodyMotionBuilderObjectReferenceHelper
protected final BuilderObjectReferenceHelper<HeadMotion> headMotionBuilderObjectReferenceHelper
protected final BuilderObjectReferenceHelper<ActionList> actionsBuilderObjectReferenceHelper
protected final BuilderObjectListHelper<Instruction> steps
protected String name
protected String tag
protected boolean continueAfter
protected final DoubleHolder chance
protected final BooleanHolder enabled
protected boolean actionsBlocking
protected boolean actionsAtomic
protected boolean treeMode
protected final BooleanHolder invertTreeModeResult
protected String currentStateName
