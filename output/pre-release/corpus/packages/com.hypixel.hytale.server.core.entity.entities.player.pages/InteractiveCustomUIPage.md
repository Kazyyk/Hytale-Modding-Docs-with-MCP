# InteractiveCustomUIPage

Type: abstract class | Package: com.hypixel.hytale.server.core.entity.entities.player.pages | Extends: CustomUIPage

public abstract class InteractiveCustomUIPage<T> extends CustomUIPage

## Fields

- protected final BuilderCodec<T> eventDataCodec

## Methods

- public void handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull T data)
- protected void sendUpdate(@Nullable UICommandBuilder commandBuilder, @Nullable UIEventBuilder eventBuilder, boolean clear)
- @Override public void handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, String rawData)
- @Override protected void sendUpdate(@Nullable UICommandBuilder commandBuilder, boolean clear)
