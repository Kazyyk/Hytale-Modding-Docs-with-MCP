# SetNameRespawnPointPage

Type: class | Package: com.hypixel.hytale.builtin.beds.respawn | Extends: RespawnPointPage

public class SetNameRespawnPointPage extends RespawnPointPage

## Fields

- private final Vector3i respawnBlockPosition
- private final RespawnBlock respawnBlock

## Methods

- public SetNameRespawnPointPage( @Nonnull PlayerRef playerRef, @Nonnull InteractionType interactionType, @Nonnull Vector3i respawnBlockPosition, @Nonnull RespawnBlock respawnBlock )
- public void build( @Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store )
- public void handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull RespawnPointPage.RespawnPointEventData data)
