# ObjectiveLocationAreaBox

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.markerarea | Extends: ObjectiveLocationMarkerArea

public class ObjectiveLocationAreaBox extends ObjectiveLocationMarkerArea

Concrete implementation extending `ObjectiveLocationMarkerArea`.

## Fields

- entryArea | Box | Box field.
- exitArea | Box | Box field.

## Constructors

- ObjectiveLocationAreaBox(Box entryBox, Box exitBox) | Creates a new ObjectiveLocationAreaBox instance.
- ObjectiveLocationAreaBox() | Creates a new ObjectiveLocationAreaBox instance.

## Methods

- getEntryArea() | Box | public method.
- getExitArea() | Box | public method.
- isPlayerInEntryArea(@Nonnull Vector3d playerPosition, @Nonnull Vector3d markerPosition) | boolean | public method.
- getRotatedArea(float yaw, float pitch) | ObjectiveLocationMarkerArea | public method.
- computeAreaBoxes() | void | protected method.
- toString() | String | public method.

Also in this package: ObjectiveLocationAreaRadius, ObjectiveLocationMarkerArea

Complete API:
  public Box getEntryArea()
  public Box getExitArea()
  public void getPlayersInEntryArea(SpatialResource<Ref<EntityStore>,EntityStore> spatialComponent, List<Ref<EntityStore>> results, Vector3d markerPosition)
  public void getPlayersInExitArea(SpatialResource<Ref<EntityStore>,EntityStore> spatialComponent, List<Ref<EntityStore>> results, Vector3d markerPosition)
  public boolean hasPlayerInExitArea(SpatialResource<Ref<EntityStore>,EntityStore> spatialComponent, ComponentType<EntityStore,PlayerRef> playerRefComponentType, Vector3d markerPosition, CommandBuffer<EntityStore> commandBuffer)
  public boolean isPlayerInEntryArea(Vector3d playerPosition, Vector3d markerPosition)
  public ObjectiveLocationMarkerArea getRotatedArea(float yaw, float pitch)
  protected void computeAreaBoxes()
  private static void getPlayersInArea(SpatialResource<Ref<EntityStore>,EntityStore> spatialComponent, List<Ref<EntityStore>> results, Vector3d markerPosition, Box box)
  public String toString()

Fields:
public static final BuilderCodec<ObjectiveLocationAreaBox> CODEC
private static final Box DEFAULT_ENTRY_BOX
private static final Box DEFAULT_EXIT_BOX
private Box entryArea
private Box exitArea
