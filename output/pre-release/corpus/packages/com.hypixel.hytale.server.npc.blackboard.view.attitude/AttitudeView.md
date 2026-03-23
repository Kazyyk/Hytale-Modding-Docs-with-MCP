# AttitudeView

Type: class | Package: com.hypixel.hytale.server.npc.blackboard.view.attitude | Extends: PrioritisedProviderView<IAttitudeProvider, AttitudeView>

public class AttitudeView extends PrioritisedProviderView<IAttitudeProvider, AttitudeView>

Extends `PrioritisedProviderView` to provide AttitudeView functionality.

## Fields

- private final World world

## Methods

- public AttitudeView(World world)
- @Nonnull public Attitude getAttitude(@Nonnull Ref<EntityStore> ref, @Nonnull Role self, @Nonnull Ref<EntityStore> target, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- @Override public boolean isOutdated(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)
- public AttitudeView getUpdatedView(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- @Override public void initialiseEntity(@Nonnull Ref<EntityStore> ref, @Nonnull NPCEntity npcComponent)
- @Override public void cleanup()
- @Override public void onWorldRemoved()

Also in this package: AttitudeMap, Builder, Builder, IAttitudeProvider, ItemAttitudeMap

Complete API:
  public Attitude getAttitude(Ref<EntityStore> ref, Role self, Ref<EntityStore> target, ComponentAccessor<EntityStore> componentAccessor)
  public boolean isOutdated(Ref<EntityStore> ref, Store<EntityStore> store)
  public AttitudeView getUpdatedView(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void initialiseEntity(Ref<EntityStore> ref, NPCEntity npcComponent)
  public void cleanup()
  public void onWorldRemoved()

Fields:
private final World world
