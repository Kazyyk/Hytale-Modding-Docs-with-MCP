# NPCFlockCommand

Type: class | Package: com.hypixel.hytale.server.flock.commands | Extends: AbstractCommandCollection

public class NPCFlockCommand extends AbstractCommandCollection

## Fields

- private static final double ENTITY_IN_VIEW_DISTANCE
- private static final float ENTITY_IN_VIEW_ANGLE
- private static final int ENTITY_IN_VIEW_HEIGHT
- ComponentType<EntityStore, TransformComponent> transformComponentType
- TransformComponent transformComponent
- Vector3d position
- HeadRotation headRotationComponent
- Vector3f headRotation
- float lookYaw
- double x
- double y
- double z
- SpatialResource<Ref<EntityStore>, EntityStore> spatialResource
- ObjectList<Ref<EntityStore>> results
- ComponentType<EntityStore, NPCEntity> npcComponentType
- int count
- ObjectListIterator var19
- Ref<EntityStore> targetRef
- NPCEntity targetNpcComponent
- TransformComponent entityTransformComponent
- Vector3d entityPosition
- ObjectListIterator var17
- Ref<EntityStore> entityRef
- FlockMembership membership
- Ref<EntityStore> flockReference
- boolean success
- String status
- private static final Message MESSAGE_COMMANDS_NPC_FLOCK_LEFT_FLOCK
- private static final Message MESSAGE_COMMANDS_NPC_FLOCK_FAILED_LEAVE_FLOCK

## Constructors

- public NPCFlockCommand()

## Methods

- public static int forNpcEntitiesInViewCone(@Nonnull Ref<EntityStore> playerReference, @Nonnull Store<EntityStore> store, @Nonnull BiPredicate<Ref<EntityStore>, NPCEntity> predicate)
- public static boolean anyEntityInViewCone(@Nonnull Ref<EntityStore> playerReference, @Nonnull Store<EntityStore> store, @Nonnull Predicate<Ref<EntityStore>> predicate)
- public GrabCommand()
- protected void execute(@Nonnull CommandContext context,
            @Nonnull Store<EntityStore> store,
            @Nonnull Ref<EntityStore> ref,
            @Nonnull PlayerRef playerRef,
            @Nonnull World world)` |
| `` | `public` | `JoinCommand()` |
| `` | `public` | `LeaveCommand()` |
| `` | `public` | `PlayerLeaveCommand()` |

## Inner Types

- `NPCFlockCommand.GrabCommand`
- `NPCFlockCommand.JoinCommand`
- `NPCFlockCommand.LeaveCommand`
- `NPCFlockCommand.PlayerLeaveCommand`

Also in this package: GrabCommand, JoinCommand, LeaveCommand, PlayerLeaveCommand

Complete API:
  public static int forNpcEntitiesInViewCone(Ref<EntityStore> playerReference, Store<EntityStore> store, BiPredicate<Ref<EntityStore>,NPCEntity> predicate)
  public static boolean anyEntityInViewCone(Ref<EntityStore> playerReference, Store<EntityStore> store, Predicate<Ref<EntityStore>> predicate)

Fields:
private static final double ENTITY_IN_VIEW_DISTANCE
private static final float ENTITY_IN_VIEW_ANGLE
private static final int ENTITY_IN_VIEW_HEIGHT
