# EntitySpawnPage

Type: class | Package: com.hypixel.hytale.server.npc.pages | Extends: InteractiveCustomUIPage<EntitySpawnPage.EntitySpawnPageEventData>

public class EntitySpawnPage extends InteractiveCustomUIPage<EntitySpawnPage.EntitySpawnPageEventData>

Interactive custom UI page for spawning NPCs, items, and models with preview, rotation offset, scale control, and tab-based navigation.

## Constants

- BuilderCodec<EntitySpawnPage.EntitySpawnPageEventData> CODEC

## Key Methods

- public void build(@Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store)
- public void handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull EntitySpawnPage.EntitySpawnPageEventData data)
- public void onDismiss(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)
