# InternalReferenceResolver

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder

public class InternalReferenceResolver

Resolves local (internal) builder references within a single NPC role file. When a component uses `"Local": true` with a `"Reference"`, the reference points to another component defined in the same file rather than an external file. This resolver maintains a name-to-index map and a list of builder instruction references, and validates that no cyclic dependencies exist.

Currently only supports `Instruction` type references.

## Constructor


public InternalReferenceResolver()

## Methods

### getOrCreateIndex


public int getOrCreateIndex(String name)

Returns the index for the named reference, creating a new slot if necessary. If dependency recording is active, the index is recorded.

### setRecordDependencies / getRecordedDependenices / stopRecordingDependencies


public void setRecordDependencies()
@Nullable
public IntSet getRecordedDependenices()
public void stopRecordingDependencies()

Controls dependency recording mode for cycle detection.

### addBuilder


public void addBuilder(int index, BuilderInstructionReference builder)

Registers a builder at the given index. Throws on duplicate or out-of-range indices.

### validateInternalReferences


public void validateInternalReferences(String configName, @Nonnull List<String> errors)

Validates that all referenced slots have builders and that no cyclic dependencies exist (via DFS).

### getBuilder


public <T> Builder<T> getBuilder(int index, Class<?> classType)

Returns the builder at the given index. Throws `IllegalArgumentException` if `classType` is not `Instruction.class`.

### optimise


public void optimise()

Releases the index and name maps after validation is complete.

## Related Types

- BuilderObjectReferenceHelper -- uses this for local references
- BuilderValidationHelper -- carries this resolver

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper (and 28 more)

Complete API:
  public int getOrCreateIndex(String name)
  public void setRecordDependencies()
  public IntSet getRecordedDependenices()
  public void stopRecordingDependencies()
  public void addBuilder(int index, BuilderInstructionReference builder)
  public void validateInternalReferences(String configName, List<String> errors)
  private void validateNoCycles(BuilderInstructionReference builder, int index, IntArrayList path)
  public Builder<T> getBuilder(int index, Class<?> classType)
  public void optimise()

Fields:
private final List<BuilderInstructionReference> builders
private Object2IntMap<String> indexMap
private Int2ObjectMap<String> nameMap
private IntSet recordedDependencies
