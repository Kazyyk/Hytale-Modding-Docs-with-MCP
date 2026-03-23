# EntityEventView

Type: class | Package: com.hypixel.hytale.server.npc.blackboard.view.event.entity | Extends: EventView

public class EntityEventView extends EventView

## Methods

- public EntityEventView getUpdatedView(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
- @Override public void initialiseEntity(Ref<EntityStore> ref, NPCEntity npcComponent)
- protected void onEvent(int senderTypeId, double x, double y, double z, Ref<EntityStore> initiator, Ref<EntityStore> skip, ComponentAccessor<EntityStore> componentAccessor, EntityEventType type)
- private void onPlayerInteraction(PlayerInteractEvent event)
- public void processAttackedEvent(Ref<EntityStore> victim, Ref<EntityStore> attacker, ComponentAccessor<EntityStore> componentAccessor, EntityEventType eventType)
