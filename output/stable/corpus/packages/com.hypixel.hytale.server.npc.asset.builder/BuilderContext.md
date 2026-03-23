# BuilderContext

Type: interface | Package: com.hypixel.hytale.server.npc.asset.builder

public interface BuilderContext

Provides hierarchical context for builders, enabling breadcrumb-style error reporting. Each context knows its owner and label, allowing the system to construct a path like `"Role|Instruction|Action"` when reporting configuration errors.

## Methods

### getOwner


BuilderContext getOwner();

Returns the parent context, or `null` for root-level builders.

### getLabel


String getLabel();

Returns this context's label (typically the type name or JSON key).

### setCurrentStateName


default void setCurrentStateName(String name)

Sets the current state name for state-aware contexts. Default is a no-op.

### getParent


@Nullable
default Builder<?> getParent()

Walks up the owner chain to find the nearest Builder ancestor. Returns `null` if no builder ancestor exists.

### getBreadCrumbs


default void getBreadCrumbs(@Nonnull StringBuilder stringBuilder)

Recursively builds a pipe-delimited breadcrumb string by walking up the owner chain.


@Nonnull
default String getBreadCrumbs()

Returns the full breadcrumb string (convenience overload).

## Related Types

- Builder -- extends this interface
- BuilderObjectHelper -- implements this interface
- BuilderBase -- implements this via Builder
