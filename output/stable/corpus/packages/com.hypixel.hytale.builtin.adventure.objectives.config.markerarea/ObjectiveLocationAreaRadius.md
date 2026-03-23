# ObjectiveLocationAreaRadius

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.markerarea | Extends: ObjectiveLocationMarkerArea

public class ObjectiveLocationAreaRadius extends ObjectiveLocationMarkerArea

Concrete implementation extending `ObjectiveLocationMarkerArea`.

## Fields

- DEFAULT_ENTRY_RADIUS | int | Static final int field.
- DEFAULT_EXIT_RADIUS | int | Static final int field.
- entryArea | int | int field.
- exitArea | int | int field.

## Constructors

- ObjectiveLocationAreaRadius(int entryRadius, int exitRadius) | Creates a new ObjectiveLocationAreaRadius instance.
- ObjectiveLocationAreaRadius() | Creates a new ObjectiveLocationAreaRadius instance.

## Methods

- getEntryArea() | int | public method.
- getExitArea() | int | public method.
- isPlayerInEntryArea(@Nonnull Vector3d playerPosition, @Nonnull Vector3d markerPosition) | boolean | public method.
- computeAreaBoxes() | void | protected method.
- toString() | String | public method.

Also in this package: ObjectiveLocationAreaBox, ObjectiveLocationMarkerArea

Complete API:
  public int getEntryArea()
  public int getExitArea()
  public void getPlayersInEntryArea(SpatialResource<Ref<EntityStore>,EntityStore> spatialComponent, List<Ref<EntityStore>> results, Vector3d markerPosition)
  public void getPlayersInExitArea(SpatialResource<Ref<EntityStore>,EntityStore> spatialComponent, List<Ref<EntityStore>> results, Vector3d markerPosition)
  public boolean hasPlayerInExitArea(SpatialResource<Ref<EntityStore>,EntityStore> spatialComponent, ComponentType<EntityStore,PlayerRef> playerRefComponentType, Vector3d markerPosition, CommandBuffer<EntityStore> commandBuffer)
  public boolean isPlayerInEntryArea(Vector3d playerPosition, Vector3d markerPosition)
  protected void computeAreaBoxes()
  private static void getPlayersInArea(SpatialResource<Ref<EntityStore>,EntityStore> spatialComponent, List<Ref<EntityStore>> results, Vector3d markerPosition, int radius)
  public String toString()

Fields:
public static final BuilderCodec<ObjectiveLocationAreaRadius> CODEC
public static final int DEFAULT_ENTRY_RADIUS
public static final int DEFAULT_EXIT_RADIUS
protected int entryArea
protected int exitArea
