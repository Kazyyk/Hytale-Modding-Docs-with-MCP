# DeathComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Implements: Component<EntityStore>

public class DeathComponent implements Component<EntityStore>

An ECS component added to an entity when it dies. Carries information about the cause of death, the death message, items lost, and respawn state. The presence of this component on an entity signals that it is dead, triggering death systems registered in DamageModule. Serializable via `BuilderCodec` for persistence. Removal of this component (via `respawn()`) triggers the respawn system chain.

## Static Methods


public static ComponentType<EntityStore, DeathComponent> getComponentType()

Returns the registered component type from DamageModule.


public static void tryAddComponent(@Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Ref<EntityStore> ref, @Nonnull Damage damage)

Adds a `DeathComponent` to the entity if it does not already have one, using a `CommandBuffer`.


public static void tryAddComponent(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull Damage damage)

Adds a `DeathComponent` to the entity if it does not already have one, using a `Store`.


public static CompletableFuture<Void> respawn(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref)

Initiates the respawn process for the given entity. Delegates to the world's `RespawnController`. Returns a future that completes when respawn finishes, at which point the `DeathComponent` is removed.

## Constructors


protected DeathComponent(@Nonnull Damage deathInfo)

Creates a death component from the killing damage event. Records the cause ID from the damage's `DamageCause`.


protected DeathComponent()

Default constructor for codec deserialization.

## Methods


@Nullable
public DamageCause getDeathCause()

Returns the `DamageCause` that killed the entity, resolved from the stored cause ID string.


@Nullable
public Message getDeathMessage()

Returns the localized death message, or `null` if not yet set.


public void setDeathMessage(@Nullable Message deathMessage)

Sets the death message displayed to players.


public boolean isShowDeathMenu()

Returns `true` if the death screen should be shown to the player. Defaults to `true`.


public void setShowDeathMenu(boolean showDeathMenu)

Sets whether to show the death screen.


public ItemStack[] getItemsLostOnDeath()

Returns the array of items lost on death.


public void setItemsLostOnDeath(List<ItemStack> itemsLostOnDeath)

Sets the items lost on death from a list.


public double getItemsAmountLossPercentage()

Returns the percentage of item quantities lost on death.


public void setItemsAmountLossPercentage(double itemsAmountLossPercentage)

Sets the item quantity loss percentage.


public double getItemsDurabilityLossPercentage()

Returns the percentage of item durability lost on death.


public void setItemsDurabilityLossPercentage(double itemsDurabilityLossPercentage)

Sets the item durability loss percentage.


public boolean displayDataOnDeathScreen()

Returns `true` if death data (items lost, etc.) should be displayed on the death screen.


public void setDisplayDataOnDeathScreen(boolean displayDataOnDeathScreen)

Sets whether to display death data on the death screen.


@Nullable
public Damage getDeathInfo()

Returns the Damage event that killed the entity, or `null` after deserialization (transient).


public DeathConfig.ItemsLossMode getItemsLossMode()

Returns the items loss mode (ALL, CONFIGURED, or NONE).


public void setItemsLossMode(DeathConfig.ItemsLossMode itemsLossMode)

Sets the items loss mode.


public DeathItemLoss getDeathItemLoss()

Returns a DeathItemLoss snapshot of the current loss configuration.


@Nullable
public InteractionChain getInteractionChain()

Returns the death interaction chain, or `null` if none was initiated.


public void setInteractionChain(@Nullable InteractionChain interactionChain)

Sets the death interaction chain.


@Nonnull
@Override
public Component<EntityStore> clone()

Creates a shallow copy of this component.

## Related Types

- Damage -- the killing damage event
- DamageCause -- the type of damage that caused death
- DeathItemLoss -- snapshot of item loss configuration
- DeathSystems -- systems triggered by this component's addition
- RespawnSystems -- systems triggered by this component's removal
- DamageModule -- registers this component type

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public static ComponentType<EntityStore,DeathComponent> getComponentType()
  public DamageCause getDeathCause()
  public Message getDeathMessage()
  public void setDeathMessage(Message deathMessage)
  public boolean isShowDeathMenu()
  public void setShowDeathMenu(boolean showDeathMenu)
  public ItemStack[] getItemsLostOnDeath()
  public void setItemsLostOnDeath(List<ItemStack> itemsLostOnDeath)
  public double getItemsAmountLossPercentage()
  public void setItemsAmountLossPercentage(double itemsAmountLossPercentage)
  public double getItemsDurabilityLossPercentage()
  public void setItemsDurabilityLossPercentage(double itemsDurabilityLossPercentage)
  public boolean displayDataOnDeathScreen()
  public void setDisplayDataOnDeathScreen(boolean displayDataOnDeathScreen)
  public Damage getDeathInfo()
  public DeathConfig.ItemsLossMode getItemsLossMode()
  public void setItemsLossMode(DeathConfig.ItemsLossMode itemsLossMode)
  public DeathItemLoss getDeathItemLoss()
  public InteractionChain getInteractionChain()
  public void setInteractionChain(InteractionChain interactionChain)
  public Component<EntityStore> clone()
  public static void tryAddComponent(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> ref, Damage damage)
  public static void tryAddComponent(Store<EntityStore> store, Ref<EntityStore> ref, Damage damage)
  public static CompletableFuture<Void> respawn(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref)

Fields:
public static final HytaleLogger LOGGER
public static final BuilderCodec<DeathComponent> CODEC
private String deathCause
private Message deathMessage
private boolean showDeathMenu
private ItemStack[] itemsLostOnDeath
private double itemsAmountLossPercentage
private double itemsDurabilityLossPercentage
private boolean displayDataOnDeathScreen
private transient Damage deathInfo
private transient DeathConfig.ItemsLossMode itemsLossMode
private transient InteractionChain interactionChain
private transient CompletableFuture<Void> respawnFuture
