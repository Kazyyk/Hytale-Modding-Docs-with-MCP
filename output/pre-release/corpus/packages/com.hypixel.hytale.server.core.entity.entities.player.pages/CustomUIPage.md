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

Known subclasses: BasicCustomUIPage, InteractiveCustomUIPage

Also in this package: BasicCustomUIPage, InteractiveCustomUIPage, PageManager, RespawnPage, RespawnPageEventData

Complete API:
  public void setLifetime(CustomPageLifetime lifetime)
  public CustomPageLifetime getLifetime()
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, String rawData)
  public abstract void build(Ref<EntityStore> var1, UICommandBuilder var2, UIEventBuilder var3, Store<EntityStore> var4)
  protected void rebuild()
  protected void sendUpdate()
  protected void sendUpdate(UICommandBuilder commandBuilder)
  protected void sendUpdate(UICommandBuilder commandBuilder, boolean clear)
  protected void close()
  public void onDismiss(Ref<EntityStore> ref, Store<EntityStore> store)

Fields:
protected final PlayerRef playerRef
protected CustomPageLifetime lifetime
