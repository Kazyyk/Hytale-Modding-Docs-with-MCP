# BuilderObjectStaticListHelper

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder | Extends: BuilderObjectListHelper<T>

public class BuilderObjectStaticListHelper<T> extends BuilderObjectListHelper<T>

A list helper variant that uses BuilderObjectStaticHelper for each element, enforcing that all elements are inline (no references). Provides a `staticBuild` method that builds without entity context.

## Methods

### createReferenceHelper


@Nonnull
@Override
protected BuilderObjectReferenceHelper<T> createReferenceHelper()

Returns a new BuilderObjectStaticHelper.

### staticBuild


@Nullable
public List<T> staticBuild(@Nonnull BuilderManager manager)

Builds all elements using `BuilderObjectStaticHelper.staticBuild()`.

## Related Types

- BuilderObjectListHelper -- parent class
- BuilderObjectStaticHelper -- per-element helper
