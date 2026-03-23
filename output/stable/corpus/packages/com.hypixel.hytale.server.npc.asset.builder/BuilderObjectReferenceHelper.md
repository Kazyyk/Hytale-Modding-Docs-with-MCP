# BuilderObjectReferenceHelper

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder | Extends: BuilderObjectHelper<T>

public class BuilderObjectReferenceHelper<T> extends BuilderObjectHelper<T>

The primary helper for resolving a single builder reference from JSON. Handles three modes of resolution:

1. **Inline builder** -- the JSON object contains a type tag and is read directly by the factory.
2. **File reference** -- the JSON object contains a `"Reference"` key pointing to another builder by name, optionally with a `"Modify"` block.
3. **Internal (local) reference** -- the JSON object contains `"Reference"` and `"Local": true`, resolving via the InternalReferenceResolver.

Supports nullable references (`"Nullable": true`), interface matching (`"Interfaces"`), and modifier application with scope merging and state export.

## Type Parameters

- T | The runtime type produced by the resolved builder.

## Constants

- KEY_REFERENCE | "Reference"
- KEY_LOCAL | "Local"
- KEY_INTERFACE_LIST | "Interfaces"
- KEY_NULLABLE | "Nullable"
- NULL_COMPONENT | "$Null"
- KEY_LABEL | "$Label"

## Methods

### build


@Nullable
@Override
public T build(@Nonnull BuilderSupport builderSupport)

Resolves the builder (inline, file reference, or internal), applies any modifier scope and state mapping, validates features and instruction context, and calls `Builder.build()`.

### validate


@Override
public boolean validate(String configName, NPCLoadTimeValidationHelper loadTimeValidationHelper, @Nonnull BuilderManager manager, @Nonnull ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)

Validates the resolved builder with scope and modifier application.

### readConfig


public void readConfig(@Nonnull JsonElement data, @Nonnull BuilderFactory<T> factory, @Nonnull BuilderManager builderManager, @Nonnull BuilderParameters builderParameters, @Nonnull BuilderValidationHelper builderValidationHelper)

Reads the JSON element. Determines whether it is an inline builder, file reference, or internal reference, and reads accordingly.

### getBuilder


@Nullable
public Builder<T> getBuilder(@Nonnull BuilderManager builderManager, ExecutionContext context, @Nullable Builder<?> parentSpawnable)

Resolves the builder from the cache, internal resolver, or inline instance.

### isPresent / isFinal


@Override
public boolean isPresent()
public boolean isFinal()

`isPresent()` returns `true` if a builder is inline or a reference is set. `isFinal()` returns `true` only for inline builders.

### excludeFromRegularBuild


public boolean excludeFromRegularBuild()

Delegates to `builder.excludeFromRegularBuilding()`.

## Related Types

- BuilderObjectHelper -- parent class
- BuilderObjectStaticHelper -- variant that forbids references
- BuilderModifier -- applied during reference resolution
- InternalReferenceResolver -- resolves local references
- BuilderFactory -- creates inline builders

Known subclasses: BuilderObjectStaticHelper

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectStaticHelper (and 28 more)

Complete API:
  public boolean excludeFromRegularBuild()
  public T build(BuilderSupport builderSupport)
  public boolean validate(String configName, NPCLoadTimeValidationHelper loadTimeValidationHelper, BuilderManager manager, ExecutionContext context, Scope globalScope, List<String> errors)
  public Builder<T> getBuilder(BuilderManager builderManager, BuilderSupport support, boolean nullable)
  public Builder<T> getBuilder(BuilderManager builderManager, ExecutionContext context, Builder<?> parentSpawnable)
  public void readConfig(JsonElement data, BuilderManager builderManager, BuilderParameters builderParameters, BuilderValidationHelper builderValidationHelper)
  public void readConfig(JsonElement data, BuilderFactory<T> factory, BuilderManager builderManager, BuilderParameters builderParameters, BuilderValidationHelper builderValidationHelper)
  protected void setInternalReference(StringHolder holder, InternalReferenceResolver referenceResolver)
  protected void setFileReference(StringHolder holder, JsonObject jsonObject, BuilderManager builderManager)
  private void validateRequiredFeatures(Builder<T> builder, BuilderManager manager, ExecutionContext context)
  private void validateInstructionContext(Builder<T> builder, BuilderSupport support)
  private void validateComponentInterfaceMatch(String builderInterfaceCode)
  public boolean isPresent()
  public boolean isFinal()
  public String getLabel()
  public void setLabel(String label)

Fields:
public static final String KEY_REFERENCE
public static final String KEY_LOCAL
public static final String KEY_INTERFACE_LIST
public static final String KEY_NULLABLE
public static final String NULL_COMPONENT
public static final String KEY_LABEL
protected Builder<T> builder
protected final StringHolder fileReference
protected String[] componentInterfaces
protected int referenceIndex
protected boolean isReference
protected boolean isNullable
protected BuilderModifier modifier
protected FeatureEvaluatorHelper evaluatorHelper
protected InternalReferenceResolver internalReferenceResolver
protected boolean isInternalReference
protected String label
