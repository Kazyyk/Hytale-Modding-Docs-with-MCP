# BuilderObjectListHelper

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder | Extends: BuilderObjectArrayHelper<List<T>, T>

public class BuilderObjectListHelper<T> extends BuilderObjectArrayHelper<List<T>, T>

Reads a JSON array of builder objects and produces a `List<T>` at build time. Each element that is not excluded from regular build and does not build to `null` is included in the result list.

## Type Parameters

- T | The element type.

## Constructor


public BuilderObjectListHelper(Class<?> classType, BuilderContext owner)

## Methods

### build


@Nullable
public List<T> build(@Nonnull BuilderSupport builderSupport)

Returns `null` if the array has no elements. Otherwise builds each non-excluded element and collects non-null results into a list.

## Related Types

- BuilderObjectArrayHelper -- parent class
- BuilderObjectStaticListHelper -- variant for static builds

Known subclasses: BuilderObjectStaticListHelper

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper, BuilderObjectStaticHelper (and 28 more)

Complete API:
  public List<T> build(BuilderSupport builderSupport)
