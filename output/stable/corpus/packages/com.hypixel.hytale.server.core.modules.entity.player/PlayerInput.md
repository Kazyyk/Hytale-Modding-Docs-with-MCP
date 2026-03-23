# PlayerInput

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: Component<EntityStore>

public class PlayerInput implements Component<EntityStore>

An ECS component that queues player input updates received from the client. Each tick, the `ProcessPlayerInput` system drains the queue and applies each update to the entity's transform, head rotation, velocity, and movement states.

## Static Methods


public static ComponentType<EntityStore, PlayerInput> getComponentType()

Returns the component type from `EntityModule.get().getPlayerInputComponentType()`.

## Methods


public void queue(PlayerInput.InputUpdate inputUpdate)

Adds an input update to the queue.


@Nonnull
public List<PlayerInput.InputUpdate> getMovementUpdateQueue()

Returns the current input update queue.


public int getMountId()

Returns the ID of the entity this player is mounting, or `0` if not mounted.


public void setMountId(int mountId)

Sets the mount entity ID.


@Nonnull
@Override
public Component<EntityStore> clone()

Returns a copy with a cloned input queue.

## Inner Types

- PlayerInput.InputUpdate -- interface for all input update types
- PlayerInput.AbsoluteMovement -- sets position to absolute coordinates
- PlayerInput.RelativeMovement -- adds a relative offset to position
- PlayerInput.WishMovement -- wish-based movement direction for knockback
- PlayerInput.SetBody -- sets body rotation
- PlayerInput.SetHead -- sets head rotation
- PlayerInput.SetClientVelocity -- sets client-reported velocity
- PlayerInput.SetMovementStates -- sets movement state flags
- PlayerInput.SetRiderMovementStates -- sets rider movement state flags

## Related Types

- PlayerSystems.ProcessPlayerInput -- system that drains and applies the queue
- PlayerSystems.EnsurePlayerInput -- system that ensures this component exists
- KnockbackPredictionSystems.CaptureKnockbackInput -- consumes input during knockback

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems (and 35 more)

Complete API:
  public static ComponentType<EntityStore,PlayerInput> getComponentType()
  public void queue(PlayerInput.InputUpdate inputUpdate)
  public List<PlayerInput.InputUpdate> getMovementUpdateQueue()
  public int getMountId()
  public void setMountId(int mountId)
  public Component<EntityStore> clone()

Fields:
private final List<PlayerInput.InputUpdate> inputUpdateQueue
private int mountId
