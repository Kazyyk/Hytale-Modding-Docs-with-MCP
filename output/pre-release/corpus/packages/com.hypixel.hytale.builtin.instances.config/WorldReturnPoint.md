# WorldReturnPoint

Type: class | Package: com.hypixel.hytale.builtin.instances.config

public class WorldReturnPoint

## Fields

- @Nonnull public static final BuilderCodec<WorldReturnPoint> CODEC
- private UUID world
- private Transform returnPoint
- private boolean returnOnReconnect

## Constructors

- public WorldReturnPoint()
- public WorldReturnPoint(UUID world, Transform returnPoint, boolean returnOnReconnect)

## Methods

- public UUID getWorld()
- public void setWorld(UUID world)
- public Transform getReturnPoint()
- public void setReturnPoint(Transform returnPoint)
- public boolean isReturnOnReconnect()
- public void setReturnOnReconnect(boolean returnOnReconnect)
- @Nonnull public WorldReturnPoint clone()

Also in this package: ExitInstance, InstanceDiscoveryConfig, InstanceEntityConfig, InstanceWorldConfig

Complete API:
  public UUID getWorld()
  public void setWorld(UUID world)
  public Transform getReturnPoint()
  public void setReturnPoint(Transform returnPoint)
  public boolean isReturnOnReconnect()
  public void setReturnOnReconnect(boolean returnOnReconnect)
  public WorldReturnPoint clone()

Fields:
public static final BuilderCodec<WorldReturnPoint> CODEC
private UUID world
private Transform returnPoint
private boolean returnOnReconnect
