# MemoriesPageSupplier

Type: class | Package: com.hypixel.hytale.builtin.adventure.memories.page | Implements: OpenCustomUIInteraction.CustomPageSupplier

public class MemoriesPageSupplier implements OpenCustomUIInteraction.CustomPageSupplier

Supplier that creates a MemoriesPage when a player interacts with a memories block. Returns `null` if no target block is present in the interaction context.

## Methods

- public CustomUIPage tryCreate(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull PlayerRef playerRef, @Nonnull InteractionContext context)
