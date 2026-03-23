# OpenContainerInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: SimpleBlockInteraction

public class OpenContainerInteraction extends SimpleBlockInteraction

Opens the item container of the block being interacted with. Locates the `ItemContainerBlock` component via chunk block components and opens a `ContainerBlockWindow` for the player. Handles `OpenWindow`/`CloseWindow` block interaction states and plays associated sound events.

## Constants

- OPEN_WINDOW | String | "OpenWindow"
- CLOSE_WINDOW | String | "CloseWindow"

## Methods

- protected void interactWithBlock(@Nonnull World world, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull Vector3i pos, @Nonnull CooldownHandler cooldownHandler)
- protected void simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)

Also in this package: AngledDamage, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatInteraction, ChangeStatWithModifierInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DamageEntityInteraction, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction, LaunchProjectileInteraction, ModifyInventoryInteraction (and 11 more)

Complete API:
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i pos, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)

Fields:
public static final BuilderCodec<OpenContainerInteraction> CODEC
public static final String OPEN_WINDOW
public static final String CLOSE_WINDOW
