# EmptyResourceStorage

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object | Implements: IResourceStorage

public class EmptyResourceStorage implements IResourceStorage

A no-op implementation of IResourceStorage. `load()` creates a default resource instance, `save()` and `remove()` are no-ops. Used for stores that do not require resource persistence. Singleton via `get()`.

## Methods


public static EmptyResourceStorage get()

Returns the singleton instance.

## Related Types

- IResourceStorage -- the interface this implements
