# TeleportHistory

Type: class | Package: com.hypixel.hytale.builtin.teleport.components | Implements: Component<EntityStore>

public class TeleportHistory implements Component<EntityStore>

Implementation of `Component<EntityStore>`.

## Fields

- MAX_TELEPORT_HISTORY | int | Static final int field.

## Methods

- getComponentType() | ComponentType<EntityStore, TeleportHistory> | static public method.
- forward(@Nonnull Ref<EntityStore> ref, int count) | void | public method.
- back(@Nonnull Ref<EntityStore> ref, int count) | void | public method.
- getForwardSize() | int | public method.
- getBackSize() | int | public method.
- append(@Nonnull World world, @Nonnull Vector3d pos, @Nonnull Vector3f rotation, @Nonnull String key) | void | public method.
- toString() | String | public method.
- clone() | Component<EntityStore> | public method.

Also in this package: Waypoint

Complete API:
  public static ComponentType<EntityStore,TeleportHistory> getComponentType()
  public void forward(Ref<EntityStore> ref, int count)
  public void back(Ref<EntityStore> ref, int count)
  public int getForwardSize()
  public int getBackSize()
  private static void go(Store<EntityStore> store, Ref<EntityStore> ref, Deque<TeleportHistory.Waypoint> from, Deque<TeleportHistory.Waypoint> to, int count, boolean isForward)
  public void append(World world, Vector3d pos, Vector3f rotation, String key)
  public String toString()
  public Component<EntityStore> clone()

Fields:
private static final int MAX_TELEPORT_HISTORY
private static final Message MESSAGE_COMMANDS_TELEPORT_NOT_FURTHER
private static final Message MESSAGE_COMMANDS_TELEPORT_WORLD_NOT_LOADED
private final Deque<TeleportHistory.Waypoint> back
private final Deque<TeleportHistory.Waypoint> forward
