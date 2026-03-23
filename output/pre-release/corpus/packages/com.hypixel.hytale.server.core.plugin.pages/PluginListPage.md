# PluginListPage

Type: class | Package: com.hypixel.hytale.server.core.plugin.pages

public class PluginListPage extends InteractiveCustomUIPage<PluginListPage.PluginListPageEventData>

## Fields

- private PluginListPage.PluginDetails selectedPlugin
- private PluginListPageManager.SessionSettings playerSessionSettings
- private final PluginManifest manifest
- private final PluginIdentifier identifier
- private String plugin
- private String option
- private String type

## Methods

- public PluginListPage(@Nonnull PlayerRef playerRef)
- public void build( @Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store )
- public void handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull PluginListPage.PluginListPageEventData data)
- public void onDismiss(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)
- private void buildPluginList(@Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder)
- private void selectPlugin(@Nonnull String playerSelectedPlugin, @Nonnull UICommandBuilder commandBuilder)
- private void checkBoxChanged(@Nonnull String pluginName, @Nonnull UICommandBuilder commandBuilder)
- public void handlePluginChangeEvent(@Nonnull PluginIdentifier plugin, boolean activeState)

Also in this package: PluginDetails, PluginListPageEventData

Complete API:
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, PluginListPage.PluginListPageEventData data)
  public void onDismiss(Ref<EntityStore> ref, Store<EntityStore> store)
  private void buildPluginList(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  private void selectPlugin(String playerSelectedPlugin, UICommandBuilder commandBuilder)
  private void checkBoxChanged(String pluginName, UICommandBuilder commandBuilder)
  public void handlePluginChangeEvent(PluginIdentifier plugin, boolean activeState)

Fields:
private static final Value<String> BUTTON_LABEL_STYLE
private static final Value<String> BUTTON_LABEL_STYLE_SELECTED
private PluginListPage.PluginDetails selectedPlugin
private final ObjectList<PluginListPage.PluginDetails> availablePlugins
private final ObjectList<PluginListPage.PluginDetails> visiblePlugins
private PluginListPageManager.SessionSettings playerSessionSettings
