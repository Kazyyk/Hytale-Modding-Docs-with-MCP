# CustomUIPage

Type: abstract class | Package: com.hypixel.hytale.server.core.entity.entities.player.pages

public abstract class CustomUIPage

## Fields

- protected final PlayerRef playerRef
- protected CustomPageLifetime lifetime

## Methods

- public void setLifetime(@Nonnull CustomPageLifetime lifetime)
- @Nonnull public CustomPageLifetime getLifetime()
- public void handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, String rawData)
- public abstract void build(@Nonnull Ref<EntityStore> var1, @Nonnull UICommandBuilder var2, @Nonnull UIEventBuilder var3, @Nonnull Store<EntityStore> var4)
- protected void rebuild()
- protected void sendUpdate()
- protected void sendUpdate(@Nullable UICommandBuilder commandBuilder)
- protected void sendUpdate(@Nullable UICommandBuilder commandBuilder, boolean clear)
- protected void close()
- public void onDismiss(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)
