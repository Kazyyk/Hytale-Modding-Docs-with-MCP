# DeathItemLoss

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage

public class DeathItemLoss

Encapsulates the item loss configuration for a death event: which loss mode is active, the specific items lost, and the percentage-based loss values for item amounts and durability. Serializable via `BuilderCodec`. Used by DeathComponent to pass loss data to the death/respawn screen.

## Static Fields

- CODEC | BuilderCodec<DeathItemLoss> | Builder codec for JSON serialization.

## Static Methods


public static DeathItemLoss noLossMode()

Returns a singleton `DeathItemLoss` configured for no item loss (mode `NONE`, empty items, 0% loss).

## Constructor


public DeathItemLoss(DeathConfig.ItemsLossMode lossMode, ItemStack[] itemsLost, double amountLossPercentage, double durabilityLossPercentage)

Creates a death item loss configuration with the given parameters.

## Methods


public DeathConfig.ItemsLossMode getLossMode()

Returns the items loss mode (`ALL`, `CONFIGURED`, or `NONE`).


public ItemStack[] getItemsLost()

Returns the array of items lost. Returns `ItemStack.EMPTY_ARRAY` if null.


public double getAmountLossPercentage()

Returns the percentage of item quantities lost.


public double getDurabilityLossPercentage()

Returns the percentage of item durability lost.

## Related Types

- DeathComponent -- creates `DeathItemLoss` instances via `getDeathItemLoss()`
- DeathSystems.DropPlayerDeathItems -- system that processes item drops

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public static DeathItemLoss noLossMode()
  public DeathConfig.ItemsLossMode getLossMode()
  public ItemStack[] getItemsLost()
  public double getAmountLossPercentage()
  public double getDurabilityLossPercentage()

Fields:
public static final BuilderCodec<DeathItemLoss> CODEC
private DeathConfig.ItemsLossMode lossMode
private ItemStack[] itemsLost
private double amountLossPercentage
private double durabilityLossPercentage
private static final DeathItemLoss NO_LOSS_MODE
