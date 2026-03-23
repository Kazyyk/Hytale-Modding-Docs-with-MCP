# VoidEvent

Type: class | Package: com.hypixel.hytale.builtin.portals.components.voidevent | Implements: Component

public class VoidEvent implements Component

## Fields

- public static final double MIN_BLOCKS_BETWEEN_SPAWNERS
- private SpatialHashGrid<Ref<EntityStore>> voidSpawners
- private VoidEventStage activeStage

## Methods

- public static ComponentType<EntityStore,VoidEvent> getComponentType()
- @Nullable public static VoidEventConfig getConfig(World world)
- @Nonnull public SpatialHashGrid<Ref<EntityStore>> getVoidSpawners()
- @Nullable public VoidEventStage getActiveStage()
- public void setActiveStage(VoidEventStage activeStage)
- @Nullable @Override public Component<EntityStore> clone()

Also in this package: VoidSpawner

Complete API:
  public static ComponentType<EntityStore,VoidEvent> getComponentType()
  public static VoidEventConfig getConfig(World world)
  public SpatialHashGrid<Ref<EntityStore>> getVoidSpawners()
  public VoidEventStage getActiveStage()
  public void setActiveStage(VoidEventStage activeStage)
  public Component<EntityStore> clone()

Fields:
public static final double MIN_BLOCKS_BETWEEN_SPAWNERS
private SpatialHashGrid<Ref<EntityStore>> voidSpawners
private VoidEventStage activeStage
