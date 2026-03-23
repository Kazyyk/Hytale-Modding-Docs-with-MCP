# ActionBeacon

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity | Extends: ActionBase

public class ActionBeacon extends ActionBase

## Fields

- protected final String message
- protected final double range
- protected final int[] targetGroups
- protected final int targetToSendSlot
- protected final double expirationTime
- protected final int sendCount
- protected final List<Ref<EntityStore>> sendList
- Ref<EntityStore> target
- PositionCache positionCache
- NPCEntity npcComponent
- Role role
- ThreadLocalRandom random
- Vector3f color
- Matrix4d matrix
- Matrix4d tmp
- TransformComponent transformComponent
- Vector3d pos
- ModelComponent modelComponent
- Model model
- double x
- double y
- double z
- TransformComponent targetTransformComponent
- Vector3d targetPos
- ModelComponent targetModelComponent
- float targetEyeHeight
- double angleY
- double angleX
- BeaconSupport beaconSupportComponent

## Constructors

- public ActionBeacon(@Nonnull BuilderActionBeacon builderActionBeacon, @Nonnull BuilderSupport support)

## Methods

- public void registerWithSupport(@Nonnull Role role)
- public boolean canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- protected static boolean filterNPCs(@Nonnull Ref<EntityStore> ref, @Nonnull ActionBeacon _this, @Nonnull Role role, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- protected void sendNPCMessage(@Nonnull Ref<EntityStore> self,
        @Nonnull Ref<EntityStore> targetRef,
        @Nonnull Ref<EntityStore> target,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |

Also in this package: ActionIgnoreForAvoidance, ActionNotify, ActionOverrideAttitude, ActionReleaseTarget, ActionSetMarkedTarget, ActionSetStat, HeadMotionWatch, SensorBeacon, SensorCount, SensorEntity, SensorEntityBase, SensorKill, SensorPlayer, SensorSelf, SensorTarget

Complete API:
  public void registerWithSupport(Role role)
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  protected static boolean filterNPCs(Ref<EntityStore> ref, ActionBeacon _this, Role role, ComponentAccessor<EntityStore> componentAccessor)
  protected void sendNPCMessage(Ref<EntityStore> self, Ref<EntityStore> targetRef, Ref<EntityStore> target, ComponentAccessor<EntityStore> componentAccessor)

Fields:
protected final String message
protected final double range
protected final int[] targetGroups
protected final int targetToSendSlot
protected final double expirationTime
protected final int sendCount
protected final List<Ref<EntityStore>> sendList
