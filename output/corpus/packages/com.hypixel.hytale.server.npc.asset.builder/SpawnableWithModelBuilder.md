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
