# MemoriesUnlockedPageSuplier

Type: class | Package: com.hypixel.hytale.builtin.adventure.memories.page | Implements: OpenCustomUIInteraction.CustomPageSupplier

public class MemoriesUnlockedPageSuplier implements OpenCustomUIInteraction.CustomPageSupplier

Supplier that creates a MemoriesUnlockedPage when a player interacts with a memories block. Returns `null` if no target block is present in the interaction context. Note: the class name contains a typo in the original source (`Suplier` instead of `Supplier`).

## Methods

- public CustomUIPage tryCreate(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull PlayerRef playerRef, @Nonnull InteractionContext context)

Also in this package: MemoriesPage, MemoriesPageSupplier, MemoriesUnlockedPage, PageAction, PageAction, PageEventData, PageEventData

Complete API:
  public CustomUIPage tryCreate(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor, PlayerRef playerRef, InteractionContext context)
