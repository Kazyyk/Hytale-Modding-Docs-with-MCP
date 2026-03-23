# SpawnableWithModelBuilder

Type: abstract class | Package: com.hypixel.hytale.server.npc.asset.builder | Extends: BuilderBase<T> | Implements: ISpawnableWithModel

public abstract class SpawnableWithModelBuilder<T> extends BuilderBase<T> implements ISpawnableWithModel

An abstract builder base for NPC types that can be spawned with a model (primarily role builders). Extends BuilderBase with dynamic dependency tracking -- dependencies discovered at build time rather than at read time. Also marks the builder as spawnable.

## Type Parameters

- T | The runtime type this builder produces.

## Methods

### hasDynamicDependencies


@Override
public boolean hasDynamicDependencies()

Returns `true` if dynamic dependencies have been recorded.

### addDynamicDependency


@Override
public void addDynamicDependency(int builderIndex)

Adds a builder index to the dynamic dependency set, creating it if needed.

### getDynamicDependencies


@Override
public IntSet getDynamicDependencies()

Returns the dynamic dependency set, or `null` if none exist.

### clearDynamicDependencies


@Override
public void clearDynamicDependencies()

Clears the dynamic dependency set.

### isSpawnable


@Override
public boolean isSpawnable()

Returns `true`.

## Related Types

- BuilderBase -- parent class
- Builder -- dynamic dependency default methods are overridden here

Known subclasses: BuilderRole, BuilderRoleVariant

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper (and 29 more)

Complete API:
  public boolean hasDynamicDependencies()
  public void addDynamicDependency(int builderIndex)
  public IntSet getDynamicDependencies()
  public void clearDynamicDependencies()
  public boolean isSpawnable()

Fields:
private IntSet dynamicDependencies
