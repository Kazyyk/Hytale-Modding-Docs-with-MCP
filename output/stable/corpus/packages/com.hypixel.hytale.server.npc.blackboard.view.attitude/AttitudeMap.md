# AttitudeMap

Type: class | Package: com.hypixel.hytale.server.npc.blackboard.view.attitude

public class AttitudeMap

Provides AttitudeMap functionality within the attitude subsystem.

## Constants

- @Nullable private static final ComponentType<EntityStore, NPCEntity> NPC_COMPONENT_TYPE
- private static final ComponentType<EntityStore, Player> PLAYER_COMPONENT_TYPE

## Fields

- private final Int2ObjectMap<Attitude>[] map

## Methods

- private AttitudeMap(Int2ObjectMap<Attitude>[] map)
- @Nullable public Attitude getAttitude(@Nonnull Role role, @Nonnull Ref<EntityStore> target, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public int getAttitudeGroupCount()
- public void updateAttitudeGroup(int id, @Nonnull AttitudeGroup group)

Also in this package: AttitudeView, Builder, Builder, IAttitudeProvider, ItemAttitudeMap

Complete API:
  public Attitude getAttitude(Role role, Ref<EntityStore> target, ComponentAccessor<EntityStore> componentAccessor)
  public int getAttitudeGroupCount()
  public void updateAttitudeGroup(int id, AttitudeGroup group)

Fields:
private static final ComponentType<EntityStore,NPCEntity> NPC_COMPONENT_TYPE
private static final ComponentType<EntityStore,Player> PLAYER_COMPONENT_TYPE
private final Int2ObjectMap<Attitude>[] map
