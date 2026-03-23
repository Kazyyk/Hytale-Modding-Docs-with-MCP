# CommandListPage

Type: class | Package: com.hypixel.hytale.server.core.command.system.pages | Extends: InteractiveCustomUIPage

public class CommandListPage extends InteractiveCustomUIPage<CommandListPage.CommandListPageEventData>

An interactive custom UI page that provides an in-game command browser. Displays a searchable list of available commands, subcommand navigation with breadcrumbs, variant selection, parameter details with type information, and a send-to-chat feature. Filters commands based on player permissions.

## Key Methods

- public void build( Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store )
- public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, CommandListPage.CommandListPageEventData data)
- public static final BuilderCodec<CommandListPage.CommandListPageEventData> CODEC = BuilderCodec.builder( CommandListPage.CommandListPageEventData.class, CommandListPage.CommandListPageEventData::new )
- public static final Comparator<CommandListPage.SearchResult> COMPARATOR = Comparator.comparing(o -> o.match)

Also in this package: Category, CommandListPageEventData, SearchResult, UIGalleryEventData, UIGalleryPage

Complete API:
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, CommandListPage.CommandListPageEventData data)
  private void handleSendToChat(Ref<EntityStore> ref, Store<EntityStore> store)
  private String buildCurrentCommandString()
  private void buildCommandList(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, ComponentAccessor<EntityStore> componentAccessor)
  private void selectCommand(Ref<EntityStore> ref, String commandName, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, ComponentAccessor<EntityStore> componentAccessor)
  private void selectSubcommand(Ref<EntityStore> ref, String subcommandName, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, ComponentAccessor<EntityStore> componentAccessor)
  private void selectVariant(Ref<EntityStore> ref, int variantIndex, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, ComponentAccessor<EntityStore> componentAccessor)
  private void navigateUp(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, ComponentAccessor<EntityStore> componentAccessor)
  private void buildSubcommandTabs(AbstractCommand command, Player playerComponent, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  private void updateTitleWithBreadcrumb(UICommandBuilder commandBuilder)
  private void updateTitleWithVariantSuffix(UICommandBuilder commandBuilder)
  private void buildAliasesSection(AbstractCommand command, UICommandBuilder commandBuilder)
  private void buildPermissionSection(AbstractCommand command, UICommandBuilder commandBuilder)
  private void buildVariantsSection(AbstractCommand command, Player playerComponent, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  private void displayCommandInfo(AbstractCommand command, Player playerComponent, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  private Message getSimplifiedUsage(AbstractCommand command, Player playerComponent)
  private void buildParametersSection(AbstractCommand command, Player playerComponent, UICommandBuilder commandBuilder)
  private void buildArgumentTypesSection(AbstractCommand command, Player playerComponent, UICommandBuilder commandBuilder)

Fields:
private static final Value<String> BUTTON_LABEL_STYLE
private static final Value<String> BUTTON_LABEL_STYLE_SELECTED
private final List<String> visibleCommands
private String searchQuery
private String selectedCommand
private String selectedSubcommand
private Integer selectedVariantIndex
private final List<String> subcommandBreadcrumb
private final String initialCommand
