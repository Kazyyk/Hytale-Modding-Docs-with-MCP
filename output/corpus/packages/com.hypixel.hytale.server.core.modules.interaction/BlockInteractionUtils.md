# BlockInteractionUtils

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction

public class BlockInteractionUtils

Utility class with helper methods for block interaction logic.

## Static Methods


public static boolean isNaturalAction(@Nullable Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)

Returns `true` if the action should be treated as a "natural" block break (i.e., the player is in Adventure mode, or no player entity is associated with the ref). Natural actions produce item drops; non-natural (Creative mode) actions suppress drops.
