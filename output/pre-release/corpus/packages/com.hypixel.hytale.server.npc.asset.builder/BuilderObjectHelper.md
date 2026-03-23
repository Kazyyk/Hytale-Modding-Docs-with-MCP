# BuilderObjectHelper

Type: abstract class | Package: com.hypixel.hytale.server.npc.asset.builder | Implements: BuilderContext

public abstract class BuilderObjectHelper<T> implements BuilderContext

Abstract base for helper classes that read a JSON element and produce a typed runtime object. Implements BuilderContext for breadcrumb navigation. Concrete subclasses include BuilderObjectReferenceHelper (single object) and BuilderObjectArrayHelper (arrays).

## Type Parameters

- T | The runtime type produced by `build()`.

## Fields

- classType | Class<?> | The expected class type.
- builderParameters | BuilderParameters | Parameters set during `readConfig`.
- owner | BuilderContext | The parent context.

## Constructor


protected BuilderObjectHelper(Class<?> classType, BuilderContext owner)

## Abstract Methods


@Nullable
public abstract T build(BuilderSupport var1);
public abstract boolean validate(String var1, NPCLoadTimeValidationHelper var2, BuilderManager var3, ExecutionContext var4, Scope var5, List<String> var6);
public abstract boolean isPresent();

## Methods

### getOwner


@Override
public BuilderContext getOwner()

### getClassType


public final Class<?> getClassType()

### readConfig


public void readConfig(JsonElement data, BuilderManager builderManager, BuilderParameters builderParameters, BuilderValidationHelper builderValidationHelper)

Stores the builder parameters. Subclasses override to perform actual reading.

## Related Types

- BuilderContext -- implemented interface
- BuilderObjectReferenceHelper -- single object subclass
- BuilderObjectArrayHelper -- array subclass

Known subclasses: BuilderObjectArrayHelper, BuilderObjectReferenceHelper

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper, BuilderObjectStaticHelper (and 29 more)

Complete API:
  public abstract T build(BuilderSupport var1)
  public abstract boolean validate(String var1, NPCLoadTimeValidationHelper var2, BuilderManager var3, ExecutionContext var4, Scope var5, List<String> var6)
  public BuilderContext getOwner()
  public final Class<?> getClassType()
  public void readConfig(JsonElement data, BuilderManager builderManager, BuilderParameters builderParameters, BuilderValidationHelper builderValidationHelper)
  public abstract boolean isPresent()

Fields:
protected final Class<?> classType
protected BuilderParameters builderParameters
protected final BuilderContext owner
