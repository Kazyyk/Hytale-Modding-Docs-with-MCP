# InteractionView

Type: class | Package: com.hypixel.hytale.server.npc.blackboard.view.interaction | Extends: PrioritisedProviderView

public class InteractionView extends PrioritisedProviderView

## Fields

- private final World world

## Methods

- @Override public boolean isOutdated(Ref<EntityStore> ref, Store<EntityStore> store)
- public InteractionView getUpdatedView(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
- @Override public void initialiseEntity(Ref<EntityStore> ref, NPCEntity npcComponent)
- @Override public void cleanup()
- @Override public void onWorldRemoved()
- @Nonnull public ReservationStatus getReservationStatus(Ref<EntityStore> npcRef, Ref<EntityStore> playerRef, ComponentAccessor<EntityStore> componentAccessor)
