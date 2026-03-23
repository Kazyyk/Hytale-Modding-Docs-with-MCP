# OpenCustomUIInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: SimpleInstantInteraction

public class OpenCustomUIInteraction extends SimpleInstantInteraction

Opens a custom UI page when the interaction is triggered. The page is created via a `CustomPageSupplier` registered through the `PAGE_CODEC` map. Provides static registration helpers for simple suppliers, block-entity custom pages (with optional block entity creation).

## Static Methods

- static <S extends CustomPageSupplier> void registerCustomPageSupplier(@Nonnull PluginBase plugin, Class<?> tClass, String id, @Nonnull S supplier)
- static void registerSimple(@Nonnull PluginBase plugin, Class<?> tClass, String id, @Nonnull Function<PlayerRef, CustomUIPage> supplier)
- static void registerBlockEntityCustomPage(@Nonnull PluginBase plugin, Class<?> tClass, String id, @Nonnull BlockEntityCustomPageSupplier blockSupplier)
- static void registerBlockEntityCustomPage(@Nonnull PluginBase plugin, Class<?> tClass, String id, @Nonnull BlockEntityCustomPageSupplier blockSupplier, Supplier<Holder<ChunkStore>> creator)

## Inner Types

- `OpenCustomUIInteraction.CustomPageSupplier` -- functional interface for creating custom UI pages
- `OpenCustomUIInteraction.BlockEntityCustomPageSupplier` -- functional interface for block-entity-based custom pages
