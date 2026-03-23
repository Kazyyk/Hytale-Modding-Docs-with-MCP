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

Known subclasses: BarterPage, ChangeModelPage, ChoiceBasePage, CommandListPage, ConfigureInstanceBlockPage, DialogPage, EntitySpawnPage, ImageImportPage, InstanceListPage, LaunchPadSettingsPage, MemoriesPage, MemoriesUnlockedPage, ObjImportPage, ParticleSpawnPage, PlaySoundPage, PluginListPage, PortalDeviceActivePage, PortalDeviceSummonPage, PrefabEditorExitConfirmPage, PrefabEditorLoadSettingsPage, PrefabEditorSaveSettingsPage, PrefabPage, PrefabSavePage, PrefabSpawnerSettingsPage, PrefabTeleportPage, RespawnPage, RespawnPointPage, ScriptedBrushPage, TeleporterSettingsPage, TintChunkPage, UIGalleryPage, WarpListPage

Also in this package: BasicCustomUIPage, CustomUIPage, PageManager, RespawnPage, RespawnPageEventData

Complete API:
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, T data)
  protected void sendUpdate(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, boolean clear)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, String rawData)
  protected void sendUpdate(UICommandBuilder commandBuilder, boolean clear)

Fields:
private static final HytaleLogger LOGGER
protected final BuilderCodec<T> eventDataCodec
