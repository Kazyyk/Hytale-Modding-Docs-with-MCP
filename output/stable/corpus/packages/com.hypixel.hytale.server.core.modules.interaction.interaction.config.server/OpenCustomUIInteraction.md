# OpenCustomUIInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction

public class OpenCustomUIInteraction extends SimpleInstantInteraction

Opens a custom UI page for the player. The page is created by a registered `CustomPageSupplier` selected via codec configuration. Only opens the page if the player does not already have a custom page open.

## Codec Properties

- Page | CustomPageSupplier` (via `CodecMapCodec`) | Yes (inherited) | -- | The registered page supplier that creates the custom UI page.

## Static Methods


public static <S extends OpenCustomUIInteraction.CustomPageSupplier> void registerCustomPageSupplier(@Nonnull PluginBase plugin, Class<?> tClass, String id, @Nonnull S supplier)

Registers a custom page supplier with the given ID in the codec registry.


public static void registerSimple(@Nonnull PluginBase plugin, Class<?> tClass, String id, @Nonnull Function<PlayerRef, CustomUIPage> supplier)

Convenience method to register a simple supplier that only requires a `PlayerRef`.


@Deprecated
public static <T extends BlockState> void registerBlockCustomPage(@Nonnull PluginBase plugin, Class<?> tClass, String id, @Nonnull Class<T> stateClass, @Nonnull OpenCustomUIInteraction.BlockCustomPageSupplier<T> blockSupplier)

**Deprecated.** Registers a block-state-based custom page supplier. Resolves the target block's state and creates a page from it.


public static void registerBlockEntityCustomPage(@Nonnull PluginBase plugin, Class<?> tClass, String id, @Nonnull OpenCustomUIInteraction.BlockEntityCustomPageSupplier blockSupplier)

Registers a block-entity-based custom page supplier. Resolves the block entity ref from the target block.

## Methods


@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

Gets the player's `PageManager`, checks no custom page is open, creates the page via the supplier, and opens it.

## Inner Interfaces

- BlockCustomPageSupplier -- creates pages from block states (deprecated)
- BlockEntityCustomPageSupplier -- creates pages from block entity refs
- CustomPageSupplier -- general-purpose page creation interface

## See Also

- `PageManager` -- manages open pages for a player
- `CustomUIPage` -- the page object displayed to the player

Also in this package: AngledDamage, BlockCustomPageSupplier, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatInteraction, ChangeStatWithModifierInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DamageEntityInteraction, DestroyConditionInteraction, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction (and 13 more)

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public static void registerCustomPageSupplier(PluginBase plugin, Class<?> tClass, String id, S supplier)
  public static void registerSimple(PluginBase plugin, Class<?> tClass, String id, Function<PlayerRef,CustomUIPage> supplier)
  public static void registerBlockCustomPage(PluginBase plugin, Class<?> tClass, String id, Class<T> stateClass, OpenCustomUIInteraction.BlockCustomPageSupplier<T> blockSupplier)
  public static void registerBlockCustomPage(PluginBase plugin, Class<?> tClass, String id, Class<T> stateClass, OpenCustomUIInteraction.BlockCustomPageSupplier<T> blockSupplier, boolean createState)
  public static void registerBlockEntityCustomPage(PluginBase plugin, Class<?> tClass, String id, OpenCustomUIInteraction.BlockEntityCustomPageSupplier blockSupplier)
  public static void registerBlockEntityCustomPage(PluginBase plugin, Class<?> tClass, String id, OpenCustomUIInteraction.BlockEntityCustomPageSupplier blockSupplier, Supplier<Holder<ChunkStore>> creator)

Fields:
public static final CodecMapCodec<OpenCustomUIInteraction.CustomPageSupplier> PAGE_CODEC
public static final BuilderCodec<OpenCustomUIInteraction> CODEC
private OpenCustomUIInteraction.CustomPageSupplier customPageSupplier
