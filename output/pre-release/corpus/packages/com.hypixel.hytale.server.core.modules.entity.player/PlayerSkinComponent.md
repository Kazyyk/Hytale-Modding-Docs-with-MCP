# PlayerSkinComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: Component<EntityStore>

public class PlayerSkinComponent implements Component<EntityStore>

An ECS component that holds the player's skin data. Tracks whether the skin has been updated since the last network sync via the `isNetworkOutdated` flag.

## Static Methods


@Nonnull
public static ComponentType<EntityStore, PlayerSkinComponent> getComponentType()

Returns the component type from `EntityModule.get().getPlayerSkinComponentType()`.

## Constructors


public PlayerSkinComponent(@Nonnull PlayerSkin playerSkin)

Creates the component with the given skin data.

## Methods


public boolean consumeNetworkOutdated()

Returns `true` if the skin needs to be re-sent to clients, and clears the flag.


@Nonnull
public PlayerSkin getPlayerSkin()

Returns the `PlayerSkin` data.


public void setNetworkOutdated()

Marks the skin as needing network synchronization.


@Nonnull
@Override
public Component<EntityStore> clone()

Returns a new `PlayerSkinComponent` wrapping the same `PlayerSkin`.

## Related Types

- ApplyRandomSkinPersistedComponent -- flags for random skin assignment
- PlayerSystems.PlayerSpawnedSystem -- includes skin in player self update

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation, NameplateRefChangeSystem, NameplateRefSystem (and 33 more)

Complete API:
  public static ComponentType<EntityStore,PlayerSkinComponent> getComponentType()
  public boolean consumeNetworkOutdated()
  public PlayerSkin getPlayerSkin()
  public void setNetworkOutdated()
  public Component<EntityStore> clone()

Fields:
private final PlayerSkin playerSkin
private boolean isNetworkOutdated
