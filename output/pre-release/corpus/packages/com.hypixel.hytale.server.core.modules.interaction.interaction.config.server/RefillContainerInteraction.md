# RefillContainerInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction

public class RefillContainerInteraction extends SimpleInstantInteraction

Refills a container item currently held by the player. Performs a ray-cast from the player's eye position in the look direction (up to the configured use distance), checking for allowed fluid types along the path. When a matching fluid is found, either transforms the held item to a new state or adjusts its durability, and optionally transforms the source fluid.

## Codec Properties

- States | Map<String, RefillState> | Yes (inherited) | -- | Map of state names to refill configurations. Each entry defines allowed fluids, durability, and optional fluid transformation.

## Inner Classes

- RefillState -- configuration for a single refill state, including allowed fluids, durability, and fluid transformation

## Methods


@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

Validates the player and inventory, performs a block-by-block ray-cast checking for fluids, and either refills the held item's durability or transforms it to a new item type. Handles single and stacked item cases differently.


protected int[] getAllowedFluidIds()

Lazily resolves and caches the sorted array of allowed fluid asset indices from all refill states.


protected Int2ObjectMap<String> getFluidToState()

Lazily builds and caches a map from fluid asset index to state name.


@Nonnull
@Override
public String toString()

## See Also

- `Fluid` -- fluid asset used for matching and transformation
- `BlockIterator` -- performs the ray-cast through blocks

Also in this package: AngledDamage, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatInteraction, ChangeStatWithModifierInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DamageEntityInteraction, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction, LaunchProjectileInteraction, ModifyInventoryInteraction (and 11 more)

Complete API:
  protected int[] getAllowedFluidIds()
  protected Int2ObjectMap<String> getFluidToState()
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public String toString()

Fields:
public static final BuilderCodec<RefillContainerInteraction> CODEC
protected Map<String,RefillContainerInteraction.RefillState> refillStateMap
protected int[] allowedFluidIds
protected Int2ObjectMap<String> fluidToState
