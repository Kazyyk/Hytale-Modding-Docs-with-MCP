# BuilderComponent

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder | Extends: BuilderBase<T>

public class BuilderComponent<T> extends BuilderBase<T>

A generic builder that wraps a BuilderObjectReferenceHelper to read a `"Content"` JSON object. Used when a builder category needs a simple wrapper around a referenced or inline component. Every BuilderFactory automatically registers a `"Component"` type that creates a `BuilderComponent`.

## Type Parameters

- T | The runtime type this component produces.

## Constructor


public BuilderComponent(Class<T> classType)

## Methods

### build


@Override
public T build(@Nonnull BuilderSupport builderSupport)

Delegates to the inner `BuilderObjectReferenceHelper.build()`.

### category


@Override
public Class<T> category()

Returns the class type passed to the constructor.

### readConfig


@Nonnull
@Override
public Builder<T> readConfig(@Nonnull JsonElement data)

Reads a `"Content"` JSON object into the internal reference helper.

### validate


@Override
public boolean validate(String configName, @Nonnull NPCLoadTimeValidationHelper validationHelper, @Nonnull ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)

Validates both this builder and the inner reference helper.

### canRequireFeature


@Override
public boolean canRequireFeature()

Returns `true` if `T` is assignable from `Action` or `Motion`.

### toSchema


@Nonnull
@Override
public Schema toSchema(@Nonnull SchemaContext context)

Adds `Class`, `Interface`, `Default`, `DefaultState`, and `ResetOnStateChange` properties to the schema.

## Related Types

- BuilderBase -- parent class
- BuilderObjectReferenceHelper -- handles the reference resolution
- BuilderFactory -- automatically registers this as the `"Component"` type

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper, BuilderObjectStaticHelper (and 28 more)

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public T build(BuilderSupport builderSupport)
  public Class<T> category()
  public BuilderDescriptorState getBuilderDescriptorState()
  public boolean isEnabled(ExecutionContext context)
  public Builder<T> readConfig(JsonElement data)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public boolean canRequireFeature()
  public Schema toSchema(SchemaContext context)

Fields:
private final Class<T> classType
private final BuilderObjectReferenceHelper<T> content
