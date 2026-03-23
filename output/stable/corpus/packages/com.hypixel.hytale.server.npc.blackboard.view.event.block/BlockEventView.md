# BlockEventView

Type: class | Package: com.hypixel.hytale.server.npc.blackboard.view.event.block | Extends: EventView

public class BlockEventView extends EventView

## Methods

- public BlockEventView getUpdatedView(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
- @Override public void initialiseEntity(Ref<EntityStore> ref, NPCEntity npcComponent)
- protected void onEvent(int senderTypeId, double x, double y, double z, Ref<EntityStore> initiator, Ref<EntityStore> skip, ComponentAccessor<EntityStore> componentAccessor, BlockEventType type)
- public void onEntityDamageBlock(Ref<EntityStore> ref, DamageBlockEvent event)
- public void onEntityBreakBlock(Ref<EntityStore> ref, BreakBlockEvent event)
- private void processDamagedBlock(Ref<EntityStore> initiatorRef, String block, Vector3i position, BlockEventType type)
- private void onPlayerInteraction(PlayerInteractEvent event)
