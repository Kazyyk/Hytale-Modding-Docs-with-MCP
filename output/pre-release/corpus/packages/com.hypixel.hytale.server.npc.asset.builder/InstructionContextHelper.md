# InstructionContextHelper

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder

public class InstructionContextHelper

Validates that components are placed in appropriate instruction and sensor contexts within the NPC behavior tree. Tracks the current InstructionType and ComponentContext, and runs registered evaluators to check context compatibility.

## Constructor


public InstructionContextHelper(InstructionType context)

## Methods

### isComponent


public boolean isComponent()

Returns `true` if the instruction context is `InstructionType.Component`.

### setComponentContext


public void setComponentContext(ComponentContext context)

### isInCorrectInstruction


public boolean isInCorrectInstruction(@Nonnull EnumSet<InstructionType> validTypes)
public static boolean isInCorrectInstruction(@Nonnull EnumSet<InstructionType> validTypes, InstructionType instructionContext)

Checks if the current instruction type is in the set of valid types.

### extraContextMatches


public boolean extraContextMatches(@Nullable EnumSet<ComponentContext> contexts)
public static boolean extraContextMatches(@Nullable EnumSet<ComponentContext> validContexts, ComponentContext context)

Checks if the component context matches. Returns `true` if the valid set is `null` (no constraint).

### addComponentContextEvaluator


public void addComponentContextEvaluator(BiConsumer<InstructionType, ComponentContext> evaluator)

Registers a validator to run during `validateComponentContext`.

### validateComponentContext


public void validateComponentContext(InstructionType instructionContext, ComponentContext componentContext)

Runs all registered evaluators. Only valid when `isComponent()` is `true`.

### getInstructionContext / getComponentContext


public InstructionType getInstructionContext()
public ComponentContext getComponentContext()

## Related Types

- InstructionType -- instruction context enum
- ComponentContext -- sensor context enum
- Builder -- `getInstructionContextHelper()` returns this

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper (and 29 more)

Complete API:
  public boolean isComponent()
  public void setComponentContext(ComponentContext context)
  public boolean isInCorrectInstruction(EnumSet<InstructionType> validTypes)
  public static boolean isInCorrectInstruction(EnumSet<InstructionType> validTypes, InstructionType instructionContext)
  public boolean extraContextMatches(EnumSet<ComponentContext> contexts)
  public static boolean extraContextMatches(EnumSet<ComponentContext> validContexts, ComponentContext context)
  public void addComponentContextEvaluator(BiConsumer<InstructionType,ComponentContext> evaluator)
  public void validateComponentContext(InstructionType instructionContext, ComponentContext componentContext)
  public InstructionType getInstructionContext()
  public ComponentContext getComponentContext()

Fields:
private final InstructionType context
private ComponentContext componentContext
private List<BiConsumer<InstructionType,ComponentContext>> componentContextEvaluators
