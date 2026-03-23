# CameraManager

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player | Implements: Component<EntityStore>

public class CameraManager implements Component<EntityStore>

Implementation of `Component<EntityStore>`.

## Fields

- lastScreenPoint | Vector2d | Vector2d field.
- lastTargetBlock | Vector3i | Vector3i field.

## Constructors

- CameraManager() | Creates a new CameraManager instance.
- CameraManager(@Nonnull CameraManager other) | Creates a new CameraManager instance.

## Methods

- getComponentType() | ComponentType<EntityStore, CameraManager> | static public method.
- resetCamera(@Nonnull PlayerRef ref) | void | public method.
- handleMouseButtonState(MouseButtonType mouseButtonType, MouseButtonState state, Vector3i targetBlock) | void | public method.
- getMouseButtonState(MouseButtonType mouseButtonType) | MouseButtonState | public method.
- getLastMouseButtonPressedPosition(MouseButtonType mouseButtonType) | Vector3i | public method.
- getLastMouseButtonReleasedPosition(MouseButtonType mouseButtonType) | Vector3i | public method.
- setLastScreenPoint(Vector2d lastScreenPoint) | void | public method.
- getLastScreenPoint() | Vector2d | public method.
- setLastBlockPosition(Vector3i targetBlock) | void | public method.
- getLastTargetBlock() | Vector3i | public method.
- clone() | Component<EntityStore> | public method.
- toString() | String | public method.

Also in this package: HiddenPlayersManager, HotbarManager

Complete API:
  public static ComponentType<EntityStore,CameraManager> getComponentType()
  public void resetCamera(PlayerRef ref)
  public void handleMouseButtonState(MouseButtonType mouseButtonType, MouseButtonState state, Vector3i targetBlock)
  public MouseButtonState getMouseButtonState(MouseButtonType mouseButtonType)
  public Vector3i getLastMouseButtonPressedPosition(MouseButtonType mouseButtonType)
  public Vector3i getLastMouseButtonReleasedPosition(MouseButtonType mouseButtonType)
  public void setLastScreenPoint(Vector2d lastScreenPoint)
  public Vector2d getLastScreenPoint()
  public void setLastBlockPosition(Vector3i targetBlock)
  public Vector3i getLastTargetBlock()
  public Component<EntityStore> clone()
  public String toString()

Fields:
private final Map<MouseButtonType,MouseButtonState> mouseStates
private final Map<MouseButtonType,Vector3i> mousePressedPosition
private final Map<MouseButtonType,Vector3i> mouseReleasedPosition
private Vector2d lastScreenPoint
private Vector3i lastTargetBlock
