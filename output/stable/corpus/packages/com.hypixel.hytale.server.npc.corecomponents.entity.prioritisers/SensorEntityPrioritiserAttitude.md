# SensorEntityPrioritiserAttitude

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.prioritisers | Implements: ISensorEntityPrioritiser

public class SensorEntityPrioritiserAttitude implements ISensorEntityPrioritiser

## Fields

- private static final ComponentType<EntityStore, TransformComponent> TRANSFORM_COMPONENT_TYPE
- private final Attitude[] attitudeByPriority

## Constructors

- public SensorEntityPrioritiserAttitude(@Nonnull BuilderSensorEntityPrioritiserAttitude builder, @Nonnull BuilderSupport support)

## Methods

- @Override public void registerWithSupport(@Nonnull Role role)
- @Nonnull @Override public IEntityByPriorityFilter getNPCPrioritiser()
- @Nonnull @Override public IEntityByPriorityFilter getPlayerPrioritiser()
- @Nonnull @Override public Ref<EntityStore> pickTarget(@Nonnull Ref<EntityStore> ref,
        @Nonnull Role role,
        @Nonnull Vector3d position,
        @Nonnull Ref<EntityStore> playerRef,
        @Nonnull Ref<EntityStore> npcRef,
        boolean useProjectedDistance,
        @Nonnull Store<EntityStore> store)` |
| `@Override public` | `boolean` | `providesFilters()` |
| `@Override public` | `void` | `buildProvidedFilters(@Nonnull List<IEntityFilter> filters)` |
| `protected` | `int` | `getPriority(@Nonnull Ref<EntityStore> ref, @Nonnull WorldSupport support, @Nonnull Ref<EntityStore> targetRef, @Nonnull Store<EntityStore> store)` |

## Inner Types

- `SensorEntityPrioritiserAttitude.AttitudePrioritiser`

Also in this package: AttitudePrioritiser, DefaultPrioritiser, SensorEntityPrioritiserDefault

Complete API:
  public void registerWithSupport(Role role)
  public IEntityByPriorityFilter getNPCPrioritiser()
  public IEntityByPriorityFilter getPlayerPrioritiser()
  public Ref<EntityStore> pickTarget(Ref<EntityStore> ref, Role role, Vector3d position, Ref<EntityStore> playerRef, Ref<EntityStore> npcRef, boolean useProjectedDistance, Store<EntityStore> store)
  public boolean providesFilters()
  public void buildProvidedFilters(List<IEntityFilter> filters)
  protected int getPriority(Ref<EntityStore> ref, WorldSupport support, Ref<EntityStore> targetRef, Store<EntityStore> store)

Fields:
private static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
private final Attitude[] attitudeByPriority
