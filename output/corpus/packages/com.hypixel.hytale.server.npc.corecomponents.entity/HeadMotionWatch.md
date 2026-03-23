# HeadMotionWatch

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity | Extends: HeadMotionBase

public class HeadMotionWatch extends HeadMotionBase

## Fields

- protected static final ComponentType<EntityStore, TransformComponent> TRANSFORM_COMPONENT_TYPE
- protected static final ComponentType<EntityStore, ModelComponent> MODEL_COMPONENT_TYPE
- protected final double relativeTurnSpeed
- IPositionProvider positionProvider
- Ref<EntityStore> targetRef
- double x
- double y
- double z
- ModelComponent targetModelComponent
- TransformComponent transformComponent
- ModelComponent modelComponent
- Model model
- Vector3d position
- float yaw
- float pitch

## Constructors

- public HeadMotionWatch(@Nonnull BuilderHeadMotionWatch builderHeadMotionWatch, @Nonnull BuilderSupport support)

## Methods

- public boolean computeSteering(@Nonnull Ref<EntityStore> ref,
        @Nonnull Role role,
        @Nullable InfoProvider sensorInfo,
        double dt,
        @Nonnull Steering desiredSteering,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
