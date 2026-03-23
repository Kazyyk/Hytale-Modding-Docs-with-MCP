# BuilderObjectArrayHelper

Type: abstract class | Package: com.hypixel.hytale.server.npc.asset.builder | Extends: BuilderObjectHelper<T>

public abstract class BuilderObjectArrayHelper<T, U> extends BuilderObjectHelper<T>

Abstract base for helpers that read a JSON array of builder objects. Each array element is read into a BuilderObjectReferenceHelper. Concrete subclasses (BuilderObjectListHelper, BuilderObjectMapHelper) define how the array elements are assembled into the final collection.

## Type Parameters

- T | The collection type produced by `build()`.
- U | The element type produced by each array entry's builder.

## Fields

- builders | BuilderObjectReferenceHelper[] | Array of reference helpers, one per JSON array element.
- label | String | Label for breadcrumb reporting.

## Methods

### readConfig


@Override
public void readConfig(@Nonnull JsonElement data, @Nonnull BuilderManager builderManager, @Nonnull BuilderParameters builderParameters, @Nonnull BuilderValidationHelper builderValidationHelper)

Reads a JSON array, creating a BuilderObjectReferenceHelper for each element. Throws if the element is not an array.

### validate


@Override
public boolean validate(String configName, NPCLoadTimeValidationHelper loadTimeValidationHelper, @Nonnull BuilderManager manager, @Nonnull ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)

Validates each element that is not excluded from regular build.

### isPresent / isEmpty / hasNoElements


@Override
public boolean isPresent()
public boolean isEmpty()
public boolean hasNoElements()

### createReferenceHelper


@Nonnull
protected BuilderObjectReferenceHelper<U> createReferenceHelper()

Creates a new reference helper. Overridable by subclasses (e.g., BuilderObjectStaticListHelper).

## Related Types

- BuilderObjectHelper -- parent class
- BuilderObjectListHelper -- produces a `List<T>`
- BuilderObjectMapHelper -- produces a `Map<K, V>`
- BuilderObjectReferenceHelper -- each array element
