# RespawnPage

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player.pages | Extends: InteractiveCustomUIPage<RespawnPage.RespawnPageEventData>

public class RespawnPage extends InteractiveCustomUIPage<RespawnPage.RespawnPageEventData>

## Fields

- private static final String UI_RESPAWN_PAGE
- private static final String ELEMENT_BUTTON_RESPAWN
- private static final String ELEMENT_LABEL_DEATH_REASON_TEXT_SPANS
- private final Message deathReason
- private final boolean displayDataOnDeathScreen
- private final DeathItemLoss deathItemLoss
- private final ItemStack[] itemsLostOnDeath
- private String action

## Methods

- @Nullable private static ItemStack[] combineSimilarItemStacks(@Nullable ItemStack[] itemsLostOnDeath)
- @Override public void build( @Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store )
- public void handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull RespawnPage.RespawnPageEventData data)
- @Override public void onDismiss(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)

## Inner Types

- `RespawnPage.RespawnPageEventData`
