# PrefabEditorLoadOptionsPage

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor.ui | Extends: InteractiveCustomUIPage

public class PrefabEditorLoadOptionsPage extends InteractiveCustomUIPage

UI page displayed when a player already has an existing prefab edit session. Offers three actions: load the existing session, cancel, or create a new session (which exits the current one first).

Also in this package: Action, Action, Action, Action, PageData, PageData, PageData, PageData, PageData, PrefabEditorExitConfirmPage, PrefabEditorLoadSettingsPage, PrefabEditorSaveSettingsPage, PrefabTeleportPage

Complete API:
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, PrefabEditorLoadOptionsPage.PageData data)

Fields:
private final World world
