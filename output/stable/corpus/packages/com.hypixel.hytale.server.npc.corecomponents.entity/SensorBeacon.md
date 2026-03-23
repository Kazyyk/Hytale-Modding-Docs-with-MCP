# SensorBeacon

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity | Extends: SensorBase

public class SensorBeacon extends SensorBase

## Fields

- protected static final ComponentType<EntityStore, TransformComponent> TRANSFORM_COMPONENT_TYPE
- protected final int messageIndex
- protected final double range
- protected final int targetSlot
- protected final boolean consume
- private final EntityPositionProvider positionProvider
- BeaconSupport beaconSupportComponent
- Ref<EntityStore> target
- Ref<EntityStore> targetRef
- TransformComponent targetTransformComponent
- Vector3d targetPosition
- TransformComponent transformComponent
- Vector3d position

## Constructors

- public SensorBeacon(@Nonnull BuilderSensorBeacon builderSensorBeacon, @Nonnull BuilderSupport builderSupport)

## Methods

- public boolean matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)
- public InfoProvider getSensorInfo()
