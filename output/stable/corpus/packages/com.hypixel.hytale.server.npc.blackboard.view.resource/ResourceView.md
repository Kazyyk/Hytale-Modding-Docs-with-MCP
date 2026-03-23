# ResourceView

Type: class | Package: com.hypixel.hytale.server.npc.blackboard.view.resource | Extends: BlockRegionView

public class ResourceView extends BlockRegionView

## Fields

- private final long index
- private final IntSet[] reservationsBySection
- private final Map<Ref<EntityStore>,ResourceView.BlockReservation> reservationsByEntity

## Methods

- @Override public boolean isOutdated(Ref<EntityStore> ref, Store<EntityStore> store)
- @Nonnull public ResourceView getUpdatedView(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
- @Override public void initialiseEntity(Ref<EntityStore> ref, NPCEntity npcComponent)
- @Override public void cleanup()
- @Override public void onWorldRemoved()
- public boolean isBlockReserved(int x, int y, int z)
- public void reserveBlock(NPCEntity entity, int x, int y, int z)
- public void clearReservation(Ref<EntityStore> ref)
- public long getIndex()
- @Nonnull public Map<Ref<EntityStore>,ResourceView.BlockReservation> getReservationsByEntity()

## Inner Types

- `ResourceView.BlockReservation`
