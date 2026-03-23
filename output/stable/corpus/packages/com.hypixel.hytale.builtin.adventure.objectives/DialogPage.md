# DialogPage

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives | Extends: InteractiveCustomUIPage

public class DialogPage extends InteractiveCustomUIPage<DialogPage.DialogPageEventData>

A custom UI page that displays an NPC dialog during a use-entity objective task. Shows an entity name and dialog text, with a close button that dismisses the page.

## Key Methods

- public void build( Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store )
- public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, DialogPage.DialogPageEventData data)
- public static final BuilderCodec<DialogPage.DialogPageEventData> CODEC = BuilderCodec.builder( DialogPage.DialogPageEventData.class, DialogPage.DialogPageEventData::new )
