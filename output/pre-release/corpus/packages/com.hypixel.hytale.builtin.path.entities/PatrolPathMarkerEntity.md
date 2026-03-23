# PatrolPathMarkerEntity

Type: class | Package: com.hypixel.hytale.builtin.path.entities | Extends: Entity | Implements: IPrefabPathWaypoint

public class PatrolPathMarkerEntity extends Entity implements IPrefabPathWaypoint

## Fields

- public static final BuilderCodec<PatrolPathMarkerEntity> CODEC
- private UUID pathId
- private String pathName
- private int order
- private double pauseTime
- private float observationAngle
- private short tempPathLength
- private IPrefabPath parentPath

## Methods

- @Nullable public static ComponentType<EntityStore,PatrolPathMarkerEntity> getComponentType()
- public void setParentPath(IPrefabPath parentPath)
- @Nullable public UUID getPathId()
- public void setPathId(UUID pathId)
- public String getPathName()
- public void setPathName(String pathName)
- @Nonnull public static String generateDisplayName(int worldgenId, PatrolPathMarkerEntity patrolPathMarkerEntity)
- public short getTempPathLength()
- @Override public void initialise(UUID id, String pathName, int index, double pauseTime, float observationAngle, int worldGenId, ComponentAccessor<EntityStore> componentAccessor)
- @Override public IPath<IPrefabPathWaypoint> getParentPath()
- @Override public boolean isCollidable()
- @Override public boolean isHiddenFromLivingEntity(Ref<EntityStore> ref, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)
- @Override public int getOrder()
- public void setOrder(int order)
- @Override public double getPauseTime()
- public void setPauseTime(double pauseTime)
- @Override public float getObservationAngle()
- @Override public void onReplaced()
- public void setObservationAngle(float observationAngle)
- @Nonnull @Override public Vector3d getWaypointPosition(ComponentAccessor<EntityStore> componentAccessor)
- @Nonnull @Override public Vector3f getWaypointRotation(ComponentAccessor<EntityStore> componentAccessor)
- @Nonnull @Override public String toString()
