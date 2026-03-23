# TeleporterSettingsPage

Type: class | Package: com.hypixel.hytale.builtin.adventure.teleporter.page | Extends: InteractiveCustomUIPage<TeleporterSettingsPage.PageEventData>

public class TeleporterSettingsPage extends InteractiveCustomUIPage<TeleporterSettingsPage.PageEventData>

Custom UI page for configuring teleporter block settings.

Also in this package: Mode, PageEventData, TeleporterSettingsPageSupplier

Complete API:
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  static List<DropdownEntryInfo> getWarpsSortedById(String ownedWarpId, String worldNameToFilter)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, TeleporterSettingsPage.PageEventData data)

Fields:
private final Ref<ChunkStore> blockRef
private final TeleporterSettingsPage.Mode mode
