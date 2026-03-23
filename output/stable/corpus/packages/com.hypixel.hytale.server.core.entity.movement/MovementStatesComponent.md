# MovementStatesComponent

Type: class | Package: com.hypixel.hytale.server.core.entity.movement | Implements: Component

public class MovementStatesComponent implements Component<EntityStore>

## Methods

- public static ComponentType<EntityStore, MovementStatesComponent> getComponentType()
- public MovementStatesComponent()
- public MovementStatesComponent(@Nonnull MovementStatesComponent other)
- public MovementStates getMovementStates()
- public void setMovementStates(MovementStates movementStates)
- public MovementStates getSentMovementStates()
- public void setSentMovementStates(MovementStates sentMovementStates)
- public Component<EntityStore> clone()

Also in this package: AddSystem, MovementStatesSystems, PlayerInitSystem, TickingSystem

Complete API:
  public static ComponentType<EntityStore,MovementStatesComponent> getComponentType()
  public MovementStates getMovementStates()
  public void setMovementStates(MovementStates movementStates)
  public MovementStates getSentMovementStates()
  public void setSentMovementStates(MovementStates sentMovementStates)
  public Component<EntityStore> clone()

Fields:
private MovementStates movementStates
private MovementStates sentMovementStates
