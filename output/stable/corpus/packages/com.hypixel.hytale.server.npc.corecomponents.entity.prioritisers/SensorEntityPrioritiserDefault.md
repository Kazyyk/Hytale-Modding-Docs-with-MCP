# SensorEntityPrioritiserDefault

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.prioritisers | Implements: ISensorEntityPrioritiser

public class SensorEntityPrioritiserDefault implements ISensorEntityPrioritiser

## Fields

- private static final ComponentType<EntityStore, TransformComponent> TRANSFORM_COMPONENT_TYPE
- private final SensorEntityPrioritiserDefault.DefaultPrioritiser playerPrioritiser
- private final SensorEntityPrioritiserDefault.DefaultPrioritiser npcPrioritiser

## Methods

- @Nonnull @Override public IEntityByPriorityFilter getNPCPrioritiser()
- @Nonnull @Override public IEntityByPriorityFilter getPlayerPrioritiser()
- @Nonnull @Override public Ref<EntityStore> pickTarget(Ref<EntityStore> ref,
        @Nonnull Role role,
        @Nonnull Vector3d position,
        @Nonnull Ref<EntityStore> playerRef,
        @Nonnull Ref<EntityStore> npcRef,
        boolean useProjectedDistance,
        @Nonnull Store<EntityStore> store)` |
| `@Override public` | `boolean` | `providesFilters()` |
| `@Override public` | `void` | `buildProvidedFilters(List<IEntityFilter> filters)` |

## Inner Types

- `SensorEntityPrioritiserDefault.DefaultPrioritiser`

Also in this package: AttitudePrioritiser, DefaultPrioritiser, SensorEntityPrioritiserAttitude

Complete API:
  public IEntityByPriorityFilter getNPCPrioritiser()
  public IEntityByPriorityFilter getPlayerPrioritiser()
  public Ref<EntityStore> pickTarget(Ref<EntityStore> ref, Role role, Vector3d position, Ref<EntityStore> playerRef, Ref<EntityStore> npcRef, boolean useProjectedDistance, Store<EntityStore> store)
  public boolean providesFilters()
  public void buildProvidedFilters(List<IEntityFilter> filters)

Fields:
private static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
private final SensorEntityPrioritiserDefault.DefaultPrioritiser playerPrioritiser
private final SensorEntityPrioritiserDefault.DefaultPrioritiser npcPrioritiser
