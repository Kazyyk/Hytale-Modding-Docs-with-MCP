# ObjectiveLocationMarkerArea

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.markerarea

public abstract class ObjectiveLocationMarkerArea

Class in the markerarea subsystem.

## Fields

- entryAreaBox | Box | Box field.
- exitAreaBox | Box | Box field.

## Methods

- isPlayerInEntryArea(@Nonnull Vector3d var1, @Nonnull Vector3d var2) | boolean | public method.
- getBoxForEntryArea() | Box | public method.
- getBoxForExitArea() | Box | public method.
- getRotatedArea(float yaw, float pitch) | ObjectiveLocationMarkerArea | public method.
- computeAreaBoxes() | void | protected method.
- toString() | String | public method.

Known subclasses: ObjectiveLocationAreaBox, ObjectiveLocationAreaRadius

Also in this package: ObjectiveLocationAreaBox, ObjectiveLocationAreaRadius

Complete API:
  public abstract void getPlayersInEntryArea(SpatialResource<Ref<EntityStore>,EntityStore> var1, List<Ref<EntityStore>> var2, Vector3d var3)
  public abstract void getPlayersInExitArea(SpatialResource<Ref<EntityStore>,EntityStore> var1, List<Ref<EntityStore>> var2, Vector3d var3)
  public abstract boolean hasPlayerInExitArea(SpatialResource<Ref<EntityStore>,EntityStore> var1, ComponentType<EntityStore,PlayerRef> var2, Vector3d var3, CommandBuffer<EntityStore> var4)
  public abstract boolean isPlayerInEntryArea(Vector3d var1, Vector3d var2)
  public Box getBoxForEntryArea()
  public Box getBoxForExitArea()
  public ObjectiveLocationMarkerArea getRotatedArea(float yaw, float pitch)
  protected abstract void computeAreaBoxes()
  public String toString()

Fields:
public static final CodecMapCodec<ObjectiveLocationMarkerArea> CODEC
protected Box entryAreaBox
protected Box exitAreaBox
