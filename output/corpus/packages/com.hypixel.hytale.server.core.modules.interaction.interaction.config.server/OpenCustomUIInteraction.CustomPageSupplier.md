# OpenCustomUIInteraction.CustomPageSupplier

Type: interface | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server

@FunctionalInterface
public interface OpenCustomUIInteraction.CustomPageSupplier

General-purpose functional interface for creating a `CustomUIPage`. Receives the entity reference, component accessor, player reference, and interaction context.

## Methods


@Nullable
CustomUIPage tryCreate(@Nonnull Ref<EntityStore> var1, @Nonnull ComponentAccessor<EntityStore> var2, @Nonnull PlayerRef var3, @Nonnull InteractionContext var4)

Creates a custom UI page, or returns `null` if the page cannot be created for the given context.

## See Also

- OpenCustomUIInteraction
