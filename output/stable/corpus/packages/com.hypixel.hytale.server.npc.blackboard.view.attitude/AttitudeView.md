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
