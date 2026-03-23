# GroupSteeringAccumulator

Type: class | Package: com.hypixel.hytale.server.npc.movement

public class GroupSteeringAccumulator

## Fields

- @Nonnull private static final ComponentType<EntityStore, TransformComponent> TRANSFORM_COMPONENT_TYPE
- private final Vector3d sumOfVelocities
- private final Vector3d sumOfDistances
- private final Vector3d sumOfPositions
- private final Vector3d temp
- private int count
- private double x
- private double y
- private double z
- private double xViewDirection
- private double yViewDirection
- private double zViewDirection
- private Vector3d componentSelector
- private double maxRangeSquared
- private double maxDistance
- private float collisionViewHalfAngleCosine

## Methods

- public void begin(double x, double y, double z, double xViewDirection, double yViewDirection, double zViewDirection)
- public void begin(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public void processEntity(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public void processEntity(@Nonnull Ref<EntityStore> ref,
        double distanceWeight,
        double positionWeight,
        double velocityWeight,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `end()` |
| `public` | `void` | `setComponentSelector(Vector3d componentSelector)` |
| `public` | `void` | `setMaxRange(double maxRange)` |
| `public` | `void` | `setViewConeHalfAngleCosine(float collisionViewHalfAngleCosine)` |
| `@Nonnull public` | `Vector3d` | `getSumOfVelocities()` |
| `@Nonnull public` | `Vector3d` | `getSumOfDistances()` |
| `@Nonnull public` | `Vector3d` | `getSumOfPositions()` |
| `public` | `int` | `getCount()` |

Also in this package: FlockMembershipType, FlockPlayerMembership, MotionKind, MovementState, NavState, Steering

Complete API:
  public void begin(double x, double y, double z, double xViewDirection, double yViewDirection, double zViewDirection)
  public void begin(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void processEntity(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void processEntity(Ref<EntityStore> ref, double distanceWeight, double positionWeight, double velocityWeight, ComponentAccessor<EntityStore> componentAccessor)
  public void end()
  public void setComponentSelector(Vector3d componentSelector)
  public void setMaxRange(double maxRange)
  public void setViewConeHalfAngleCosine(float collisionViewHalfAngleCosine)
  public Vector3d getSumOfVelocities()
  public Vector3d getSumOfDistances()
  public Vector3d getSumOfPositions()
  public int getCount()

Fields:
private static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
private final Vector3d sumOfVelocities
private final Vector3d sumOfDistances
private final Vector3d sumOfPositions
private final Vector3d temp
private int count
private double x
private double y
private double z
private double xViewDirection
private double yViewDirection
private double zViewDirection
private Vector3d componentSelector
private double maxRangeSquared
private double maxDistance
private float collisionViewHalfAngleCosine
