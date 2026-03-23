# PlayerSettings

Type: record | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: Component<EntityStore>

public record PlayerSettings(
    boolean showEntityMarkers,
    @Nonnull PickupLocation armorItemsPreferredPickupLocation,
    @Nonnull PickupLocation weaponAndToolItemsPreferredPickupLocation,
    @Nonnull PickupLocation usableItemsItemsPreferredPickupLocation,
    @Nonnull PickupLocation solidBlockItemsPreferredPickupLocation,
    @Nonnull PickupLocation miscItemsPreferredPickupLocation,
    PlayerCreativeSettings creativeSettings,
    boolean hideHelmet,
    boolean hideCuirass,
    boolean hideGauntlets,
    boolean hidePants
) implements Component<EntityStore>

An ECS component record holding player-configurable settings. Persisted per player and used by systems to control item pickup behavior, armor visibility, entity markers, and creative mode options.

## Record Components

- showEntityMarkers | boolean | Whether entity markers are visible to this player.
- armorItemsPreferredPickupLocation | PickupLocation | Preferred destination for picked-up armor items.
- weaponAndToolItemsPreferredPickupLocation | PickupLocation | Preferred destination for picked-up weapons/tools.
- usableItemsItemsPreferredPickupLocation | PickupLocation | Preferred destination for picked-up usable items.
- solidBlockItemsPreferredPickupLocation | PickupLocation | Preferred destination for picked-up solid block items.
- miscItemsPreferredPickupLocation | PickupLocation | Preferred destination for picked-up miscellaneous items.
- creativeSettings | PlayerCreativeSettings | Creative mode settings.
- hideHelmet | boolean | Whether to hide the player's helmet visually.
- hideCuirass | boolean | Whether to hide the player's cuirass visually.
- hideGauntlets | boolean | Whether to hide the player's gauntlets visually.
- hidePants | boolean | Whether to hide the player's pants visually.

## Static Methods


@Nonnull
public static ComponentType<EntityStore, PlayerSettings> getComponentType()

Returns the component type from `EntityModule.get().getPlayerSettingsComponentType()`.


@Nonnull
public static PlayerSettings defaults()

Returns the default settings instance: all pickup locations set to `Hotbar`, all visibility flags `false`, entity markers `false`.

## Methods


@Nonnull
@Override
public Component<EntityStore> clone()

Returns a copy of this settings record with a cloned `PlayerCreativeSettings`.

## Related Types

- PlayerCreativeSettings -- nested creative mode settings
- PlayerSystems.PlayerSpawnedSystem -- uses settings for armor visibility

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems (and 35 more)

Complete API:
  public static ComponentType<EntityStore,PlayerSettings> getComponentType()
  public static PlayerSettings defaults()
  public Component<EntityStore> clone()

Fields:
private static final PlayerSettings INSTANCE
